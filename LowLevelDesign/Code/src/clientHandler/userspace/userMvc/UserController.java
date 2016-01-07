package clientHandler.userspace.userMvc;

import clientHandler.userspace.login.LoginSession;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.Usergroup;

@objid ("0fbb2dfd-a02f-4580-8fdd-b38e04b1fcca")
public class UserController {
    @objid ("3adbe720-785f-4271-95a3-fd22d25b4f23")
    public UserView userView;

    @objid ("5e08cd88-1f09-4bed-a22a-29248a2019a1")
    private LoginSession loginSession;

    @objid ("0efa6a16-95be-4683-bf1c-61f4131ef90c")
    public void showOwnGroups() {
    }

    @objid ("3e020a4b-bea7-4ec9-a9cd-14cbb79be05d")
    public void changePassword(String oldPW, String newPW) {
    }

    @objid ("5fb1b437-bd48-46ce-ad6d-aa7a72ac2e9f")
    public void changeEmail(String email) {
    }

    @objid ("71699d06-5740-416e-a910-696a16064d18")
    public void leaveGroup(Usergroup userGrp) {
    }

}
