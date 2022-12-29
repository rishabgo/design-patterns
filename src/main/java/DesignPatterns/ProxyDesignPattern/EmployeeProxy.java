package DesignPatterns.ProxyDesignPattern;

public class EmployeeProxy implements IEmployeeDAO {

    private final EmployeeDAOImpl employee;

    public EmployeeProxy() {
        this.employee = new EmployeeDAOImpl();
    }

    @Override
    public void createUser(String permission, EmployeeDTO employeeDTO) {

        //check for permission to create user
        if(permission.equalsIgnoreCase("Admin") || permission.equalsIgnoreCase("User")){
            employee.createUser(permission, employeeDTO);
        }

        throw new RuntimeException("User don't have privilege to perform this operation.");
    }

    @Override
    public void deleteUser(String permission, String employeeId) {


        //check for permission to delete user
        if(!permission.equalsIgnoreCase("Admin")){
            throw new RuntimeException("User don't have privilege to perform this operation.");
        }

        employee.deleteUser(permission, employeeId);
    }
}
