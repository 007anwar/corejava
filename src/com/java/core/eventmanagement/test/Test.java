package com.java.core.eventmanagement.test;

import com.java.core.eventmanagement.dto.Event;
import com.java.core.eventmanagement.dto.Organizer;
import com.java.core.eventmanagement.manager.EventManagerImpl;

public class Test {
    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        organizer.setId(123l);
        organizer.setName("Apple Inc");
        System.out.println(organizer);
        System.out.println(organizer.getName());
        Event event = new Event(1l,"ios launch","Apple event");
        System.out.println(event.getDescription());
        EventManagerImpl eventManager = new EventManagerImpl();
        Event event1 = eventManager.create(123l);
        System.out.println(event1);
    }
}
