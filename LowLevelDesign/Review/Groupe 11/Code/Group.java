import User;
import Object;

public class Group extends Object
{
    /** Attributes */
    /**
     * 
     */
    private List writableUsers;
    /**
     * 
     */
    private List readableUsers;
    /**
     * Operation getWritableUsers
     *
     * @return List
     */
    public List getWritableUsers (  ){}
    /**
     * Operation getReadableUsers
     *
     * @return List
     */
    public List getReadableUsers (  ){}
    /**
     * Operation setWritableUser
     *
     * @param user - 
     */
    public void setWritableUser ( User user ){}
    /**
     * Operation setReadableUser
     *
     * @param user - 
     */
    public void setReadableUser ( User user ){}
}

