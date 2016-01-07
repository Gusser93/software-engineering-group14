package clientHandler.userspace.login.loginMvc;

import clientHandler.userspace.login.LoginSession;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.User;
import server.usermanagment.UserManager;

@objid ("d3d3ed19-cd3d-412e-bb92-3478fe4ce4fb")
public class LoginController {
    @objid ("34b8d1f2-5360-4064-b8c7-ed74b7635659")
    private UserManager userMngr;

    @objid ("fbfdc2ec-35e6-4618-8249-b69aa6037944")
    public LoginView loginView;

    @objid ("3d3c6e09-3b6b-4424-9cff-71e7fa13eb7b")
    private LoginModel loginModel;

    @objid ("281f0f4e-41d4-441b-848d-ff1f26b80af4")
    private LoginSession loginSession;

    @objid ("f9e855d7-02dc-4d5a-89e7-99bb0cc1f1bd")
    public void login(String user, String pw) {
    }

    @objid ("6fa9470b-b370-4da7-b2d1-a78ec457de3b")
    public void register(User user) {
    }

    @objid ("8f3dc26f-81cc-462d-ac8f-c55b4d6a78d1")
    public void logout() {
    }

    @objid ("4ca167e2-5a06-414f-9e01-7a63c707215c")
    UserManager getUserMngr() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.userMngr;
    }

    @objid ("1e2c6055-85f1-420d-992a-a9d5511ef31c")
    void setUserMngr(UserManager value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.userMngr = value;
    }

}
