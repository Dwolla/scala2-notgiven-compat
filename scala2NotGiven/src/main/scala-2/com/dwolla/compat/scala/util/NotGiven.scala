package com.dwolla.compat.scala.util

import scala.annotation.{implicitAmbiguous, unused}

sealed trait NotGiven[A]

object NotGiven {
  implicit def notGiven[A]: NotGiven[A] = new NotGiven[A] {}

  @implicitAmbiguous("Found an implicit value of type ${A}, so NotGiven[${A}] cannot be satisfied.")
  implicit def amb1[A](implicit @unused ev: A): NotGiven[A] = null
  implicit def amb2[A](implicit @unused ev: A): NotGiven[A] = null
}
