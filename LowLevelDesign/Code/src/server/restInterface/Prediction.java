package server.restInterface;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d19d0ffe-f920-47fe-915e-30413351d372")
public class Prediction extends Entity {
    @objid ("a5fe9e90-b4f3-4b6e-8459-6f4424434cef")
    private boolean isEvaluating;

    @objid ("bc23a23c-1471-40d4-aff1-3bf99800648f")
    public Model model;

    @objid ("abf829b1-f5fe-4ef5-95f6-f7bc9d88350c")
    public Package package;

    @objid ("2f3bb0f0-02fe-4cda-9221-62503d036f5b")
    public Prediction(Model m, Dataset d) {
    }

    @objid ("a32dbc0c-5a57-40a0-9d29-910f6c0fc3c7")
    public void eveluate() {
    }

    @objid ("e9fdcdea-9a8e-447d-9fdb-9d0ce6c5c813")
    public boolean isEvaluating() {
    }

    @objid ("5936acd2-dcf8-4409-bdec-e0f25e00067b")
    public void cancelEvaluation() {
    }

}
