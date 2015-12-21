import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("db642ba9-3795-48be-bca7-e890aab67f09")
public class Product {
    @objid ("34764947-aa50-4b13-b74e-ee61b6572f74")
    public String name;

    @objid ("4a7986a5-2d04-4d7c-ab54-53edacb8466f")
    public float cost;

    @objid ("336387a4-a1c5-4c8c-8d5c-efec6ce37b64")
    public long quantity;

    @objid ("3d05d378-3035-4a60-9bd6-d6855df5ef01")
    public List<Supplier> supplier = new ArrayList<Supplier> ();

    @objid ("f22f5489-0442-42de-829c-4a6e7bd15439")
    public void reorder(long quantity, Supplier supplier) {
    }

}
