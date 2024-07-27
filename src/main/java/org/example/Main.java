package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] developerNames = { "Alice", "Bob", "Charlie" };
        Company myCompany = new Company(1, "TechCorp", 1000000.50, developerNames);

        System.out.println(myCompany.toString());

        String[] healthPlan = { "Test Sigorta" };

        Employee myEmployee = new Employee(2, "Henry Miller", "email@email.com", "123124", healthPlan);

        System.out.println(myEmployee.toString());

    }
}
