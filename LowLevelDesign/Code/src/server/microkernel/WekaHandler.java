package server.microkernel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.Algorithm;
import server.restInterface.Dataset;
import server.restInterface.Model;
import server.restInterface.Prediction;

@objid ("f0784239-9387-44b5-8b08-dd48ae8ca611")
public class WekaHandler {
    @objid ("bd885344-ba9c-4ff5-bccb-63c5e3903816")
    public PriorityBlockingQueue requestQueue = new PriorityBlockingQueue();

    @objid ("b0c04ea0-abcb-40d5-aa3a-956e12b7837b")
    public int maxNumberOfProcesses = 5;

    @objid ("19c6f601-9062-4e94-a5e3-4fd62f08940c")
    private List<Algorithm> algorithm = new ArrayList<Algorithm> ();

    @objid ("eafee1b1-c462-43f9-8fff-fcf708ebe795")
    public Model createModel(Dataset trainingDataset, Dataset verfyDataset, Algorithm algorithm, List<Object> parameters) {
    }

    @objid ("43b62dbb-287c-4e17-ac1e-edd8cb1b6d18")
    public List<Dataset> splitDataset(Dataset originDataset, float splitValue) {
    }

    @objid ("1cfbdb6f-8d6d-44f4-873a-5fc9fcc3d27c")
    public String verifyModel(Model model, Dataset dataset) {
    }

    @objid ("45b77062-a146-4bd2-951f-5a25d6d09109")
    public Prediction createPrediction(Model model, Dataset dataset) {
    }

    @objid ("a6b28e2c-40ad-4347-a7b2-c9c67c0e5a90")
    public List<String> getValidAlgorithms(Dataset dataset) {
    }

    @objid ("e5cfa2c1-1126-4845-8dc8-4742530c512c")
    private void service() {
    }

    @objid ("b5f08230-8112-474a-aa47-c28b3b7b3267")
    public Algorithm getAlgorithm(String name) {
    }

    @objid ("948b8cdc-beb8-40cd-b8e7-6b1ff580dc61")
    private class Request implements Runnable {
        @objid ("d4d8a456-f520-460f-94a6-0c445a9cc9d6")
        public Dataset trainingDataset;

        @objid ("d5119e8a-ab4a-4c66-9135-17f194f78a18")
        public Dataset verifyDataset;

        @objid ("541ffbc3-8d95-4e94-a34a-9136691c1ac4")
        public Algorithm algorithm;

        @objid ("1391344f-c772-4d70-b636-44ca3a500041")
        public Object[] parameters;

        @objid ("65d9d5ae-a3eb-4881-8ebf-ebce28d63362")
        public Request(Dataset trainingDataset, Dataset verifyDataset, Algorithm algorithm, List<Object> parameters) {
        }

        @objid ("308b78ea-6e54-4f1f-a5c0-dda34b14cdce")
        public Request(Dataset dataset, float splitAt, Algorithm algorithm, List<Object> parameters) {
        }

    }

}
