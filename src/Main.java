import Model.*;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("778779", "Michael");
        phoneBook.addContact("123456", "Michael");
        phoneBook.addContact("654321", "Anna");
        System.out.println(phoneBook.findNameByPhone("778779"));
        System.out.println(phoneBook.findAllPhonesByName("Michael"));
        System.out.println();
        Warehouse warehouse = new Warehouse();
        Product p1 = new Product("Milk", 1.49);
        Product p2 = new Product("Water", 0.49);
        Product p3 = new Product("Water", 0.99);
        warehouse.addProduct(0L, p1);
        warehouse.addProduct(1L ,p2);
        warehouse.addProduct(2L, p3);
        System.out.printf("%.2f\n", warehouse.allProductCost());
        System.out.println(warehouse.getArticlesByTitle("Water"));
        System.out.println();
        TaskCounter taskCounter = new TaskCounter();
        taskCounter.addTask(TaskStatus.NEW);
        taskCounter.addTask(TaskStatus.NEW);
        taskCounter.addTask(TaskStatus.DONE);
        taskCounter.addTask(TaskStatus.ACTIVE);
        System.out.println(taskCounter.getCountsByStatus(TaskStatus.NEW));
        System.out.println(taskCounter.allTask());
        System.out.println();
        StudentGrades studentGrades = new StudentGrades();
        studentGrades.addStudent("Alice");
        studentGrades.addStudent("Alice", List.of(85, 90, 92));
        studentGrades.addStudent("Bob", List.of(78, 82, 88));
        studentGrades.addStudent("Bob", List.of(90, 95));
        studentGrades.addStudent("Charlie", List.of(95, 100, 98));
        studentGrades.printAllStudents();
        System.out.println("==Average Grades==");
        studentGrades.getAllAverageGrades();

    }
}