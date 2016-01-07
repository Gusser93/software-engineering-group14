package server.restInterface;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import weka.classifiers.Classifier;

@objid ("3a318c7a-1107-4ee1-b8d6-17b1deb7bba7")
public class ClassifierAlgorithm extends Algorithm {
    @objid ("9657086d-e08f-4a7a-958c-657f2c6e5e4b")
    public Classifier algorithm;

    @objid ("ab08f8d8-6040-406d-8fe7-cae55961c4d1")
    public ClassifierAlgorithm(String algorithm) {
    }

}
