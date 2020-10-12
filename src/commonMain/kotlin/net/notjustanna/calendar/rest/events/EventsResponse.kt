package net.notjustanna.calendar.rest.events

import kotlinx.serialization.Serializable
import net.notjustanna.calendar.model.CalendarEvent

@Serializable
data class EventsResponse(
    val events: List<CalendarEvent>
)

