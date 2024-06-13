package com.example.taskreminder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleReminders implements IFeature {
    private List<String> reminders = new ArrayList<>();

    @Override
    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        String reminder;
        do {
            System.out.print("Enter a reminder (or 'done' to finish): ");
            reminder = scanner.nextLine();
            if (!reminder.equalsIgnoreCase("done")) {
                reminders.add(reminder);
            }
        } while (!reminder.equalsIgnoreCase("done"));
        System.out.println("Reminders: " + reminders);
    }
}
