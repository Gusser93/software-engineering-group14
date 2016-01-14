import Dataset;
import Interface;

public class DatasetInterface extends Interface
{
    /**
     * Operation createDataset
     *
     * @param name - 
     */
    public void createDataset ( String name ){}
    /**
     * Operation deleteDataset
     *
     * @param id - 
     */
    public void deleteDataset ( URI id ){}
    /**
     * Operation getDataset
     *
     * @param id - 
     * @return Dataset
     */
    public Dataset getDataset ( URI id ){}
}

