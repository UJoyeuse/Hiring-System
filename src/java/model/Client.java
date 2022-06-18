package model;


import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joyeuse
 */
 @Entity
public class Client {
    @Id
    private String NationalId;
    private String name;
    private String contact;
    private String Email;
   
     @OneToMany(mappedBy ="user")
     private List<Employee>company=new ArrayList<>();

    public List<Employee> getCompany() {
        return company;
    }

    public void setCompany(List<Employee> company) {
        this.company = company;
    }
     

    public Client() {
    }

    public Client(String NationalId, String name, String contact, String Email) {
        this.NationalId = NationalId;
        this.name = name;
        this.contact = contact;
        this.Email = Email;
      
    }

    public String getNationalId() {
        return NationalId;
    }

    public void setNationalId(String NationalId) {
        this.NationalId = NationalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
   
    
}
