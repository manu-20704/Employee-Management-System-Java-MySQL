package com.sjprogramming.EmployeeManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDaoIntrf dao= new EmployeeDaoImpl();
        System.out.println("Welcome to Employee Management Application");

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Add Employee");
            System.out.println("2. Show All Employees");
            System.out.println("3. Show Employee Based on Id");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    Employee emp=new Employee();
                    System.out.println("Enter Employee ID : ");
                    int id=sc.nextInt();
                    System.out.println("Enter Employee Name : ");
                    String name=sc.next();
                    System.out.println("Enter Employee Salary : ");
                    double salary=sc.nextDouble();
                    System.out.println("Enter Employee Age : ");
                    int age=sc.nextInt();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    dao.createEmployee(emp);
                    break;
                case 2:
                    dao.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter Employee ID to show Details : ");
                    int empid=sc.nextInt();
                    dao.showEmployeeBasedOnId(empid);
                    break;
                case 4:
                    System.out.println("Enter Employee ID to update Details : ");
                    int empid1=sc.nextInt();
                    System.out.println("Enter the new name : ");
                    String name1=sc.next();
                    dao.updateEmployee(empid1,name1);
                    break;
                case 5:
                    System.out.println("Enter Employee ID to delete : ");
                    int empid2=sc.nextInt();
                    dao.deleteEmployee(empid2);
                    break;
                case 6:
                    System.out.println("Thank you for using our Application");
                     System.exit(0);
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }while(true);
    }
}
