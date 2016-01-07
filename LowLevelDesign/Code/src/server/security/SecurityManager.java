package server.security;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.Package;
import server.restInterface.User;

@objid ("eb9acd96-5174-47c9-b45a-7f59bbfaf1c1")
public class SecurityManager {
    @objid ("b9036359-0bd8-49ff-8be1-db6b227fbdfd")
    public boolean userCanStartEvaluation(User u) {
    }

    @objid ("167eb93a-b991-49c4-8624-25ff95fd4ffd")
    public boolean userCanDownloadPackage(User u, Package uri) {
    }

    @objid ("746759b9-110e-4f16-9878-b239fb7007d3")
    public boolean userCanReadFromURI(User u, String uri) {
    }

    @objid ("caa15a7e-a6f9-4423-aab5-181cd2d77f47")
    public boolean userCanWriteToURI(User u, String uri) {
    }

}
