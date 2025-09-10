# Scala 2 `NotGiven` Compatibility Shim

Scala 3 introduced `scala.util.NotGiven`: a special class used to implement negation in implicit search.

While techniques existed to implement this functionality in Scala 2, the `NotGiven` trait was not
backported to Scala 2. This makes cross-compilation more frustrating than it needs to be, so this
library was created to make a single `com.dwolla.compat.scala.util.NotGiven` available to
Scala 2.12, 2.13, and 3.

This is based on prior work by [Shapeless](https://github.com/milessabin/shapeless/blob/1ba51fb26236a57ddf695cb547663306ecfa0900/core/shared/src/main/scala/shapeless/package.scala#L43-L45) and [fs2](https://github.com/typelevel/fs2/blob/fdaae8959ad5d64fa0d30d78d9821897e7148bcf/core/shared/src/main/scala-2/fs2/compat/NotGiven.scala#L26-L36).
