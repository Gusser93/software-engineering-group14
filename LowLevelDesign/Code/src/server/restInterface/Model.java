package server.restInterface;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("151c1ae3-27c8-48b2-8956-8f50cb7b4bdc")
public class Model extends Entity {
    @objid ("173aa6d6-084c-46ed-8918-e1d61a892ca6")
    private Dataset trainingData;

    @objid ("edfaa47d-7fdf-49e6-b973-d9d83d67858d")
    public Dataset testData;

    @objid ("cd4bbf56-dfbe-46df-8136-bdd32f7333d8")
    private Object[] parameters;

    @objid ("63a1897b-dbf4-412f-98d9-591a7133cf09")
    public boolean isEvaluating;

    @objid ("511b4cfb-87f2-441e-955f-de4e0aefbdf3")
    public List<Prediction> predictions = new ArrayList<Prediction> ();

    @objid ("e6b91f02-bf52-4e72-a61c-be6373e7afad")
    public Package package;

    @objid ("b2cae17f-d068-47d3-87ff-198736e9f06b")
    public Model(Dataset trainingData, Object params) {
    }

    @objid ("d25bf5f8-f32d-441d-ab1a-627dd4e258d2")
    public void eveluate() {
    }

    @objid ("ea54aab4-db22-47cc-904f-78a585150b92")
    public boolean isEvaluating() {
    }

    @objid ("ed96fbcc-6d1a-4752-8bb2-914a8acf22a8")
    public void cancelEvaluation() {
    }

    @objid ("548a346c-a247-48a3-bd98-c799300da61b")
    public Object[] getParameters() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.parameters;
    }

    @objid ("7e3d956a-80db-4561-828c-d63983f1d149")
    public void setParameters(Object[] value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.parameters = value;
    }

    @objid ("e3f44dd2-0db4-4fb6-92a8-245b66bbe803")
    public Model(String dataset, String algorithm, List<String> parameter, float splutValue) {
    }

    @objid ("80b609f9-4be2-4157-8802-7b40d4ee76a3")
    public Model(String trainingDataset, String algorithm, List<String> parameter, String validationDataset) {
    }

}
