package clientHandler.userspace.adminMvc;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.User;
import server.restInterface.Usergroup;

@objid ("e16d0f9f-5553-4c8f-b0a2-aeb4bf62ca41")
public class AdminModel {
    @objid ("11895046-007a-4226-9eb4-c1098c2b27b9")
    public User user;

    @objid ("51eb8118-bdca-4b0d-9c62-47d5a3b13bdd")
    public Usergroup userGrp;

}
