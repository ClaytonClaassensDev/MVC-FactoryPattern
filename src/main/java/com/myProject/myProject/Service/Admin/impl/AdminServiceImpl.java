package com.myProject.myProject.Service.Admin.impl;

import com.myProject.myProject.Model.AdminUser;
import com.myProject.myProject.Repository.Admin.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;
import java.util.stream.Collectors;

public class AdminServiceImpl {

    @Autowired
    private AdminRepository adminRepository;

    public AdminUser createAdminUser(AdminUser adminUser){

        this.adminRepository.save(adminUser);
        return adminUser;

    }

    public AdminUser readAdminUser(String id){

        return this.adminRepository.findById(id).orElse(null);

    }

    public AdminUser updateAdminUser(AdminUser adminUser){

        if(this.adminRepository.existsById(adminUser.getAdminID())){

            return this.adminRepository.save(adminUser);
        }
        return null;
    }

    public boolean deleteAdminUser(String id){

        this.adminRepository.deleteById(id);

        if(this.adminRepository.existsById(id)) return false;
        else return true;

    }

    public Set<AdminUser> getAllAdminUsers(){

        return this.adminRepository.findAll().stream().collect(Collectors.toSet());
    }




}
