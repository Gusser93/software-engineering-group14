package server.logic;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.datasccess.Dataaccess;
import server.microkernel.WekaHandler;
import server.packagemanagment.PackageManager;
import server.pluginLoader.PluginLoader;
import server.privilegemanagment.PrivilegeManager;
import server.security.SecurityManager;
import server.usermanagment.UserManager;

@objid ("15c84ab3-42ea-434d-8e6e-767ad0df56e5")
public class Adapter {
    @objid ("f06c900f-90cb-47c2-b2e4-db181570f1d7")
    public static String sharedAdapter;

    @objid ("fb01651a-3e74-4eb5-8d63-c562ab3c0996")
    public PackageManager packageManager;

    @objid ("f9e13ae7-d7bc-4318-98bc-6f68cfe54892")
    public UserManager userManager;

    @objid ("e9e39cc0-eaad-49d2-96dc-3782d1046120")
    public PrivilegeManager privilegeManager;

    @objid ("12486373-9a7f-440d-b8b9-c0f35f22c902")
    public PluginLoader pluginLoader;

    @objid ("07eb4c4e-9275-4233-a37b-a58721bfe3d4")
    public Dataaccess dataaccess;

    @objid ("4cb62b9e-e4b0-4a47-a73f-b232413e5788")
    public SecurityManager securityManager;

    @objid ("d250233c-017f-446e-b734-4c46c9dc836b")
    private WekaHandler wekaHandler;

    @objid ("8e7262f3-23c0-4fb6-b624-62bd4f97ce68")
    public static Adapter getSharedAdapter() {
    }

    @objid ("54fac303-140a-4a89-a71c-44a0dc4286f7")
    WekaHandler getWekaHandler() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.wekaHandler;
    }

}
