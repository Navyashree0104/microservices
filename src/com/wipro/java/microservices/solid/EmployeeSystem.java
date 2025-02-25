package com.wipro.java.microservices.solid;

import java.util.ArrayList;
import java.util.List;

// Single Responsibility(SRP)
interface EmployeeInterface {
    void work();
    String getName();
}

// Employee base class
abstract class Employee implements EmployeeInterface {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
}

// Open-Closed(OCP)
// Subclasses extend functionality without modifying Employee class
class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing the team.");
    }
}

class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is writing code.");
    }
}

class SecurityGuard extends Employee {
    public SecurityGuard(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + " is ensuring security.");
    }
}

// Liskov Substitution(LSP) -subclass can replace the base class without breaking functionality

// Interface Segregation Principle (ISP) - Separate responsibilities
interface SalaryCalculator {
    double calculateSalary();
}

class FixedSalaryCalculator implements SalaryCalculator {
    private double baseSalary;

    public FixedSalaryCalculator(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

// Dependency Inversion(DIP) - High-level modules should not depend on low-level modules
class EmployeeManagement {
    private List<EmployeeInterface> employees = new ArrayList<>();

    public void addEmployee(EmployeeInterface employee) {
        employees.add(employee);
    }

    public void showWork() {
        for (EmployeeInterface employee : employees) {
            employee.work();
        }
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        EmployeeManagement system = new EmployeeManagement();
        
        Manager manager = new Manager("Alice", 80000);
        Developer developer = new Developer("Bob", 60000);
        SecurityGuard guard = new SecurityGuard("Charlie", 30000);
        
        system.addEmployee(manager);
        system.addEmployee(developer);
        system.addEmployee(guard);
        
        system.showWork();
    }
}
