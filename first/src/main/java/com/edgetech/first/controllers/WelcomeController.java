package com.edgetech.first.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class WelcomeController {
    //private WelcomeService service = new WelcomeService();
    //private StudentService student = new StudentService("Marcus", 36);
    private RandomStuff random = new RandomStuff();
    @RequestMapping("/welcome")
    public RandomStuff welcome() {
        //String name = "Marcus";
        //return service.returnsWelcomeMessage();
        //return "Student Name: " + student.getName() + "<br>Student Age: " + student.getAge();
        //return "Today is " + random.getCurrentDate().toString() + "<br>A random number: " + random.getRandomNumber();
        return random;
    }
    //http://localhost:8080/whatsmyname?name=Marcus&age=36
    @RequestMapping("/whatsmyname")
    public String myName (@RequestParam("name") String name, @RequestParam("age") int age){
        return "Your name is " + name + "<br>Your age is " + age;
    }
    @RequestMapping("/monthname")
    public String monthName(@RequestParam("month") int monthNum){
        String month;
        switch (monthNum){
            case 1: month="January"; break;
            case 2: month="February"; break;
            case 3: month="March"; break;
            case 4: month="April"; break;
            case 5: month="May"; break;
            case 6: month="June"; break;
            case 7: month="July"; break;
            case 8: month="August"; break;
            case 9: month="September"; break;
            case 10: month="October"; break;
            case 11: month="November"; break;
            case 12: month="December"; break;
            default: month="Set month equal to a number from 1 to 12 to get the month."; break;
        }
        return month;
    }
}

class WelcomeService {
    public String returnsWelcomeMessage() {
        return "Hello World";
    }
}

class StudentService {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentService(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class RandomStuff {
    private int randomNumber;
    private Date currentDate;

    public int getRandomNumber() {
        this.randomNumber = (int)Math.ceil(Math.random() * 100d);
        return randomNumber;
    }

    public Date getCurrentDate() {
        this.currentDate = new Date();
        return currentDate;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public RandomStuff() {
        this.randomNumber = (int)Math.ceil(Math.random() * 100d);
        this.currentDate = new Date();
    }
}