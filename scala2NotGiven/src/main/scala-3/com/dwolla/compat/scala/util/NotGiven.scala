package com.dwolla.compat.scala.util

type NotGiven[+A] = scala.util.NotGiven[A]
object NotGiven:
  export scala.util.NotGiven.given
