import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class CalculatorTest {

        private Calculator calculator;

        @Before
        public void before() {
            calculator = new Calculator(10, 5, 20, 2);
        }


        @Test
        public void has_first_number() {
            assertEquals(10, calculator.getNum1());
        }

        @Test
        public void has_second_number() {
            assertEquals(5, calculator.getNum2());
        }

        @Test
        public void calculator_can_add(){
            assertEquals(15, calculator.getAddSum());
        }

        @Test
        public void calculator_can_subtract() {
            assertEquals(5, calculator.getSubtractSum());
        }

        @Test
        public void calculator_can_multiply() {
            assertEquals(50, calculator.getMultiplySum());
        }

        @Test
        public void calculator_can_divide(){
            assertEquals(10, calculator.getDivideSum(), 0.01);
        }


    }
