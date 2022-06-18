/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;

import dao.GeneralDao;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import model.Client;

/**
 *
 * @author joyeuse
 */
@Path("formm")
public class clientemp {
  private Client client=new Client();
private GeneralDao<Client> edao=new GeneralDao<>(Client.class);

  @POST
    public void save(Client cli){
            edao.create(cli);   
    }



    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public GeneralDao<Client> getEdao() {
        return edao;
    }

    public void setEdao(GeneralDao<Client> edao) {
        this.edao = edao;
    }


    
}
