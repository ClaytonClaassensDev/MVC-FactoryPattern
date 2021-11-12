package com.myProject.myProject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class AdminUser{

    @Id
    String adminID;

    String adminFirstName;
    String adminLastName;
    String adminEmail;
    String adminPassword;

    protected AdminUser(){

    }

    private AdminUser(Builder builder){

        this.adminID = builder.adminID;
        this.adminFirstName = builder.adminFirstName;
        this.adminLastName = builder.adminLastName;
        this.adminEmail = builder.adminEmail;
        this.adminPassword = builder.adminPassword;
    }

    public String getAdminID() {
        return adminID;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "adminID='" + adminID + '\'' +
                ", adminFirstName='" + adminFirstName + '\'' +
                ", adminLastName='" + adminLastName + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                '}';
    }

    public static class Builder{

        String adminID;
        String adminFirstName;
        String adminLastName;
        String adminEmail;
        String adminPassword;

        public Builder setAdminID(String adminID) {
            this.adminID = adminID;
            return this;
        }

        public Builder setAdminFirstName(String adminFirstName) {
            this.adminFirstName = adminFirstName;
            return this;
        }

        public Builder setAdminLastName(String adminLastName) {
            this.adminLastName = adminLastName;
            return this;
        }

        public Builder setAdminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            return this;
        }

        public Builder setAdminPassword(String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public AdminUser copy(AdminUser adminUser){

            AdminUser adminUser1 = adminUser;
            return adminUser1;
        }

        public AdminUser build(){

            return new AdminUser(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return adminID.equals(builder.adminID) &&
                    adminEmail.equals(builder.adminEmail);
        }

        @Override
        public int hashCode() {
            return Objects.hash(adminID, adminEmail);
        }
    }
}
