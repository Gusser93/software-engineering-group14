import Package;
import Interface;

public class PackageInterface extends Interface
{
    /**
     * Operation createPackage
     *
     * @param name - 
     * @return Package
     */
    public Package createPackage ( String name ){}
    /**
     * Operation deletePackage
     *
     * @param id - 
     */
    public void deletePackage ( URI id ){}
}

