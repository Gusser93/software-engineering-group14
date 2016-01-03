import java.io.InputStream;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4db9f714-64d6-4133-8d18-8c7f998f4bee")
public class PackageIdModelEndpoint {
    @objid ("988d2f3a-64fb-4623-b520-840c78d90332")
    public List<Model> callGet() {
    }

    @objid ("0297f1a2-0925-451d-b688-b46f2eb31976")
    public void callPost(String trainingDatasetUri, String validationDatasetUri, String algorithm, List<String> parameter, String name) {
    }

    @objid ("53329f45-5775-43fd-8532-15dadf805ab0")
    public void callPost(String datasetUri, float percentageOfTrainingData, String algorithm, List<String> parameters, String name) {
    }

    @objid ("c9d572b6-c386-47a5-b087-ad84c1570693")
    public void callPost(InputStream inputModel, String name) {
    }

    @objid ("9702f78d-aef9-40ea-b714-3b16258310fa")
    public void callDelete() {
    }

}
