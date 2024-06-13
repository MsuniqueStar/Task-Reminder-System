package com.example.taskreminder;

import java.util.Scanner;

public class DescriptionField implements IFeature {
    private String taskDescription;

    @Override
    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task description: ");
        taskDescription = scanner.nextLine();
        System.out.println("Task Description: " + taskDescription);
    }
}
