package com.ylliu.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            Student student = objectMapper.readValue(new File("data/sample-lite.json"), Student.class);

            System.out.println(student.toString());
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
