package Model;

import java.util.*;


public class TaskCounter {
    Map<TaskStatus, Integer> taskCounter = new HashMap<>();

    public void addTask(TaskStatus taskStatus) {
        taskCounter.put(taskStatus, taskCounter.getOrDefault(taskStatus, 0) + 1);
    }

    public int getCountsByStatus(TaskStatus taskStatus) {
        return taskCounter.get(taskStatus);
    }

    public int allTask() {
        return taskCounter.values().stream()
                .mapToInt(x -> x)
                .sum();
    }
}
