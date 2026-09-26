package com.example.userreg.entity;

import jakarta.persistence.*;


    @Entity
    @Table(name="userreg")
    public class UserRegister {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private String email;
        private String phone;
        private String password;


        public UserRegister(){

        }

        public UserRegister(int id, String name, String email, String phone, String password) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "UserRegistration{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }


