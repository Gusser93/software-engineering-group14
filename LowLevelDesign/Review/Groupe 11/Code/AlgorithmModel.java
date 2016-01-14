import Algo;
import Model;
import Dataset;
import ModelModel;
import DatasetModel;
import AlgorithmController;

public class AlgorithmModel extends Model
{
    /** Attributes */
    /**
     * 
     */
    public Algo algo;
    /** Associations */
    private ModelModel unnamed_3;
    private DatasetModel unnamed_2;
    private AlgorithmController uses;
    /**
     * Operation generateModel
     *
     * @param parameter - 
     * @return Model
     */
    public Model generateModel ( Dataset parameter ){}
    /**
     * Operation getAlgo
     *
     * @return Algo
     */
    public Algo getAlgo (  ){}
    /**
     * Operation setAlgo
     *
     * @param algo - 
     */
    public void setAlgo ( Algo algo ){}
}

