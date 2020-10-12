package net.notjustanna.calendar.rest.events.crud

import kotlinx.serialization.Serializable
import net.notjustanna.calendar.model.CalendarEvent

@Serializable
data class PatchEventResponse(
    val status: PatchEventResponseStatus,
    val event: CalendarEvent?
)
