package com.s;


class Employee {
 private String name;
 private String position;
 private double baseSalary;

 public Employee(String name, String position, double baseSalary) {
     this.name = name;
     this.position = position;
     this.baseSalary = baseSalary;
 }

 public String getName() {
     return name;
 }

 public String getPosition() {
     return position;
 }

 public double getBaseSalary() {
     return baseSalary;
 }
 
 public double calculateSalary(Employee employee, double bonus, double taxRate) {
     double grossSalary = employee.getBaseSalary() + bonus;
     return grossSalary - (grossSalary * taxRate);
 }

 public void printEmployeeDetails(Employee employee) {
     System.out.println("Employee Name: " + employee.getName());
     System.out.println("Position: " + employee.getPosition());
 }

 public void saveToDatabase(Employee employee) {
     System.out.println("Saving employee " + employee.getName() + " to the database.");
 }
}

