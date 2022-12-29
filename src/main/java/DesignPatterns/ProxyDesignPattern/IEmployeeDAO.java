package DesignPatterns.ProxyDesignPattern;

public interface IEmployeeDAO {

    void createUser(String permission, EmployeeDTO employeeDTO);

    void deleteUser(String permission, String employeeId);
}
