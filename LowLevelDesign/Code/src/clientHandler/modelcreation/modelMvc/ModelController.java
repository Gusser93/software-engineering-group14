package clientHandler.modelcreation.modelMvc;

import java.util.List;
import clientHandler.entity.entityMvc.EntityController;
import clientHandler.userspace.login.LoginSession;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.packagemanagment.PackageManager;

@objid ("d3d1a56f-3672-4aa7-946c-1d0a64764952")
public class ModelController extends EntityController {
    @objid ("0f880c82-a3e7-497e-8a17-9bbe7cef61ba")
    private PackageManager packageMngr;

    @objid ("1559a8fb-c8e5-4eb7-8331-a8877b7fdc3f")
    public ModelView modelView;

    @objid ("f9d306b4-7bca-4e09-9294-5195ac4df46a")
    private ModelModel modelModel;

    @objid ("ee88ec94-ce40-4dc3-84d3-f5456cd24f41")
    private LoginSession loginSession;

    @objid ("15f197da-9287-4ef1-b141-210b449a8edb")
    public void createModel(String data, String algo, List<String> parameter, float splitValue) {
    }

    @objid ("182f2f9e-3e9e-4faf-bb5f-ea4dfddf38d8")
    PackageManager getPackageMngr() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.packageMngr;
    }

    @objid ("1f5c2bcd-7270-4856-b021-942bb713f5a2")
    void setPackageMngr(PackageManager value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.packageMngr = value;
    }

    @objid ("7481d155-8569-49e4-b6a6-72a99f2bc0e3")
    public void createModel(String trainingData, String algo, List<String> parameter, String validationData) {
    }

}
