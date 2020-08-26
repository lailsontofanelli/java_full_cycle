package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/")
    public String getUser() {
        System.out.println("request localhost:8080");
        return "<html>\n" +
                "<head></head\n" +
                "\n" +
                "<body>\n" +
                "\t<h1>Eu sou Full Cycle.</h1>\n" +
                "</body\n" +
                "</html>\n";
    }

}
