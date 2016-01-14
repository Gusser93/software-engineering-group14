import User;
import Group;
import Model;
import Algo;
import Object;

public class Package extends Object
{
    /** Attributes */
    /**
     * 
     */
    private String name;
    /**
     * 
     */
    private String description;
    /**
     * 
     */
    private list models;
    /**
     * 
     */
    private User owner;
    /**
     * 
     */
    private List algos;
    /**
     * 
     */
    private Group group;
    /**
     * Operation getName
     *
     * @return string
     */
    public string getName (  ){}
    /**
     * Operation setName
     *
     * @param name - 
     */
    public void setName ( String name ){}
    /**
     * Operation getDescription
     *
     * @return String
     */
    public String getDescription (  ){}
    /**
     * Operation setDescription
     *
     * @param description - 
     */
    public void setDescription ( String description ){}
    /**
     * Operation getModel
     *
     * @param id - 
     * @return Model
     */
    public Model getModel ( URI id ){}
    /**
     * Operation getOwner
     *
     * @return User
     */
    public User getOwner (  ){}
    /**
     * Operation getAlgo
     *
     * @param id - 
     * @return Algo
     */
    public Algo getAlgo ( URI id ){}
    /**
     * Operation setAlgo
     *
     * @param algo - 
     */
    public void setAlgo ( Algo algo ){}
    /**
     * Operation setOwner
     *
     * @param user - 
     */
    public void setOwner ( User user ){}
    /**
     * Operation setModel
     *
     * @param model - 
     */
    public void setModel ( Model model ){}
    /**
     * Operation getGroup
     *
     * @return Group
     */
    public Group getGroup (  ){}
    /**
     * Operation setGroup
     *
     * @param group - 
     */
    public void setGroup ( Group group ){}
}

