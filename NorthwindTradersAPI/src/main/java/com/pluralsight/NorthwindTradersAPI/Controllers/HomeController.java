package com.pluralsight.NorthwindTradersAPI.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

@RequestMapping(method = RequestMethod.GET)
public String helloWorld(@RequestParam(defaultValue = "World") String country) {
    return "Hello "+ country;
}
}
