package ru.shininghills;

import org.springframework.stereotype.Controller;
import ru.shininghills.dto.StudentData;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
//    @GetMapping("/student") // alternative to @RequestMapping.GET
//    @ResponseBody// not needed to use cuz of @RestController. using only with @Controller
    public String helloStudent() {
        return "Hello student!";
    }

    @RequestMapping(value = "/greetings/{name}")
    public String greetingByName(@PathVariable String name) {
        return "Hello, " + name;
    }

    @RequestMapping(value = "/student/submit", method = RequestMethod.POST)
    public String giveMeFeedbackAboutGrade(@RequestBody StudentData studentData) {
        return "You're great with your grade " + studentData.getGrade();
    }
}
