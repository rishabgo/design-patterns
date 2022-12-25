package DesignPatterns.ProxyDesignPattern;

public class Client {

    public static void main(String[] args) {
        EmployeeDAO employeeObject = new EmployeeProxy();
        EmployeeDTO employeeDTO = EmployeeDTO.builder()
                .id("101")
                .firstName("rishabh")
                .lastName("goyal")
                .build();

        employeeObject.createUser("Admin", employeeDTO);
        employeeObject.deleteUser("User", "101");
    }
}
