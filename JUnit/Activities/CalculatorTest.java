package examples;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import exmaples.Calculator;

// The Test class should start or end with "Test"
public class CalculatorTest {
	Calculator cal;

	@BeforeEach
	public void setUp() {
		cal = new Calculator();
	}

	@Test
	public void addTest() {
		// perform add function
		int result1 = cal.add(10, 20);
		int result2 = cal.add(15, 15);
		int result3 = cal.add(25, 5);

		// add assertion statement to verify aginst expected result
		assertAll(
				() -> assertEquals(30, result1),
				() -> assertEquals(30, result2), 
				() -> assertEquals(30, result3)
				);
	}

	@Test
	public void multiply() {
		// perform add function
		int result = cal.multiply(10, 20);

		// add assertion statement to verify aginst expected result
		assertEquals(200, result);
	}
	@ParameterizedTest
	@ValueSource(ints= {10,20,25,100})
	public void paramqrTest(int num1)
	{
		// perform square function
		int result = cal.square(num1);
		// add assertion statement to verify aginst expected result
				assertEquals(num1*num1, result);
	}
	@ParameterizedTest
	@CsvSource({"10,90","50,50","30,70"})
	public void paramaddTest(int num1,int num2)
	{
		// perform square function
		int result = cal.add(num1,num2);
		// add assertion statement to verify aginst expected result
				assertEquals(100, result);
	}
	@ParameterizedTest
	@CsvFileSource(files="src/test/resources/input",nullValues= {"N/A","NA","-"})
	public void AggregateTest(ArgumentsAccessor args) {
		System.out.println(args.getString(0)+"Has only"+args.getInteger(3)+3 +"Sick days remaining");
	}
	}
	
