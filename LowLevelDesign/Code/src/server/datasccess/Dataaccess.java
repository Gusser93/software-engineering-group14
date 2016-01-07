package server.datasccess;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.Entity;
import server.restInterface.User;
import server.restInterface.Usergroup;

@objid ("1b441ebb-eaf5-4625-9fe0-6a851fc7fe7d")
public class Dataaccess {
    @objid ("89c3bdc9-ec4e-47d4-921c-ccf5be2260a8")
    public Entity getEntityFromDatabaseForID(long id) {
    }

    @objid ("9cd3adf7-7a80-490e-b32a-6294a7b41b18")
    public User getUserFromDatabseWithID(long id) {
    }

    @objid ("528dcd18-1156-4e49-b610-ec572e132fce")
    public Usergroup getUserGroupFromDatabseWithID(long id) {
    }

    @objid ("1c72ff6b-f8bd-4768-905b-78dcbe744237")
    public boolean saveEntityToDatabase(Entity e) {
    }

    @objid ("f49b53f4-ef78-44bb-9690-3dfcd49b3771")
    public boolean saveUserToDatabase(User u) {
    }

    @objid ("aea2c1d6-2190-4580-b6c8-e64cab0958a7")
    public boolean saveUsergroupToDatabase(Usergroup ug) {
    }

}
