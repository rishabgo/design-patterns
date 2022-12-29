package DesignPatterns.ProxyDesignPattern.Factory;

import DesignPatterns.ProxyDesignPattern.IEmployeeDAO;
import DesignPatterns.ProxyDesignPattern.EmployeeProxy;

public class EmployeeFactory {

    public static IEmployeeDAO getEmployee() {
        return new EmployeeProxy();
    }
}
