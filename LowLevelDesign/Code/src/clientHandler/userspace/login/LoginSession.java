package clientHandler.userspace.login;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.User;

@objid ("06c6f4ea-6c5c-4b5d-8e85-b886f5b2763f")
public class LoginSession {
    @objid ("789e948f-3e5b-4047-b686-04bb7c3a896c")
    private User currentUser;

    @objid ("8c4dc901-1091-4d1e-adb1-8a378462f1ad")
    public void destroySession() {
    }

    @objid ("42e8d8ae-ccef-41b1-bbd5-825c131bfcdd")
    public LoginSession(User currentUser) {
    }

    @objid ("a6c89752-0e4f-4eac-bd16-dc33911a27ab")
    User getCurrentUser() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.currentUser;
    }

    @objid ("024c9c3e-3f0b-4712-9120-ea0c2e3e0660")
    void setCurrentUser(User value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.currentUser = value;
    }

}
