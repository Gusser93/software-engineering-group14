package server.restInterface;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f2686a9c-af24-498e-8917-cfbd41ebd421")
public class Usergroup {
    @objid ("b58e8246-adc0-4fe8-8c5b-640711ac6fe2")
    private String name;

    @objid ("a4411891-ac54-40ae-97b7-d22a90f384bd")
    public long id;

    @objid ("d84907bd-8f06-49c4-968f-c70db25591cb")
    public String uri;

    @objid ("92f762e4-1b04-4bfd-9f6b-dff957fa88d4")
    public List<User>  = new ArrayList<User> ();

    @objid ("bb11138e-d296-4b36-bd40-efc995c78884")
    public boolean containsUser(User u) {
    }

    @objid ("be627dc4-d00c-4c38-808d-b7d2d465112b")
    public Usergroup(List<User> u, String name) {
    }

    @objid ("770c818a-260a-4688-876d-47f876303012")
    public String getName() {
    }

}
