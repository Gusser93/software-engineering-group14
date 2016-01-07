package server.pluginLoader;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import server.microkernel.WekaHandler;
import server.restInterface.Dataset;
import server.restInterface.Entity;
import server.restInterface.Model;
import server.restInterface.Package;

@objid ("e0e82c3e-f710-4f09-a88b-f9aa467fd313")
public class PluginLoader {
    @objid ("87a5b5f9-4be0-4749-8214-48379668c241")
    private List<Entity> plugins = new ArrayList<Entity> ();

    @objid ("c1c19737-4269-4814-9230-379993d3f82c")
    private WekaHandler wekaHandler;

    @objid ("5eb86f9a-7477-4da3-81df-aefba6aeaf19")
    public String exportEntityToFile(Entity e, String format) {
    }

    @objid ("bcbae191-71ba-4cef-a8e5-e732e25e4ce0")
    public static List<String> availableExportFormats() {
    }

    @objid ("9d3a6df5-372b-4916-898e-c4d37f6997a1")
    public Entity readEntityFromFile(String file) {
    }

    @objid ("9150c601-f464-4f09-b4d4-1b4275921cf5")
    public Entity getEntityWithID(long id) {
    }

    @objid ("255e3327-61de-4c5c-bb55-a8e885a4426b")
    public List<Entity> getEntitiesWithName(String name) {
    }

    @objid ("b96ab1d2-8890-493a-aa68-53d2f4c264df")
    public Dataset createDataset(String uri, InputStream is) {
    }

    @objid ("d89e1e22-c968-4557-b40a-402ca25dc467")
    public Model createModel(String uri, InputStream is) {
    }

    @objid ("7d8f54a2-5d41-47d7-889a-2e8e07c2ad4c")
    public Package createPackage(String uri, InputStream is) {
    }

}
