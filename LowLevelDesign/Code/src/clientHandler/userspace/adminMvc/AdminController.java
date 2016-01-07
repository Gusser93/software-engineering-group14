package clientHandler.userspace.adminMvc;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.User;
import server.restInterface.Usergroup;
import server.usermanagment.UserManager;

@objid ("5eef1815-2d18-4711-990e-affe3f344921")
public class AdminController {
    @objid ("ed016006-a626-4582-aa70-3cc6e77106bb")
    private UserManager userMngr;

    @objid ("d3e26f9a-c908-4090-a5b0-673aa4cad7a1")
    public AdminView adminView;

    @objid ("c70ba96c-db8c-4776-9fb8-0e4383999108")
    private AdminModel adminModel;

    @objid ("a60a00e4-5058-42de-9cc2-1f3c3d7f8b44")
    public void registerUser(User user) {
    }

    @objid ("24e7fba3-b315-45f7-9ade-8da2dd726c90")
    public void addUserToGroup(User user, Usergroup userGrp) {
    }

    @objid ("d9689085-7343-40ea-aab9-9513133363f7")
    public void removeUserFromGroup(User user, Usergroup userGrp) {
    }

    @objid ("9e7378b3-46f7-45c0-aed6-d64238972daa")
    public void deleteUser(User user) {
    }

    @objid ("c7aab0d6-b5ce-4171-b151-8b4713cdc2c8")
    public void deleteUserGroup(Usergroup userGrp) {
    }

    @objid ("29311a5a-5548-46f4-a2b6-4ba63166496d")
    public void makeAdmin(User user) {
    }

    @objid ("286c95b7-d4ac-4074-b3fe-2733f3669c7b")
    UserManager getUserMngr() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.userMngr;
    }

    @objid ("b2af5733-9ba2-4eee-b137-cec975f6ba46")
    void setUserMngr(UserManager value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.userMngr = value;
    }

}
