package server.restInterface;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import weka.clusterers.Clusterer;

@objid ("2006a52f-6573-475b-900b-a873fadd7062")
public class ClusterAlgorithm extends Algorithm {
    @objid ("ebd9e070-0d4b-47fe-8abe-94966ed0f240")
    public Clusterer algorithm;

    @objid ("f370a975-2f0a-460b-a930-d3ad20ec0cd6")
    public ClusterAlgorithm(String algorithm) {
    }

}
