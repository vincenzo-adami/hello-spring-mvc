package it.lessons.java.spring_hello;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class SpringHelloController {

  @GetMapping("/greeting")
  public String greeting(@RequestParam(name = "name") String name, Model model) {

    model.addAttribute("name", name);
    model.addAttribute("time",
        LocalTime.now().format(
            DateTimeFormatter.ofPattern("HH:mm")));

    return "greeting";
  }
}