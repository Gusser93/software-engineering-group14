package clientHandler.entity.entityMvc;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ab1456de-6254-4e61-b599-5a59d06a2733")
public abstract class EntityController {
    @objid ("2e3aac2e-8594-417c-b022-8961aed6aeb6")
    public EntityView view;

    @objid ("f929e5ee-e235-48d3-9c05-faee7025a2c2")
    private EntityModel model;

    @objid ("91b32866-9856-44b8-856d-290796fee366")
    EntityModel getModel() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.model;
    }

    @objid ("a3242ee5-398f-4c35-b018-2c7a82ec1b1f")
    void setModel(EntityModel value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.model = value;
    }

}
