package com.java.core.javanine;

public class SendNotifiactionImpl implements SendNotifications {
    public static void main(String[] args) {
        SendNotifiactionImpl obj = new SendNotifiactionImpl();
        SendNotifications.sendNotification();
        obj.sendNotifications();
    }
}
