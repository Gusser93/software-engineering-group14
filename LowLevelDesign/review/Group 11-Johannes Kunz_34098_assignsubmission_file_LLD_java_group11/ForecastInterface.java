import Forecast;
import Interface;

public class ForecastInterface extends Interface
{
    /**
     * Operation createForecast
     *
     * @param name - 
     */
    public void createForecast ( String name ){}
    /**
     * Operation deleteForecast
     *
     * @param id - 
     */
    public void deleteForecast ( URI id ){}
    /**
     * Operation getForecast
     *
     * @param id - 
     * @return Forecast
     */
    public Forecast getForecast ( URI id ){}
}

