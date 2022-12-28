package DesignPatterns.ProxyDesignPattern;

import DesignPatterns.ProxyDesignPattern.Factory.EmployeeFactory;

public class Client {

    public static void main(String[] args) {
        EmployeeDAO employeeObject = EmployeeFactory.getEmployee();
        EmployeeDTO employeeDTO = EmployeeDTO.builder()
                .id("101")
                .firstName("rishabh")
                .lastName("goyal")
                .build();

        employeeObject.createUser("Admin", employeeDTO);
        employeeObject.deleteUser("User", "101");
    }
}
