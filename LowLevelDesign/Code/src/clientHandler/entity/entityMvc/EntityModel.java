package clientHandler.entity.entityMvc;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.Entity;

@objid ("982afabe-ebd3-4a7e-9920-6aab68565632")
public abstract class EntityModel {
    @objid ("c72d24a8-aa25-4565-8140-ecc37e186b03")
    private Entity entity;

    @objid ("a5f72323-e0bf-44ec-a35b-6737f7fdfce0")
    public EntityView view;

    @objid ("085cebf6-a96b-45a1-b6ef-81f506a764e9")
    Entity getEntity() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.entity;
    }

    @objid ("57732dc0-2907-46ab-b5d0-ea68339be1ff")
    void setEntity(Entity value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.entity = value;
    }

}
