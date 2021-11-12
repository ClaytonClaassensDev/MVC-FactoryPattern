package com.myProject.myProject.Controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.myProject.myProject.Factory.AdminAccountFactory;
import com.myProject.myProject.Model.AdminUser;
import com.myProject.myProject.Model.CustomerUser;
import com.myProject.myProject.Repository.Admin.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.View;

@Controller
public class HomeController {

    @Autowired
    private AdminRepository adminRepository;

    @GetMapping(value = "/")
    public String index(){

        return "index";
    }

    @PostMapping(value = "/login", consumes = "application/json")
    public String login(@RequestBody(required = false) AdminUser adminUser){

        System.out.printf(adminUser.toString());
        String adminEmail = adminUser.getAdminEmail();
        String adminPassword = adminUser.getAdminPassword();

        AdminUser adminAccount = AdminAccountFactory.createAdminAccount(adminEmail, adminPassword);
        return adminRepository.save(adminAccount).toString();

    }


}
