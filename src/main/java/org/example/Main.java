package org.example;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // Healthplan objesi
        Healthplan healthplan1 = new Healthplan(1, "John's Plan", Plan.BASIC);
        System.out.println(healthplan1);

        // Employee objesi
        String[] healthplans = new String[3];
        Employee employee1 = new Employee(101, "John Doe", "john@example.com", "password123", healthplans);
        employee1.addHealthplan(0, "Premium Plan");
        System.out.println(employee1);

        // Company objesi
        String[] developers = new String[3];
        Company company1 = new Company(201, "Tech Corp", 50000, developers);
        company1.addEmployee(0, "John Doe");
        System.out.println(company1);
    }
}
