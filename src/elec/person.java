/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author m
 */
public class person {
    private String name;
    private String passward;
    private String city;
    private String adress;
    private String region;
    private String email;
    private int phone;
    private int mater;
    private String complain;
    

    public person() {
    }
    
    public void setMater(int mater) {
        this.mater = mater;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
    
    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getMater() {
        return mater;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }
    
    
    

    public String getName() {
        return name;
    }

    public String getPassward() {
        return passward;
    }

    public String getAdress() {
        return adress;
    }

    public String getRegion() {
        return region;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getComplain() {
        return complain;
    }
    
    
    

    public int getPhone() {
        return phone;
    }
    
    
    public person(String name, String adress, String region, String email, int phone,String city) {
        this.name = name;
        this.adress = adress;
        this.region = region;
        this.email = email;
        this.phone = phone;
        this.city=city;
    }

    void getMater(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

        
        
    }
    
        
    
       
        
    
       
        
    
       
        
    

    
    