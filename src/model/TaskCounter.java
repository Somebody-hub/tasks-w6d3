package model;

import java.util.*;


public class TaskCounter {
    Map<TaskStatus, Integer> taskCounter = new HashMap<>();

    public void addTask(TaskStatus taskStatus) {
        taskCounter.put(taskStatus, taskCounter.getOrDefault(taskStatus, 0) + 1);
    }

    public int getCountsByStatus(TaskStatus taskStatus) {
        return taskCounter.getOrDefault(taskStatus, 0);
    }

    public int allTask() {
        int sum = 0;
        for (Map.Entry<TaskStatus, Integer> entry : taskCounter.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
        /*
        return taskCounter.values().stream()
                .mapToInt(x -> x)
                .sum();

         */
    }
}
