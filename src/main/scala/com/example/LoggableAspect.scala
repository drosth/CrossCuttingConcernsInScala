package com.example

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.{Around, Aspect}
import org.slf4j.Logger

@Aspect
class LoggableAspect {
  @Around("execution(* *.*(..)) && @annotation(loggable)")
  def before(joinPoint: ProceedingJoinPoint, loggable: Loggable): AnyRef = {
    val logger: Logger =
      org.slf4j.LoggerFactory.getLogger(joinPoint.getSignature.getDeclaringType)

    val start = System.currentTimeMillis()
    val result = joinPoint.proceed()
    val finish = System.currentTimeMillis()
    logger.info(
      s"**** ${joinPoint.getSignature.getName}: ${finish - start} millis")
    result
  }
}
