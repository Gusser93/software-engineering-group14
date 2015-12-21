import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d228ca98-badc-4099-b76e-c2291873a327")
public abstract class Client {
    @objid ("2d056069-2066-4c69-94c3-e4b3c06d5d3a")
    public String name;

    @objid ("1cbe51ff-66f7-4e9d-bbbe-ca09477864d0")
    public String adress;

    @objid ("41df9c35-6b87-4a9d-b961-90d9051e8999")
    public boolean isSolvent;

    @objid ("adb02d63-947e-4db6-8e73-7441011056be")
    public List<Order> order = new ArrayList<Order> ();

    @objid ("daaa6fe8-00f4-41fa-80d5-a59cdbdbca76")
    public void sendAdmonition() {
    }

}
