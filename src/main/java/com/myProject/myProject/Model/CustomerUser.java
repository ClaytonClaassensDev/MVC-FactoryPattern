package com.myProject.myProject.Model;

public class CustomerUser {

    String id;
    String firstName;
    String lastName;
    String email;
    String password;

    public CustomerUser(Builder builder){

    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    public static class Builder{

        String id;
        String firstName;
        String lastName;
        String email;
        String password;


        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public CustomerUser build(){

            return new CustomerUser(this);
        }
    }


}
