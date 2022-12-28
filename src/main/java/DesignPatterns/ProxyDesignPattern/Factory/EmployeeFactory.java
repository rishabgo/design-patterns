package DesignPatterns.ProxyDesignPattern.Factory;

import DesignPatterns.ProxyDesignPattern.EmployeeDAO;
import DesignPatterns.ProxyDesignPattern.EmployeeProxy;

public class EmployeeFactory {

    public static EmployeeDAO getEmployee() {
        return new EmployeeProxy();
    }
}
