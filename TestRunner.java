import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.HashMap;

class TestRunner
{

    private static final int max = 25, min = 2;
    private static final HashMap<String, Integer> penalties = new HashMap<>();

    static
    {
        penalties.put("test_grade_to_letter", 5);
        penalties.put("test_no_params", 2);
        penalties.put("test_with_params_1", 2);
        penalties.put("test_with_params_2", 2);
        penalties.put("test_f2c_1", 2);
        penalties.put("test_f2c_2", 2);
        penalties.put("test_f2c_3", 2);
        penalties.put("test_c2f_1", 2);
        penalties.put("test_c2f_2", 2);
        penalties.put("test_c2f_3", 2);

    }

    public static void main(String[] args)
    {
        Result letter_grade_result = JUnitCore.runClasses(LetterGraderTest.class);
        Result weather_library_result = JUnitCore.runClasses(WeatherLibraryTest.class);
        Result param_adder_result = JUnitCore.runClasses(ParamAdderTest.class);
        Result[] results = new Result[]{letter_grade_result, weather_library_result, param_adder_result};

        int grade = max;

        for(Result result: results)
        {
            for (Failure failure : result.getFailures())
            {
                String name = failure.getTestHeader().split("[(]")[0];
                System.err.printf("failed test: %s\n", name);
                grade -= penalties.get(name);
            }
        }

        if(grade < min)
            grade = min;

        System.out.println(grade);
    }
}
