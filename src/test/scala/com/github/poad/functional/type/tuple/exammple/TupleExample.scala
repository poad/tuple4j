package com.github.poad.functional.`type`.tuple.exammple

object Exammple extends App {
  val pair = (123, "abc")
  println(pair._1)
  println(pair._2)

  val triple = (456L, List(123, 456), "def")
  println(triple._1)
  println(triple._2)
  println(triple._3)
}