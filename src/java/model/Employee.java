/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 *
 * @author joyeuse
 */
@Entity
public class Employee {
  @Id
  private String id;
  private String name;
  private int age;
  private String gender;
  private String category;
  private int amount;
  
  @ManyToOne
   private Client user;

    public Client getUser() {
        return user;
    }

    public void setUser(Client user) {
        this.user = user;
   }

    public Employee() {
    }

    public Employee(String id, String name, int age, String gender, String category, int amount, Client user) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.category = category;
        this.amount = amount;
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

   
   
  
    
}
