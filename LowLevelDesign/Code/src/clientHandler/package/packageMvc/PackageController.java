package clientHandler.package.packageMvc;

import clientHandler.entity.entityMvc.EntityController;
import clientHandler.userspace.login.LoginSession;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.packagemanagment.PackageManager;
import server.privilegemanagment.PrivilegeManager;
import server.restInterface.Algorithm;
import server.restInterface.Dataset;
import server.restInterface.Entity;
import server.restInterface.Model;
import server.restInterface.Package;
import server.restInterface.User;
import server.restInterface.Usergroup;
import server.security.SecurityManager;

@objid ("3a1e3bcd-32f6-4b24-a433-6db8d7b3c156")
public class PackageController extends EntityController {
    @objid ("490f7653-3231-4e0a-812b-d32e44c8e638")
    private PackageManager packageMngr;

    @objid ("450acfce-2492-423a-9221-423554def544")
    private PrivilegeManager privilegeMngr;

    @objid ("26862e6b-8911-41cb-be25-eadf18669c59")
    private SecurityManager securityMngr;

    @objid ("369b8e1a-386f-4c26-a2b4-24d847429a73")
    public PackageView packageView;

    @objid ("f6ab661f-2a91-407c-84a4-2bc30910c208")
    private PackageModel packageModel;

    @objid ("b3a44921-1df3-4ad8-bae3-94c427c5568e")
    private LoginSession loginSession;

    @objid ("c41a4c74-0e7d-488e-953a-c8e56a4bdb43")
    public void allowPackageAccessToUsers(Package package, User users) {
    }

    @objid ("262373b5-9f73-4b2a-9cd9-580282291147")
    public void allowPackageAccessToUserGroup(Package package, Usergroup userGrp) {
    }

    @objid ("55ed8fb4-750c-404e-8af7-972b77495219")
    public void disallowPackageAccessToUsers(Package package, User users) {
    }

    @objid ("13a07bb2-1a12-48b8-a19d-cef0c9303dd1")
    public void disallowPackageAccessToUserGroup(Package package, Usergroup userGrp) {
    }

    @objid ("ba695590-3648-4fd9-be94-e0ef6f0dbea5")
    public void uploadAndSaveDataset(Package package, Dataset data) {
    }

    @objid ("bc4b4570-3c6d-4854-832f-db3856c18335")
    public void uploadAndSaveModel(Package package, Model model) {
    }

    @objid ("39a4684f-502e-4a7d-b67a-6de14abd6db8")
    public void uploadAndSaveAlgorithm(Package package, Algorithm algo) {
    }

    @objid ("f8629a4c-b18f-4382-abbd-6ae2de59b62d")
    public void uploadAndSavePackage(Package package) {
    }

    @objid ("ec4594d3-a254-4eb0-b9c5-61472e20cbef")
    public void downloadPackage(Package package) {
    }

    @objid ("ef4b6b98-ea2d-41cd-a51f-db58dd0144dc")
    public void deletePackage(Package package) {
    }

    @objid ("dcde056f-208d-46f8-b9b7-16365bcbc1b8")
    public void deleteEntityInPackage(Package package, Entity entity) {
    }

    @objid ("53f9eede-9b10-4c86-8a0e-34bd6c25c37a")
    PrivilegeManager getPrivilegeMngr() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.privilegeMngr;
    }

    @objid ("635ba2fe-9469-478e-bf8f-d8f4a3deeec9")
    void setPrivilegeMngr(PrivilegeManager value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.privilegeMngr = value;
    }

    @objid ("7609a11d-14c0-4c4d-9e25-c0a82a3b7914")
    SecurityManager getSecurityMngr() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.securityMngr;
    }

    @objid ("a6e52077-9646-4d4c-b7e9-85e519f774f7")
    void setSecurityMngr(SecurityManager value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.securityMngr = value;
    }

    @objid ("99738af2-894c-4518-8f72-fc1520847d38")
    PackageManager getPackageMngr() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.packageMngr;
    }

    @objid ("bb6be77f-cc10-4889-b72b-db34c50b26c8")
    void setPackageMngr(PackageManager value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.packageMngr = value;
    }

}
