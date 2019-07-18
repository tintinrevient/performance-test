package com.hncy.requests

import com.hncy.config.Config.ping_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object PingRequest {

  val ping = exec(http("Ping Request")
    .get(ping_url)
    .check(status is 200))
}