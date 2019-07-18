package com.hncy.requests

import com.hncy.config.Config.login_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object LoginRequest {

//  val sentHeaders = Map("Authorization" -> "Basic Y2VtaXM6c2VjcmV0")
//
//  val user_login = exec(http("Login Request")
//    .post(login_url)
//    .headers(sentHeaders)
//    .formParam("username", "admin")
//    .formParam("password", "admin")
//    .formParam("grant_type", "password")
//    .check(status is 200))

  val sentHeaders = Map("Authorization" -> "Basic bWFuYWdlci1wb3J0YWw6MTIzNDU=")

  val user_login = exec(http("Login Request")
    .post(login_url)
    .headers(sentHeaders)
    .formParam("username", "admin")
    .formParam("password", "123456")
    .formParam("grant_type", "password")
    .check(status is 200))

}