package com.example

class Calculator {
  @Loggable
  def checkSum(a: Int, b: Int): Int = a + b
}

object Dummy extends App {
  val calculator = new Calculator
  println(calculator.checkSum(1, 2))
}
