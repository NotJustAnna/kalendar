package net.notjustanna.calendar.rest.events.crud

import kotlinx.serialization.Serializable
import net.notjustanna.calendar.model.CalendarEvent

@Serializable
data class CreateEventResponse(
    val status: CreateEventResponseStatus,
    val event: CalendarEvent?
)
