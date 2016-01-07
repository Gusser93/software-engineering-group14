package clientHandler.modelcreation.datasetMvc;

import clientHandler.entity.entityMvc.EntityController;
import clientHandler.userspace.login.LoginSession;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.packagemanagment.PackageManager;
import server.restInterface.Dataset;

@objid ("5e5b7aea-95ff-483d-8915-b9c6d19d21ab")
public class DatasetController extends EntityController {
    @objid ("383e123e-d78a-440e-abe6-cd3983eec25f")
    private PackageManager packageMngr;

    @objid ("1619fcf4-7f68-438b-93a7-f8939cb0f99b")
    private LoginSession loginSession;

    @objid ("2fd2ea52-2375-4865-99be-536810e5bae1")
    public void createDataset(Dataset data) {
    }

    @objid ("50add45c-7344-4057-be2e-7ae2b32fc6f0")
    PackageManager getPackageMngr() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.packageMngr;
    }

    @objid ("676c7580-92e2-4de0-b60d-ef1f08ea21e8")
    void setPackageMngr(PackageManager value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.packageMngr = value;
    }

}
