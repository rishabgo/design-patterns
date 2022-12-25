package DesignPatterns.ProxyDesignPattern;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDTO {

    private String id;
    private String firstName;
    private String lastName;
    //other meta data
}
