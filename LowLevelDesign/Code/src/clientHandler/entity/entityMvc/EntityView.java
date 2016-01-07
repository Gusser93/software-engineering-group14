package clientHandler.entity.entityMvc;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("34428e1e-8bf3-4e6d-aab0-ffd539bd8774")
public abstract class EntityView {
    @objid ("1dd1105c-3bee-4ccd-ba4e-ae5cd448d3c1")
    private EntityModel model;

    @objid ("ddadecb2-b433-4152-811b-74b80bf4f6b1")
    public void showView() {
    }

    @objid ("4d89da0d-7323-4679-8ea2-1c6d0b94788e")
    EntityModel getModel() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.model;
    }

    @objid ("64e67943-e7d8-43cf-9df3-fdedc51425a5")
    void setModel(EntityModel value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.model = value;
    }

}
