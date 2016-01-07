package clientHandler.servlets;

import javax.servlet.http.HttpServlet;
import clientHandler.entity.entityMvc.EntityController;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.fabric.EntityFabric;

@objid ("36adde6b-7865-451a-b023-b8f74653d4aa")
public abstract class EntityServlet extends HttpServlet {
    @objid ("0edc50b1-b1a1-4fdb-8ce6-5127961e6e80")
    public EntityController entityController;

    @objid ("65eb4d7c-baa1-43b7-9793-84afc4dab9e3")
    public EntityFabric entityFabric;

}
