/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Admin;
import model.Employee;

/**
 *
 * @author joyeuse
 */
public class InsertAdmin {
    public static void main(String[] args) {
         GeneralDao<Admin>dao=new GeneralDao<>(Admin.class);
        Admin ad1=new Admin("Manager","admin");
         dao.create(ad1);
          System.out.println("admin created successfully");
    }
    
}
