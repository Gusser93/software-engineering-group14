package server.privilegemanagment;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.Package;
import server.restInterface.User;
import server.restInterface.Usergroup;

@objid ("cb243f26-1864-4d4c-93d5-c196ea565a79")
public class PrivilegeManager {
    @objid ("9ffe90a7-860b-43f6-a328-f2394e01688f")
    public void allowPackageAccessToUsers(Package p, List<User> u) {
    }

    @objid ("e567c53a-aec7-49f2-9c70-12d5b7426ab8")
    public void disallowPackageAccessToUsers(Package p, List<User> u) {
    }

    @objid ("4a24ddaf-4917-4918-b5d2-75c3d11d903d")
    public void disallowPackageAccessToUsergroup(Package p, Usergroup u) {
    }

    @objid ("8adcc023-c129-4fd7-9806-cd1a8094b676")
    public void allowPackageAccessToUsergroup(Package p, Usergroup u) {
    }

}
