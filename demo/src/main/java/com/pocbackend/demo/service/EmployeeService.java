package com.pocbackend.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pocbackend.demo.entity.Employee;

import com.pocbackend.demo.entity.EmployeeBirthday;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    public List<Employee> getEmployees() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/employees.json");
        Employee[] employees = mapper.readValue(file, Employee[].class);
        return Arrays.asList(employees);
    }

    public List<EmployeeBirthday> getEmployeesBirthdays() {
        EmployeeBirthday emp1 = new EmployeeBirthday(
                "Romero Castro Juan Carlos",
                "Mayo - 01",
                "jromero@mail.com",
                "0979837483"
        );
        EmployeeBirthday emp2 = new EmployeeBirthday(
                "Barcos Hernandez Sebastian Hernan",
                "Mayo - 03",
                "hbarcos@mail.com",
                "0966557483"
        );
        EmployeeBirthday emp3 = new EmployeeBirthday(
                "Acai Intriago Janeth Bernardette",
                "Mayo - 05",
                "jacai@mail.com",
                "0978926827"
        );
        EmployeeBirthday emp4 = new EmployeeBirthday(
                "Lavezzi Ramos Sergio Andres",
                "Mayo - 08",
                "slavezzi@mail.com",
                "0992837463"
        );
        EmployeeBirthday emp5 = new EmployeeBirthday(
                "Pernambucano Santos Roberto Carlos",
                "Mayo - 10",
                "rpernambucano@mail.com",
                "0909182736"
        );
        EmployeeBirthday emp6 = new EmployeeBirthday(
                "Roque Varas Lucia Maria",
                "Mayo - 15",
                "lroque@mail.com",
                "0944444832"
        );
        EmployeeBirthday emp7 = new EmployeeBirthday(
                "William Sada Venus Roberta",
                "Mayo - 16",
                "vwilliam@mail.com",
                "0910928732"
        );
        EmployeeBirthday emp8 = new EmployeeBirthday(
                "Icaza Gonzalez Fausto Jose",
                "Mayo - 17",
                "ficaza@mail.com",
                "0979837483"
        );
        EmployeeBirthday emp9 = new EmployeeBirthday(
                "Sampietro Kendo Mario Luigi",
                "Mayo - 20",
                "msampietro@mail.com",
                "0910982298"
        );
        EmployeeBirthday emp10 = new EmployeeBirthday(
                "Benavides Otora Claudia Maria",
                "Mayo - 23",
                "cbenavides@mail.com",
                "0979855566"
        );
        EmployeeBirthday emp11 = new EmployeeBirthday(
                "Davila Romo Guillermo Carlos",
                "Mayo - 25",
                "gdavila@mail.com",
                "0911029375"
        );
        EmployeeBirthday emp12 = new EmployeeBirthday(
                "Infante Bage Geoconda Josefa",
                "Mayo - 28",
                "ginfante@mail.com",
                "0979837345"
        );
        return Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11, emp12);
    }

}
