package com.java.core.eventmanagement.test;

import com.java.core.eventmanagement.dto.Event;
import com.java.core.eventmanagement.dto.Organizer;

public class Test {
    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        organizer.id=123l;
        organizer.name="Apple Inc";
        System.out.println(organizer);
        System.out.println(organizer.name);
        Event event = new Event(1l,"ios launch","Apple event");
        System.out.println(event.description);
    }
}
