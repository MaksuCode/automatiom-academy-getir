import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.* ;

import java.util.stream.Stream;

public class SalaryCalculatorTest {


    @ParameterizedTest
    @MethodSource("provideTestValue")
    public void test(double baseSalary , int weekDayHours , int weekendHours , int expectedFinalSalary ){
        SalaryCalculator calculator = new SalaryCalculator();

        calculator.setBaseSalary(baseSalary);
        calculator.setWorkingWeekdayHours(weekDayHours);
        calculator.setWorkingWeekendHours(weekendHours);
        calculator.calculateTotalWorkingHours();

        assertEquals(expectedFinalSalary , calculator.calculateFinalSalary() , "NOT COOL!");

    }


    private static Stream<Arguments> provideTestValue(){
        return Stream.of(
               Arguments.of(900 , 0 , 0 , 0),
              Arguments.of(2000 , 30 , 0 , 1500) ,
                Arguments.of(2000 , 30 , 5 , 1750),
               Arguments.of(2000 , 40 , 5 , 2500),
                Arguments.of(2000 , 45 , 0 , 2375),
                Arguments.of(2000 , 60 , 0 , 3500),
                Arguments.of(2000 , 40 , 10 , 3500),
                Arguments.of(2000 , 40 , 20 , 4500),
                Arguments.of(2000 , 30 , 30 , 4000),
                Arguments.of(2000 , 30 , 20 , 3000),
                Arguments.of(2000 , 30 , 10 , 2000),
                Arguments.of(2000 , 50 , 20 , 5250)
        );
    }





}
