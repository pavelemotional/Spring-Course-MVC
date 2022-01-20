package com.emotional.spring.mvc;

import com.emotional.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 3, message = "размер должен находиться в диапазоне от 3")
    @NotEmpty
    @NotBlank
    private String name;

    @Size(min = 4, message = "размер должен находиться в диапазоне от 4")
    @NotEmpty
    @NotBlank
    private String surname;

    @CheckEmail
    @Email
    private String email;

    @Pattern(regexp = "^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$", message = "please use pattern +12345678901")
    private String phoneNumber;

    @Min(value = 300)
    @Max(value = 1500)
    private int salary;

    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;


    public Employee() {
        departments = new HashMap<>();
        carBrands = new HashMap<>();
        languageList = new HashMap<>();

        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Human Resources");
        departments.put("Sales", "Sales");

        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("MB", "Mercedes-Benz");

        languageList.put("EN", "English");
        languageList.put("DE", "Deutch");
        languageList.put("FR", "French");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
