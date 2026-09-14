package service;

import java.util.*;

public class StudentGrades {
    private final Map<String, List<Integer>> studentGrades = new HashMap<>();

    public void addStudent(String student) {
        if (!studentGrades.containsKey(student)) {
            studentGrades.put(student, new ArrayList<>());
        }
    }

    public void addStudent(String student, List<Integer> grades) {
        if (studentGrades.containsKey(student)) {
            studentGrades.get(student).addAll(grades);
        } else {
            studentGrades.put(student, new ArrayList<>(grades));
        }
    }

    public void printAllStudents() {
        studentGrades.forEach((student, grades) -> System.out.println(student + ": " + grades));
    }

    public void printAllAverageGrades() {
        for (Map.Entry<String, List<Integer>> entry : studentGrades.entrySet()) {
            int sum = 0;
            for (int grade : entry.getValue()) {
                sum += grade;
            }
            double avg = (double) sum / entry.getValue().size();
            System.out.printf("%s average grade: %.2f\n", entry.getKey(), avg);
        }
        /*studentGrades.forEach((student, grade) -> {
            double avg = grade.stream()
                    .mapToDouble(x -> x)
                    .average()
                    .orElse(0.0);
            System.out.printf("%s average grade: %.2f\n", student, avg);
        });
         */
    }

}
