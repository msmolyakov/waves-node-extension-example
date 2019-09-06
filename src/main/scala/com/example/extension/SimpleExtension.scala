package com.example.extension

import com.wavesplatform.extensions.{Extension, Context => ExtensionContext}
import com.wavesplatform.utils.ScorexLogging
import net.ceedubs.ficus.Ficus._
import com.example.extension.settings.SimpleSettings
import monix.eval.Task
import monix.execution.Scheduler.Implicits.global
import monix.reactive.Observable

import scala.concurrent.Future

class SimpleExtension(context: ExtensionContext) extends Extension with ScorexLogging {

  private[this] val settings = context.settings.config.as[SimpleSettings]("simple-extension")

  override def start(): Unit = {}

  override def shutdown(): Future[Unit] = ???

}
