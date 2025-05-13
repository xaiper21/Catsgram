package ru.yandex.practicum.catsgram.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @RequestMapping
    public String homePage() {
        return "<h1>Приветствуем вас, в приложении Котограм<h1>";
    }

}
