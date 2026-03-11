package calculator;

import org.testng.annotations.*;

public class basic_math {
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("method started: ");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("method ended: ");
	}
	

    @BeforeClass
    public void beforeClass() {
        System.out.println("basic_class Started");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("basic calss Ended\n\n\n");
    }

    @DataProvider(name = "mathData")
    public Object[][] getData() {
        return new Object[][] {
                {100, 5}
        };
    }

    @Test(priority = 3, dataProvider = "mathData", groups ="G1")
    public void add(int a, int b) {
        System.out.println("Add = " + (a + b));
    }

    @Test(priority = 1, dataProvider = "mathData", groups ="G2")
    public void div(int a, int b) {
        System.out.println("Div = " + (a / b));
    }

    @Test(priority = 2, dataProvider = "mathData", groups ="G2")
    public void mul(int a, int b) {
        System.out.println("Mul = " + (a * b));
    }

    @Test(priority = 4, dataProvider = "mathData", groups ="G1")
    public void sub(int a, int b) {
        System.out.println("Sub = " + (a - b));
    }
}
