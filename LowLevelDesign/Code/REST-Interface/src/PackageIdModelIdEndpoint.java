import java.io.InputStream;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("58d0ebb2-26fb-42ab-9a5b-687427345fc0")
public class PackageIdModelIdEndpoint {
    @objid ("d3792150-760d-4789-9301-3316ed407a84")
    public Model callGet() {
    }

    @objid ("5eb1fec3-ad25-4435-868d-d76e57a63f6a")
    public void callPost(String datasetUri, float percentageOfTrainingData, String algorithm, List<String> parameters, String name) {
    }

    @objid ("1f6f8942-99c3-4869-8556-688a576e86d9")
    public void callPost(InputStream inputModel, String name) {
    }

    @objid ("0c727ba5-470f-4f2a-99c1-3bba2d294d9a")
    public void callDelete() {
    }

    @objid ("11c5179a-708e-4dc0-94e8-370b5312c98c")
    public void callPost(String trainingDatasetUri, String validationDatasetUri, String algorithm, List<String> parameter, String name) {
    }

}
