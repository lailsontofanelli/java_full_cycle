package controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "controller" })
public class WebServiceApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(WebServiceApp.class).run(args);
        System.out.println("---- Application UP ------");
    }

}
