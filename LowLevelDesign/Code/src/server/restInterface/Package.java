package server.restInterface;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c185b8ee-7907-4052-b208-31a27e6fd1be")
public class Package extends Entity {
    @objid ("3c615a5a-eccf-4631-a667-cf55ca15faaa")
    public List<Prediction> predictions = new ArrayList<Prediction> ();

    @objid ("ea370090-18f9-4314-8210-1f769c071d54")
    public List<Dataset> datasets = new ArrayList<Dataset> ();

    @objid ("67d932b5-f8e4-4aea-a154-1eb48ec9806e")
    public Usergroup usergroup;

    @objid ("e3e7ecd3-523c-4bdb-8e09-9cf6e7776e5a")
    public List<User> users = new ArrayList<User> ();

    @objid ("424eadcf-a422-4296-a321-39d7321da1d8")
    public List<Model> models = new ArrayList<Model> ();

    @objid ("bb9f2689-cc3c-440f-9bad-0324b1a3c795")
    public Package(User u, Usergroup ug) {
    }

    @objid ("9bfdb289-61b9-4ef9-815f-05884360e495")
    public boolean containsModel(Model m) {
    }

    @objid ("c0f4c51d-a9cd-4be6-a915-1f36d9cd7302")
    public void addLicense(String license) {
    }

}
