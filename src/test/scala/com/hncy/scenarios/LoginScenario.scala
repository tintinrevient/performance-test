package com.hncy.scenarios

import com.hncy.requests.{LoginRequest}
import io.gatling.core.Predef.scenario

object LoginScenario {

  val loginScenario = scenario("Login Scenario").exec(LoginRequest.user_login)
}