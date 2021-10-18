package com.java.core.eventmanagement.manager;

import com.java.core.eventmanagement.dto.Event;

public class EventManagerImpl implements EventManager{
    @Override
    public Event create(Long id) {
        return new Event(id,"Apple inc","Desc");
    }

}
