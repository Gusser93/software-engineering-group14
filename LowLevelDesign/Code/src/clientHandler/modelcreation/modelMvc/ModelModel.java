package clientHandler.modelcreation.modelMvc;

import java.util.List;
import clientHandler.entity.entityMvc.EntityModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.Model;

@objid ("deae3803-e670-4ba4-bc02-a36e5af6bcf8")
public class ModelModel extends EntityModel {
    @objid ("ad8e3cc1-ead7-43ab-a44d-72f7a25cbfa7")
    private Model model;

    @objid ("b4023c38-63c4-4d71-80a3-012a278fbbd3")
    Model getModel() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.model;
    }

    @objid ("d768473f-7561-43cc-874e-a680884cc3a6")
    void setModel(Model value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.model = value;
    }

    @objid ("c24a22dc-f947-4af8-84d4-f369d15237f7")
    public void createModel(String dataset, String algorithm, List<String> parameter, float splitValue) {
    }

    @objid ("d26e3db8-f738-42bb-b84b-a760d7c012de")
    public void createModel(String trainingDataset, String algorithm, List<String> parameter, String validationDataset) {
    }

}
