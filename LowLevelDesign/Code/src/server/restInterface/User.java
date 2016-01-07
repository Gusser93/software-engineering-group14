package server.restInterface;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b7db5db0-fc28-4148-8f94-91037b2a1aee")
public class User {
    @objid ("13e9317b-cc89-4f1a-937b-68f72b2b4c9d")
    private String name;

    @objid ("58563c91-04e1-4076-9dee-8a409d9d20df")
    private String email;

    @objid ("46c4e78d-38c3-4b32-a649-b2180096f812")
    public float availableSpace;

    @objid ("cf6617d8-35eb-4d59-8d62-51608c406528")
    private String password;

    @objid ("f003e655-a601-481f-bfd1-66e85e5e00c5")
    public long id;

    @objid ("f1b378fd-c4e0-45f3-9273-00008da06e5e")
    public String uri;

    @objid ("e98991fc-208d-4483-a729-a5935f87708e")
    public List<Package> packages = new ArrayList<Package> ();

    @objid ("4695c7b6-ce43-4a31-ad7e-977fe8288ada")
    public List<Usergroup> usergroup = new ArrayList<Usergroup> ();

    @objid ("2850e270-5c0b-4e4f-9338-73dd7c36eb22")
    public boolean belongsToUsergroup(Usergroup ug) {
    }

    @objid ("fd00e17b-f442-43c8-8fbd-0f816fef1393")
    public User(String name, String email, String password) {
    }

    @objid ("efed2ec6-80cb-4e59-9e7b-02f83789814c")
    public String getName() {
    }

    @objid ("d94263f3-35e0-4020-a145-7f280c098b7e")
    public String getEmail() {
    }

    @objid ("0ed3a5a1-8ce3-47b3-bfcb-e9a7aa0306e5")
    public boolean correctLogin(User user2) {
    }

    @objid ("a6fc05b9-169f-48af-a3b3-0fd9d0b9ccfb")
    public User(String name, String password) {
    }

    @objid ("f0405707-2061-4d6b-bb5b-9f29c30349e8")
    public void login() {
    }

}
