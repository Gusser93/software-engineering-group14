package server.packagemanagment;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.restInterface.Algorithm;
import server.restInterface.Dataset;
import server.restInterface.Entity;
import server.restInterface.Model;
import server.restInterface.Package;
import server.restInterface.User;

@objid ("80f9bee5-a45f-424d-8da2-399f443bdf36")
public class PackageManager {
    @objid ("ccaf942f-dad7-4744-99ad-2225d083ad3e")
    public List<Package> packages = new ArrayList<Package> ();

    @objid ("284505c0-f8a9-475a-96eb-eb13b84ea162")
    public boolean uploadAndSaveDataset(Dataset data, User u, Package p) {
    }

    @objid ("8cd828df-f835-4e1f-85d4-ae8150bb6439")
    public boolean uploadAndSaveModel(Model model, User u, Package p) {
    }

    @objid ("5760fc06-f069-40f4-a773-29f8ce1c40b6")
    public boolean uploadAndSaveAlgorithm(Algorithm algo, User u, Package p) {
    }

    @objid ("554a783c-24a3-4a50-8c6b-5e1eb0702aea")
    public final void createDefaultPackageForUser(User u) {
    }

    @objid ("85b96df5-2de4-471d-b64d-28f9ad91af1e")
    public String downloadPackage(Package p) {
    }

    @objid ("721b0e1b-2da8-4447-94e6-13aef298601d")
    public boolean deletePackage(Package p) {
    }

    @objid ("5a94f984-d30b-4639-98a8-9a0ce792900e")
    public boolean deleteEntityInPackage(Entity e, Package p) {
    }

    @objid ("056aa533-3570-4c6e-b6df-6dfd4af1ac7a")
    public boolean uploadAndSavePackage(Package p, User u) {
    }

}
