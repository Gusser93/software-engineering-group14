package clientHandler.userspace.login.loginMvc;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.User;

@objid ("7d7fe04d-6735-48ab-916b-1939aec60d47")
public class LoginModel {
    @objid ("4e001cf3-5074-4a64-a226-3f6088ed1d42")
    public User user;

    @objid ("344c2473-1947-459f-9de0-fb0e7226fa0e")
    public void login(String user, String pw) {
    }

}
