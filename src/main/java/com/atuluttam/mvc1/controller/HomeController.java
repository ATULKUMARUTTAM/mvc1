package com.atuluttam.mvc1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class HomeController {
@RequestMapping("/")
public String indexpage()
{
     return "index";
}
     @RequestMapping ("/greet")
     public String welcome( Model m)
     {
        String myname= "Atul Kumar Uttam";
        m.addAttribute("name", myname);
        return "home";
    }


    @GetMapping("/add")
    public String calculatorform()
    {
        return "calculator" ;
    }
    @PostMapping ("/add")
    public  String addition(@RequestParam("num1") Integer a, @RequestParam("num2") Integer b, Model m)
    {

      m.addAttribute("num1", a);
      m.addAttribute("num2", b);
        Integer c= a+b;
        m.addAttribute("total", c);
        return "sum";
    }

    @GetMapping("/addemp")
    public String addempform()
    {
        return "EmployeeForm";
    }

   @PostMapping("/addemp")
    public String emp(@RequestParam("username") String name, @RequestParam("password") String pass, Model m)
    {
        m.addAttribute("username", name);
        m.addAttribute("password", pass);
       return "EmployeeData";
    }




}