package com.emotional.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") @Valid Employee employee,
                                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "ask-emp-details-view";
        return "show-employee-details";
    }

//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr." + empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", "Java learning...");
//        return "show-employee-details";
//    }
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(
//            @RequestParam("employeeName") String empName,
//            @RequestParam("employeeSurname") String empSurname,
//            @RequestParam("employeeSalary") int empSalary, Model model) {
//        model.addAttribute("nameAttribute", "Mr " + empName);
//        model.addAttribute("surnameAttribute", empSurname);
//        model.addAttribute("salaryAttribute", empSalary);
//        return "show-employee-details";
//    }
}
