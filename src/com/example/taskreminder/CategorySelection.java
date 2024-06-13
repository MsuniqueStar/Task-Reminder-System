package com.example.taskreminder;

import java.util.Scanner;

public class CategorySelection implements IFeature {
    private String taskCategory;

    @Override
    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task category: ");
        taskCategory = scanner.nextLine();
        System.out.println("Task Category: " + taskCategory);
    }
}
