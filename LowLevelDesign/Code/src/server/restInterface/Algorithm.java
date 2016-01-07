package server.restInterface;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import com.sun.org.apache.xml.internal.security.algorithms.Algorithm;

@objid ("272c1f08-94da-49ee-b9fd-6d29f3b14695")
public abstract class Algorithm extends Entity {
    @objid ("d6a59cfa-f177-4142-95d5-91ec1cbb2008")
    public String[] allowedParameterTypes;

    @objid ("06613be5-199b-4a60-9215-0e03bc666aca")
    public Algorithm[] avaiableAlgorithms;

    @objid ("4a3346d0-9833-4331-9f88-fafc1fe1fce6")
    public String path;

    @objid ("759fe57a-ad52-4bac-9dbe-8c56e0e2a387")
    public static List<Algorithm> getAvailableAlgorithms() {
    }

}
