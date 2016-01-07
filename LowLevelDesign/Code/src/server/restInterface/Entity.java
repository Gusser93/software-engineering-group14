package server.restInterface;

import java.io.Serializable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.logic.Adapter;

@objid ("66e821b6-eb4f-4a9e-b51a-bbd5e06c5b08")
public abstract class Entity implements Serializable {
    @objid ("589964ea-bede-47f2-bde4-cab476147754")
    public String name;

    @objid ("30c04c16-c019-4045-94e7-aedfa1bd3eed")
    public long id;

    @objid ("2618cdc2-e275-402e-9430-77dd4ee85ba1")
    public String uri;

    @objid ("f44dad98-d318-4a2a-a4d8-e03b83b34a74")
    public Adapter adapter;

    @objid ("8f4c7f91-5175-4d64-bd2b-3e89f7ecee74")
    public long getID() {
    }

    @objid ("ad4fcd0b-9142-4fb0-b1f4-9fa87f04e1ea")
    public String getName() {
    }

}
