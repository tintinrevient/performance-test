package io.github.tintinrevient.config

object Config {
//  val login_url = "http://auth.hncy.com/auth/oauth/token"
//  val ping_url = "http://auth.hncy.com/auth/ping"

  val login_url = "http://192.168.0.171/oauth/token"
  val ping_url = "http://192.168.0.172:8181/ping"

  val users = Integer.getInteger("users", 100).toInt
  val rampUp = Integer.getInteger("rampup", 1).toInt
}