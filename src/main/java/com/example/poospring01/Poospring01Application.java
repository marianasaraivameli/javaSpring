package com.example.poospring01;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Log4j2
public class Poospring01Application {

    public static void main(String[] args) {

        SpringApplication.run(Poospring01Application.class, args);
//        log.printf(Level.INFO, "Informação");
//        log.printf(Level.ERROR, "Erro");
//        log.printf(Level.WARN, "Warn");
    }

}
