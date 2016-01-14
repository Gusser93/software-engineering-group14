import Package;
import User;
import Group;

public abstract class Interface

{
    /**
     * Operation getPackage
     *
     * @param id - 
     * @return Package
     */
    public Package getPackage ( URI id );

    /**
     * Operation getUser
     *
     * @param id - 
     * @return User
     */
    public User getUser ( URI id );

    /**
     * Operation getGroup
     *
     * @param id - 
     * @return Group
     */
    public Group getGroup ( URI id );

    /**
     * Operation Interface
     *
     * @param userID - 
     * @return 
     */
    public Interface ( URI userID );

    /**
     * Operation getCurrentUser
     * statisch
     *
     * @return User
     */
    public User getCurrentUser (  );

}

