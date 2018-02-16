import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ParamAdderTest
{

    private static final String line_ending = System.lineSeparator();
    private PrintStream std_out;
    private ByteArrayOutputStream mock_out;

    @Before
    public void setUp()
    {
        std_out = System.out;
        mock_out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(mock_out));
    }

    @After
    public void tearDown()
    {
        System.setOut(std_out);
    }

    @Test
    public void test_no_params()
    {
        String[] params = new String[]{};
        ParamAdder.main(params);
        String y = mock_out.toString();
        String e = "0"+line_ending;
        assertEquals(e, y);
    }

    @Test
    public void test_with_params_1()
    {
        String[] params = new String[]{"1", "3", "5", "-2", "4"};
        ParamAdder.main(params);
        String y = mock_out.toString();
        String e = "11"+line_ending;
        assertEquals(e, y);
    }

    @Test
    public void test_with_params_2()
    {
        String[] params = new String[]{"100", "50", "-200", "50"};
        ParamAdder.main(params);
        String y = mock_out.toString();
        String e = "0"+line_ending;
        assertEquals(e, y);
    }
}