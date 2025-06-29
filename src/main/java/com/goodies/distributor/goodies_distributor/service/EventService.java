package com.goodies.distributor.goodies_distributor.service;

import com.goodies.distributor.goodies_distributor.entity.EventDetails;
import com.goodies.distributor.goodies_distributor.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<EventDetails> getAllEvents() {
        return eventRepository.findAll();
    }

    public EventDetails saveEvent(EventDetails event) {
        return eventRepository.save(event);
    }

    // Get a single Event by ID
    public Optional<EventDetails> getEventById(String id) {
        return eventRepository.findById(id);
    }

    public void deleteEventById(String id) {
        eventRepository.deleteById(id);
    }

    public void updateEventQr(String id, EventDetails updates) {
        Optional<EventDetails> eventOpt = eventRepository.findById(id);
        if (eventOpt.isPresent()) {
            EventDetails event = eventOpt.get();
            event.setQrCodeUrl((String) updates.getQrCodeUrl());
            eventRepository.save(event);
        }
        return;
    }
}

