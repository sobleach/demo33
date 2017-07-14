package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Thum on 7/14/2017 AD.
 */

@Component
@ConfigurationProperties(prefix = "myApp")
public class AppConfig {

    /*All value is mapping with application.yml file*/
    private String comming;
    private String car;
    private String salary;
    private final Phone phone = new Phone();

    public String getComming() {
        return comming;
    }

    public void setComming(String comming) {
        this.comming = comming;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Phone getPhone() {
        return phone;
    }

    static class Phone{
        private String smart;
        private String feature;

        public String getSmart() {
            return smart;
        }

        public void setSmart(String smart) {
            this.smart = smart;
        }

        public String getFeature() {
            return feature;
        }

        public void setFeature(String feature) {
            this.feature = feature;
        }

        @Override
        public String toString() {
            return "Phone{" +
                    "smart='" + smart + '\'' +
                    ", feature='" + feature + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AppConfig{" +
                "comming='" + comming + '\'' +
                ", car='" + car + '\'' +
                ", salary='" + salary + '\'' +
                ", phone=" + phone +
                '}';
    }
}
