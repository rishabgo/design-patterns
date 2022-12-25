package DesignPatterns.ProxyDesignPattern;

public interface EmployeeDAO {

    void createUser(String permission, EmployeeDTO employeeDTO);

    void deleteUser(String permission, String employeeId);
}
