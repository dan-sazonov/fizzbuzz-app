package org.fizzbuzz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FizzBuzzController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/check")
    public String checkFizzBuzz(@RequestParam("number") int number, Model model) {
        String result = (number % 2 == 0) ? "Fizz" : "Buzz";
        model.addAttribute("result", result);
        return "index";
    }
}
