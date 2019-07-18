package io.github.tintinrevient.scenarios

import io.github.tintinrevient.requests.{PingRequest}
import io.gatling.core.Predef.scenario

object PingScenario {

  val pingScenario = scenario("Ping Scenario").exec(PingRequest.ping)
}