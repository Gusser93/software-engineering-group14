import User;
import Model;
import LoginController;

public class LoginModel extends Model
{
    /** Attributes */
    /**
     * 
     */
    private User user;
    /** Associations */
    private LoginController uses;
    /**
     * Operation createUser
     *
     * @param firstname - 
     * @param lastname - 
     * @param password - 
     * @param email - 
     * @param id - 
     * @return User
     */
    public User createUser ( String firstname, String lastname, String password, String email, URI id ){}
    /**
     * Operation getUser
     *
     * @return User
     */
    public User getUser (  ){}
    /**
     * Operation setUser
     *
     * @param user - 
     */
    public void setUser ( User user ){}
}

