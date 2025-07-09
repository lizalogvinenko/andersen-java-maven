package io.github.lizalogvinenko.lesson_8;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Anna Smith", "Sales Manager", "anna.smith@example.com", "+1 202-555-0143", 75000, 29);
        employees[1] = new Employee("Igor Ivanov", "Software Developer", "igor.ivanov@example.com", "+7 495 123-45-67", 120000, 49);
        employees[2] = new Employee("Elena Müller", "HR Specialist", "elena.mueller@example.com", "+49 30 12345678", 80000, 32);
        employees[3] = new Employee("Maxime Dupont", "QA Engineer", "maxime.dupont@example.com", "+33 1 23 45 67 89", 95000, 27);
        employees[4] = new Employee("Yuki Tanaka", "Accountant", "yuki.tanaka@example.com", "+81 3-1234-5678", 70000, 41);

        for (Employee employee : employees) {
            int age = employee.getAge();
            if (age > 40) {
                employee.printInfo();
            }
        }
    }
}
