import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("62dbecc3-b532-42b1-874a-72fb04665ea8")
public class Order {
    @objid ("7a873aef-a4f9-4f02-b19c-98b568d251f5")
    public long code;

    @objid ("e098b163-ef28-4739-9f5b-9d446e2a658e")
    public float value;

    @objid ("9d48b985-8eec-4118-bfe2-2ec33318608f")
    public String dateOfReceipt;

    @objid ("33bec5ab-b8c5-49e0-abe3-7bc22a8e4e9b")
    public String dateOfInvoice;

    @objid ("c3fa5965-8954-424a-b48b-9c6ca3517339")
    public String dateOfPayment;

    @objid ("2179ed6f-f109-4499-b73c-4ae30ad373cb")
    public boolean mustBePaidInAdvance;

    @objid ("f170c161-54bb-423c-bab4-13a02c2a25cd")
    public List<Item> item = new ArrayList<Item> ();

    @objid ("cd4c33d6-c7b7-40e5-87cc-5dcff15a6830")
    private boolean clientIsSolvent() {
    }

}
