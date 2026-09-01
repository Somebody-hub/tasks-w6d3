package Model;

import java.util.*;

public class StudentGrades {
    Map<String, List<Integer>> studentGrades = new HashMap<>();

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
        studentGrades.forEach((student, grades) -> {
            System.out.println(student + ": " + grades);
        });
    }

    public void getAllAverageGrades() {
        studentGrades.forEach((student, grade) -> {
            double avg = grade.stream()
                    .mapToDouble(x -> x)
                    .average()
                    .orElse(0.0);
            System.out.printf("%s average grade: %.2f\n", student, avg);
        });
    }

}
