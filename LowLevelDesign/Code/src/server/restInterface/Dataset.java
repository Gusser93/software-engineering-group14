package server.restInterface;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bd1dc3c4-06fe-4702-928c-2396ed022774")
public class Dataset extends Entity {
    @objid ("b7f6acde-e098-4a1a-86bb-3014b63ed288")
    public String data;

    @objid ("18c82d58-7156-40d8-b2a9-679e86224e8b")
    public String type;

    @objid ("9ebfa63f-1ac8-4f03-b6a8-7924629b80c2")
    public Package package;

    @objid ("7e8efd59-9d47-4bd7-8813-594254d74855")
    public Dataset(String data) {
    }

    @objid ("21d738a8-9d8f-4e74-abfd-cff21703d086")
    public static List<String> allowedUploadFormats() {
    }

    @objid ("c3bbbc41-bf44-4608-b65c-ac27d4350e6f")
    public String getFormat() {
    }

    @objid ("f2847f8d-9b08-45de-a3fb-d762f8e3827c")
    public List<Dataset> splitDataByPercentage(float p) {
    }

}
