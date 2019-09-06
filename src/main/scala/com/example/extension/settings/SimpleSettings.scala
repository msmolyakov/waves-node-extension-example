package com.example.extension.settings

import net.ceedubs.ficus.Ficus._
import net.ceedubs.ficus.readers.ArbitraryTypeReader.arbitraryTypeValueReader
import net.ceedubs.ficus.readers.ValueReader
import net.ceedubs.ficus.readers.namemappers.implicits.hyphenCase

case class SimpleSettings(
                           enable: Boolean,
                           group: GroupSettings
                         )

case class GroupSettings(
                          firstOption: String,
                          secondOption: Seq[Int]
                        )

object SimpleSettings {
  implicit val valueReader: ValueReader[SimpleSettings] = arbitraryTypeValueReader
}

object GroupSettings {
  implicit val valueReader: ValueReader[GroupSettings] = arbitraryTypeValueReader
}
