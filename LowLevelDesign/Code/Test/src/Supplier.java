import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ccc1cd58-7d32-4158-bcf5-9ee413a37bdd")
public class Supplier {
    @objid ("e20a7406-edd6-4301-bcad-3906c3040ea1")
    public String name;

    @objid ("570b80b3-29d8-4555-932c-5aa610deee28")
    public String location;

    @objid ("ff239c5d-5f19-4c76-8919-552849e01bf9")
    public List<Product> products = new ArrayList<Product> ();

}
