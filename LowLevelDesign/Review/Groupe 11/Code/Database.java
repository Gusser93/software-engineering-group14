import Object;

public class Database

{
    /** Attributes */
    /**
     * 
     */
    public List packageList;
    /**
     * 
     */
    public List userList;
    /**
     * Operation getObject
     *
     * @param type - 
     * @param id - 
     * @return Object
     */
    public Object getObject ( <T> type, long id ){}
    /**
     * Operation postObject
     *
     * @param type - 
     * @param id - 
     * @return boolean
     */
    public boolean postObject ( <T> type, long id ){}
    /**
     * Operation deleteObject
     *
     * @param id - 
     * @param type - 
     * @return boolean
     */
    public boolean deleteObject ( long id, <T> type ){}
}

