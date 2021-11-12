package com.myProject.myProject.Util;

import com.myProject.myProject.Model.AdminUser;
import com.myProject.myProject.Model.CustomerUser;

import java.util.UUID;
/**  Suggested by Mr Arinze Anikwue in ADP3
 *   Added in by: Rachael Klein
 *   Reason: Used within System, updated Domain Model.
 *   Student no: 218 057 377
 *   Date: 01-07-2020
 *   Description: auto generateID
 */
public class GenerateID {


    public static String generateID(){

        return UUID.randomUUID().toString();
    }

    public static UUID generateIndexCustomerID(CustomerUser user){

        return UUID.randomUUID().fromString(user.toString());
    }

    public static UUID generateIndexAdminID(AdminUser user) {

        return UUID.randomUUID().fromString(user.toString());
    }


}
