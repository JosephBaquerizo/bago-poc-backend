package com.pocbackend.demo.entity;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class EmployeeSerializer extends JsonSerializer<Employee> {

    @Override
    public void serialize(Employee employee, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("name", employee.getName());
        jsonGenerator.writeStringField("birthday", employee.getBirthday().toString());
        jsonGenerator.writeStringField("email", employee.getEmail());
        jsonGenerator.writeStringField("telephone", employee.getTelephone());
        jsonGenerator.writeStringField("country", employee.getCountry());
        jsonGenerator.writeStringField("agent", employee.getAgent());
        jsonGenerator.writeStringField("status", employee.getStatus());
        jsonGenerator.writeStringField("activity", employee.getActivity());
        jsonGenerator.writeBooleanField("verified", employee.isVerified());
        jsonGenerator.writeEndObject();
    }

}
