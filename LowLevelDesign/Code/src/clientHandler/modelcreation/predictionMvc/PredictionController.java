package clientHandler.modelcreation.predictionMvc;

import clientHandler.entity.entityMvc.EntityController;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.Dataset;
import server.restInterface.Model;

@objid ("8b60f8f1-f227-421b-af86-0553a9cd463d")
public class PredictionController extends EntityController {
    @objid ("a80ad897-ce34-41d7-8e42-1b8923738fda")
    public PredictionView predictionView;

    @objid ("997bd274-755e-42a1-b68f-b4958ddf3795")
    private PredictionModel predictionModel;

    @objid ("e648de05-d16e-47b8-b271-0ca26b060098")
    public void evaluate() {
    }

    @objid ("7afcdca1-9b3f-44da-94f1-97d9b92b60eb")
    public void cancelEvaluation() {
    }

    @objid ("083812ce-df95-4f81-a45a-7760963627d0")
    public void createPrediction(Model model, Dataset data) {
    }

}
