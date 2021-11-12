package com.myProject.myProject.Factory;

import com.myProject.myProject.Model.AdminUser;
import com.myProject.myProject.Util.GenerateID;

public class AdminAccountFactory {

    public static AdminUser createAdminAccount(String email, String password){

        String adminID = GenerateID.generateID();

        AdminUser adminUser = new AdminUser.Builder()

                .setAdminID(adminID)
                //.setAdminFirstName(firstName)
                //.setAdminLastName(lastName)
                .setAdminEmail(email)
                .setAdminPassword(password).build();

        return adminUser;
    }

}
