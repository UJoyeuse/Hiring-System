/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;

import dao.GeneralDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import model.Client;
import model.Employee;

/**
 *
 * @author joyeuse
 */
@Path("list")

public class empreg {
    
 private Employee employee=new Employee();
private GeneralDao<Employee> edao=new GeneralDao<>(Employee.class);
private List<Employee>Employees;
 private String action = "issue";
 
     @GET
    public List<Employee>findAll(){
        return edao.listAll();
    }
    
     @POST
    public void create(Employee employy){
        
            edao.create(employy);
    }
       @PUT
       public void edit(Employee employy){
         
                edao.update(employy);
       }
      
      @DELETE       
   public void delete(Employee employy){
       edao.delete(employy);

   }
            
       
    
 


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public GeneralDao<Employee> getEdao() {
        return edao;
    }

    public void setEdao(GeneralDao<Employee> edao) {
        this.edao = edao;
    }

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void setEmployees(List<Employee> Employees) {
        this.Employees = Employees;
    }

   
    
 
   
 
 
}
