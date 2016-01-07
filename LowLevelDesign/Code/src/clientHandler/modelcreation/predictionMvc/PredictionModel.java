package clientHandler.modelcreation.predictionMvc;

import clientHandler.entity.entityMvc.EntityModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.Prediction;

@objid ("79783219-20fb-4c0d-a9e1-0eb9cbd468e4")
public class PredictionModel extends EntityModel {
    @objid ("67a39212-272c-4c95-8f12-f1e765759ece")
    private Prediction prediction;

    @objid ("02e20807-ac6f-4dc2-8640-5002c76c798e")
    Prediction getPrediction() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prediction;
    }

    @objid ("196a610f-1305-48c0-bb44-265db4312340")
    void setPrediction(Prediction value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prediction = value;
    }

}
