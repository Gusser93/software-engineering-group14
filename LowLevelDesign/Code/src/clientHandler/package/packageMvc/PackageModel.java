package clientHandler.package.packageMvc;

import clientHandler.entity.entityMvc.EntityModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.Package;

@objid ("26123089-8696-4da2-ab63-68a14c891383")
public class PackageModel extends EntityModel {
    @objid ("c253df50-6b55-4146-835f-de0ecfbfc185")
    private Package[] packages;

    @objid ("32ce3421-c905-49da-8277-99f6abb5e531")
    Package[] getPackages() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.packages;
    }

    @objid ("fdf0640c-8997-4137-b4f9-4046b1e00beb")
    void setPackages(Package[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.packages = value;
    }

}
