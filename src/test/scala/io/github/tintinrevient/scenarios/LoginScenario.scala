package io.github.tintinrevient.scenarios

import io.github.tintinrevient.requests.{LoginRequest}
import io.gatling.core.Predef.scenario

object LoginScenario {

  val loginScenario = scenario("Login Scenario").exec(LoginRequest.user_login)
}