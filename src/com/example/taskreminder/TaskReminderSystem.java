package com.example.taskreminder;

import java.util.ArrayList;
import java.util.List;

public class TaskReminderSystem {
    public static void main(String[] args) {
        List<IFeature> features = new ArrayList<>();

        // Add features based on command line arguments
        for (String arg : args) {
            switch (arg) {
                case "TitleInput":
                    features.add(new TitleInput());
                    break;
                case "DescriptionField":
                    features.add(new DescriptionField());
                    break;
                case "CategorySelection":
                    features.add(new CategorySelection());
                    break;
                case "MultipleReminders":
                    features.add(new MultipleReminders());
                    break;
                case "NotificationPreferences":
                    features.add(new NotificationPreferences());
                    break;
                case "PriorityLevels":
                    features.add(new PriorityLevels());
                    break;
                case "ColorCoding":
                    features.add(new ColorCoding());
                    break;
                default:
                    System.out.println("Unknown feature: " + arg);
                    break;
            }
        }

        // Initialize selected features
        for (IFeature feature : features) {
            feature.initialize();
        }
    }
}
