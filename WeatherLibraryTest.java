import org.junit.Test;

import static org.junit.Assert.*;

public class WeatherLibraryTest
{

    @Test
    public void test_f2c_1()
    {
        double x = 32, e = 0;
        double y = WeatherLibrary.fahrenheitToCelsius(x);
        assertEquals(e, y, 0.001);
    }

    @Test
    public void test_f2c_2()
    {
        double x = 212, e = 100;
        double y = WeatherLibrary.fahrenheitToCelsius(x);
        assertEquals(e, y, 0.001);
    }

    @Test
    public void test_f2c_3()
    {
        double x = 50, e = 10;
        double y = WeatherLibrary.fahrenheitToCelsius(x);
        assertEquals(e, y, 0.001);
    }

    @Test
    public void test_c2f_1()
    {
        double x = 100, e = 212;
        double y = WeatherLibrary.celsiusToFahrenheit(x);
        assertEquals(e, y, 0.001);
    }

    @Test
    public void test_c2f_2()
    {
        double x = 100, e = 212;
        double y = WeatherLibrary.celsiusToFahrenheit(x);
        assertEquals(e, y, 0.001);
    }

    @Test
    public void test_c2f_3()
    {
        double x = 10, e = 50;
        double y = WeatherLibrary.celsiusToFahrenheit(x);
        assertEquals(e, y, 0.001);
    }
}