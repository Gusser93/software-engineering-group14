import Forecast;
import Dataset;
import Model;
import ForecastPresentation;

public class ForecastModel extends Model
{
    /** Attributes */
    /**
     * 
     */
    private Forecast forecast;
    /** Associations */
    private ForecastPresentation uses;
    /**
     * Operation prognose
     *
     * @param parameter - 
     * @param model - 
     * @return Forecast
     */
    public Forecast prognose ( Dataset parameter, Model model ){}
    /**
     * Operation getForecast
     *
     * @return Forecast
     */
    public Forecast getForecast (  ){}
    /**
     * Operation setForecast
     *
     * @param forecast - 
     */
    public void setForecast ( Forecast forecast ){}
}

