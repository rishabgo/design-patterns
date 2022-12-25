package DesignPatterns.ProxyDesignPattern;

public class Employee implements EmployeeDAO {

    @Override
    public void createUser(String permission, EmployeeDTO employeeDTO) {
        System.out.println("creating new user and persisting in db");
    }

    @Override
    public void deleteUser(String permission, String employeeId) {
        System.out.println("deleting user with id- " + employeeId);
    }
}
