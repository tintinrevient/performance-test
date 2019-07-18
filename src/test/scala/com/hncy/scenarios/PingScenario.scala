package com.hncy.scenarios

import com.hncy.requests.{PingRequest}
import io.gatling.core.Predef.scenario

object PingScenario {

  val pingScenario = scenario("Ping Scenario").exec(PingRequest.ping)
}