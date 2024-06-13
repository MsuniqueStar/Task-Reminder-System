package com.example.taskreminder;

import java.util.Scanner;

public class PriorityLevels implements IFeature {
    private String priorityLevel;

    @Override
    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter priority level (High/Medium/Low): ");
        priorityLevel = scanner.nextLine();
        System.out.println("Priority Level: " + priorityLevel);
    }
}
