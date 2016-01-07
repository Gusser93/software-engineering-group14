package server.usermanagment;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.User;
import server.restInterface.Usergroup;

@objid ("591e818f-df3a-4eab-ba87-066a569de5b0")
public class UserManager {
    @objid ("ebac49f8-7446-4b8c-9025-707c71b07f39")
    public List<User> users = new ArrayList<User> ();

    @objid ("e4532450-3043-49a3-b633-97e31056314b")
    public List<Usergroup> usergroups = new ArrayList<Usergroup> ();

    @objid ("d7c882e7-0f59-498e-8faf-38f441ebdba3")
    public boolean registerUser(User u) {
    }

    @objid ("3775ae16-21a9-44cd-b0c9-bd4b59bba992")
    public boolean loginUser(User u) {
    }

    @objid ("89a34ef3-34e0-4058-8945-b581f68acf41")
    public boolean addUserToGroup(User u, Usergroup ug) {
    }

    @objid ("119b0830-9a93-4cc6-8927-fdeb221f0c2d")
    public boolean removeUserFromGroup(User u, Usergroup ug) {
    }

    @objid ("17375351-6f47-4d9a-8b59-c0c6cbbde141")
    public Usergroup getAnonymousGroup() {
    }

    @objid ("e2038d5c-0ef3-4972-9522-218cefa38018")
    public Usergroup getAdminGroup() {
    }

    @objid ("d900a3d5-0bb0-42c9-835e-d1199b4facdf")
    public boolean userExists() {
    }

    @objid ("cfe36a6f-97ff-4416-8938-4b3bc2db8ac1")
    public boolean deleteUsers(List<User> u) {
    }

    @objid ("a4ee72f7-6585-4c1d-9cd5-402b5eca3453")
    public boolean deleteUsergroups(List<Usergroup> ug) {
    }

    @objid ("a1f155f9-5a1e-43d9-8a61-741226506caf")
    public float getAvailableSpaceForUser(User u) {
    }

    @objid ("76a548d6-58b5-43f9-a0aa-a1170d381d99")
    public void createDefaultGroupForUser(User u) {
    }

    @objid ("9ffcb1c2-70f4-43be-a86b-eae8a9b11b8f")
    public void checkForAutomaticDataRemoval() {
    }

    @objid ("c37fdb05-b256-4574-8e03-83a6658ef0f9")
    public User getUserWithID(User u) {
    }

    @objid ("f7f9f0ac-2c20-43a8-8e8e-fb3501beca33")
    public Usergroup getUserGroupWithID(long id) {
    }

}
