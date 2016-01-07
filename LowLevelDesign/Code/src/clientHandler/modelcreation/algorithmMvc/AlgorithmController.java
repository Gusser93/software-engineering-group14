package clientHandler.modelcreation.algorithmMvc;

import clientHandler.entity.entityMvc.EntityController;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.packagemanagment.PackageManager;

@objid ("a5a5835c-cd7f-48fc-95e9-e31024622b0a")
public class AlgorithmController extends EntityController {
    @objid ("8ca89b9a-53e5-4dbf-b7ec-fa013ae32dd1")
    private PackageManager packageMngr;

    @objid ("fe1186c3-ebac-4c54-98ad-5a8d66f14814")
    public String allowedParameterTypes() {
    }

    @objid ("52039673-1e34-4804-9435-d8f35c2c2968")
    PackageManager getPackageMngr() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.packageMngr;
    }

    @objid ("b06338e1-39cd-4693-924c-3282781148ed")
    void setPackageMngr(PackageManager value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.packageMngr = value;
    }

}
