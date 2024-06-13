package com.example.taskreminder;

import java.util.Scanner;

public class NotificationPreferences implements IFeature {
    private String notificationPreference;

    @Override
    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter notification preference (Email/SMS/None): ");
        notificationPreference = scanner.nextLine();
        System.out.println("Notification Preference: " + notificationPreference);
    }
}
