import org.junit.Test;

import static org.junit.Assert.*;

/*
 *  90 -> 100 : A
 *  80 ->  89 : B
 *  70 ->  79 : C
 *  65 ->  69 : D
 *   0 ->  64 : F
 *  invalid   : X
 */

public class LetterGraderTest
{

    @Test
    public void test_grade_to_letter()
    {
        char A='A', B='B', C='C', D='D', F='F', X='X';
        double[] test_input = {-1, 0, 1, 64, 65, 69, 70, 75, 79, 80, 85, 89, 90, 95, 99, 100, 101};
        char[] test_output = {X, F, F, F, D, D, C, C, C, B, B, B, A, A, A, A, X};
        for(int i=0; i<test_input.length; i++)
        {
            double x = test_input[i];
            char e = test_output[i];
            char y = LetterGrader.grade2letter(x);
            assertEquals(String.format("[grade: %.1f] [expected: %c] [actual: %c]", x, e, y), e+"", y+"");
        }
    }

}