import Model;
import Interface;

public class ModelInterface extends Interface
{
    /**
     * Operation createModel
     *
     * @param name - 
     */
    public void createModel ( String name ){}
    /**
     * Operation deleteModel
     *
     * @param id - 
     */
    public void deleteModel ( URI id ){}
    /**
     * Operation getModel
     *
     * @param id - 
     * @return Model
     */
    public Model getModel ( URI id ){}
}

