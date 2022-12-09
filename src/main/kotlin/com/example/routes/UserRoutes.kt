package com.example.routes

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.staticRoutes() {
    route("/files"){
        get{
            call.respondText("Welcome to our app files & assets")
        }
        static("/statics") {
            resources("static")
        }
    }
}