package io.github.tintinrevient.simulations

import io.github.tintinrevient.scenarios.LoginScenario
import io.github.tintinrevient.config.Config._
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._
import scala.concurrent.duration._
import io.github.tintinrevient.scenarios.PingScenario

class DemoSimulation extends Simulation {

  private val loginExec = LoginScenario.loginScenario.inject(
//    nothingFor(4 seconds), // 1
//    atOnceUsers(10), // 2
//    rampUsers(1000) during (5 seconds), // 3
//    constantUsersPerSec(20) during (15 seconds), // 4
//    constantUsersPerSec(20) during (15 seconds) randomized, // 5
//    rampUsersPerSec(10) to 20 during (10 minutes), // 6
//    rampUsersPerSec(10) to 20 during (10 minutes) randomized, // 7
//    heavisideUsers(1000) during (20 seconds) // 8
    incrementConcurrentUsers(100) // 9
      .times(100)
      .eachLevelLasting(20 seconds)
      .separatedByRampsLasting(10 seconds)
      .startingFrom(0)
  )

  private val pingExec = PingScenario.pingScenario.inject(
    incrementConcurrentUsers(100)
          .times(100)
          .eachLevelLasting(20 seconds)
          .separatedByRampsLasting(10 seconds)
          .startingFrom(0)
  )

  setUp(pingExec).maxDuration(3 minutes)

}