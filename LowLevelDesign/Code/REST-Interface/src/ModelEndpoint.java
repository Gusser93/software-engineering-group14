import java.io.InputStream;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b66ae4f7-7cf7-4093-9254-3279ba321d8f")
public abstract class ModelEndpoint {
    @objid ("bc533831-e198-4110-b62e-dc37d497183e")
    public void callPost(String trainingDatasetUri, String validationDatasetUri, String algorithm, List<String> parameter, String name) {
    }

    @objid ("e26fe043-7d3a-4832-81af-1f77bf312d8a")
    public void callPost(String datasetUri, float percentageOfTrainingData, String algorithm, List<String> parameters, String name) {
    }

    @objid ("e97a6727-4295-4bf3-bd47-36e16ad37092")
    public void callPost(InputStream inputModel, String name) {
    }

    @objid ("0c34e747-0083-4041-9383-a75066ffe674")
    public void callDelete() {
    }

}
