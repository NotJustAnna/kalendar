package net.notjustanna.calendar.rest.events.crud

import kotlinx.serialization.Serializable

@Serializable
data class DeleteEventResponse(
    val status: DeleteEventResponseStatus
)
