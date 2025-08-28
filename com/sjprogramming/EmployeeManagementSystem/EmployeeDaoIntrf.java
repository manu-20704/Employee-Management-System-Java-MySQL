package com.sjprogramming.EmployeeManagementSystem;

public interface EmployeeDaoIntrf {
    //Create Employee
    public void createEmployee(Employee emp);
    //show all Employee
    public void showAllEmployee();
    //Show Employees based on id
    public void showEmployeeBasedOnId(int id);
    //update Employee
    public void updateEmployee(int id, String name);
    //delete Employee
    public void deleteEmployee(int id);
}
