import Algo;
import Interface;

public class AlgoInterface extends Interface
{
    /**
     * Operation createAlgo
     *
     * @param name - 
     */
    public void createAlgo ( String name ){}
    /**
     * Operation deleteAlgo
     *
     * @param id - 
     */
    public void deleteAlgo ( URI id ){}
    /**
     * Operation getAlgo
     *
     * @param id - 
     * @return Algo
     */
    public Algo getAlgo ( URI id ){}
}

