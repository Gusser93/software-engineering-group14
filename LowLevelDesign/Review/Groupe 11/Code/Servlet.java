import ServerCrypter;

public abstract class Servlet

{
    /** Associations */
    private ServerCrypter unnamed_21;
    /**
     * Operation doGet
     *
     * @param req - 
     * @param res - 
     */
    public void doGet ( HttpServletRequest req, HttpServletResponse res );

    /**
     * Operation doPost
     *
     * @param req - 
     * @param res - 
     */
    public void doPost ( HttpServletRequest req, HttpServletResponse res );

    /**
     * Operation doDelete
     *
     * @param req - 
     * @param res - 
     */
    public void doDelete ( HttpServletRequest req, HttpServletResponse res );

    /**
     * Operation doPut
     *
     * @param req - 
     * @param res - 
     * @return 
     */
    public doPut ( HttpServletRequest req, HttpServletResponse res );

}

