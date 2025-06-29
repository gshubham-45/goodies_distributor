package com.goodies.distributor.goodies_distributor.controller;

import com.goodies.distributor.goodies_distributor.entity.EventDetails;
import com.goodies.distributor.goodies_distributor.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/events")
@CrossOrigin("*")
public class EventController {
    @Autowired
    private EventService eventService;

    // Create or Update an Event
    @PostMapping
    public ResponseEntity<EventDetails> createEvent(@RequestBody EventDetails event) {
        EventDetails savedEvent = eventService.saveEvent(event);
        return ResponseEntity.ok(savedEvent);
    }

    // Get all Events
    @GetMapping
    public ResponseEntity<List<EventDetails>> getAllEvents() {
        List<EventDetails> events = eventService.getAllEvents();
        return ResponseEntity.ok(events);
    }

    // Get a single Event by ID
    @GetMapping("/{id}")
    public ResponseEntity<EventDetails> getEventById(@PathVariable String id) {
        return eventService.getEventById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete an Event
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable String id) {
        eventService.deleteEventById(id);
        return ResponseEntity.noContent().build();
    }

    // update an element
    @PutMapping("/{id}")
    public ResponseEntity<?> updateEvent(@PathVariable String id, @RequestBody EventDetails updates) {
       eventService.updateEventQr(id, updates);
       return ResponseEntity.ok(updates);
    }

}
