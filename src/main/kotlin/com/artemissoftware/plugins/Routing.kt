package com.artemissoftware.plugins

import com.artemissoftware.room.RoomController
import com.artemissoftware.routes.chatSocket
import com.artemissoftware.routes.getAllMessages
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
