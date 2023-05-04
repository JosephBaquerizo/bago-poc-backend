package com.pocbackend.demo.service;

import com.pocbackend.demo.entity.Employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    public List<Employee> getEmployees() {
        Employee emp1 = new Employee(
                "Rodriguez Paz Carlos Alberto",
                new Date(),
                "crodriguez@mail.com",
                "0979812738",
                "Ecuador",
                "Diaz Luis",
                "nuevo",
                80,
                true
        );
        Employee emp2 = new Employee(
                "Romero Intriago Esmeralda Rubi",
                new Date(),
                "eromero@mail.com",
                "0988812738",
                "Panama",
                "Icaza Carlos",
                "calificado",
                30,
                false
        );
        Employee emp3 = new Employee(
                "Jaen Mendoza Juan Jose",
                new Date(),
                "jjaen@mail.com",
                "0979810000",
                "Eslovenia",
                "Martinez Lionel",
                "no calificado",
                10,
                true
        );
        Employee emp4 = new Employee(
                "Spencer Garcia Andres Jose",
                new Date(),
                "aspencer@mail.com",
                "0955446738",
                "Egipto",
                "Santos Victor",
                "renovado",
                80,
                true
        );
        Employee emp5 = new Employee(
                "Echeverria Sion Samir Alexander",
                new Date(),
                "secheverria@mail.com",
                "0900088755",
                "Paraguay",
                "Firminho Roberto",
                "negociacion",
                90,
                false
        );
        Employee emp6 = new Employee(
                "Toral Jere Carla Alejandra",
                new Date(),
                "ctoral@mail.com",
                "0911111711",
                "Ecuador",
                "Valarezo Esteban",
                "nuevo",
                60,
                false
        );
        Employee emp7 = new Employee(
                "Toledo Rescalvo Beyonce Maria",
                new Date(),
                "btoledo@mail.com",
                "0933312722",
                "Bolivia",
                "Estupinan Pervis",
                "negociacion",
                40,
                true
        );
        Employee emp8 = new Employee(
                "Dzeko Murillo Mauro Ricardo",
                new Date(),
                "mdzeko@mail.com",
                "0979855667",
                "Ecuador",
                "Caicedo Moises",
                "calificado",
                70,
                true
        );
        Employee emp9 = new Employee(
                "Correa Delgado Ericka Josefina",
                new Date(),
                "ecorrea@mail.com",
                "09798132897",
                "Paraguay",
                "Royal Emerson",
                "renovacion",
                70,
                false
        );
        Employee emp10 = new Employee(
                "Marquez Orrantia Maria Jose",
                new Date(),
                "mmarquez@mail.com",
                "0979811223",
                "Eslovenia",
                "Nunez Darwin",
                "calificado",
                50,
                true
        );
        Employee emp11 = new Employee(
                "Jimenez Baquero Saul Alberto",
                new Date(),
                "sjimenez@mail.com",
                "0979833447",
                "Ecuador",
                "Dias Ruben",
                "no calificado",
                100,
                false
        );
        Employee emp12 = new Employee(
                "Nesta Guedes Gonzalo Bruno",
                new Date(),
                "gnesta@mail.com",
                "0979845678",
                "Bolivia",
                "Torres Diego",
                "nuevo",
                20,
                true
        );
        return List.of(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11, emp12);
    }

}
