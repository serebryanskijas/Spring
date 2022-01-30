package org.itstep;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @RequestMapping

    public String helloWord() {
        return "Hello World";
    }

    @RequestMapping("/by")

    public String by() {
        return "<p> Good bue </p>" + "<a href = '/'> Back </a>";

    }
}
