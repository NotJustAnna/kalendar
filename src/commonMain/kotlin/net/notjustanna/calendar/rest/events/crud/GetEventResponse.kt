package net.notjustanna.calendar.rest.events.crud

import kotlinx.serialization.Serializable
import net.notjustanna.calendar.model.CalendarEvent

@Serializable
data class GetEventResponse(
    val status: GetEventResponseStatus,
    val event: CalendarEvent?
)
