package com.java.core.javanine;

public interface SendNotifications {
    /**
     Private methods in interface can be called from static as well as default methods
     in interface just the difference is
     Static method - to call static method object is not required it can be called
     directly using the interface name
     Default method- to call the default method object of class should be created
     */
    static void sendNotification()
    {

        System.out.println("\nEstablishing connection");
        connect();
        System.out.println("Sending single notification");
    }
    default void sendNotifications()
    {
        System.out.println("\nEstablishing connections");
        connect();
        System.out.println("Sending multiple notifications");
    }
    private static void connect()
    {
        System.out.println("Connecting to server");
    }
}
