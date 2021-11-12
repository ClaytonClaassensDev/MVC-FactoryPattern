package com.myProject.myProject.Factory;

import com.myProject.myProject.Model.CustomerUser;
import com.myProject.myProject.Util.GenerateID;

public class CustomerAccountFactory {

    public static CustomerUser createUserAccount(String firstName, String lastName, String email, String password){

        String userID = GenerateID.generateID();

        CustomerUser customerUser = new CustomerUser.Builder()
                .setId(GenerateID.generateID())
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .build();
        
        return customerUser;
    }
}
