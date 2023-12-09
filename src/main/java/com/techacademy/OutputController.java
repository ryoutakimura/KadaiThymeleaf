package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OutputController {
    @GetMapping("/output")
    public String postOutput() {
        return "output";
    }

}
