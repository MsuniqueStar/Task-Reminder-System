package com.example.taskreminder;

import java.util.Scanner;

public class TitleInput implements IFeature {
    private String taskTitle;

    @Override
    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task title: ");
        taskTitle = scanner.nextLine();
        System.out.println("Task Title: " + taskTitle);
    }
}
