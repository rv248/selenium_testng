package calculator;

import org.testng.annotations.*;

public class adv_math {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Class Started");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Class Ended");
    }

    @Test(priority = 1)
    @Parameters({"a"})
    public void cube(int a) {
        System.out.println("Cube = " + (a*a*a));
    }

    @Test(priority = 2)
    @Parameters({"a"})
    public void square(int a) {
        System.out.println("Square = " + (a*a/1));
    }
    @Test
    @Parameters({"a"})  
    public void power4(int a){
        System.out.println("power4 = "+ (a*a*a*a));
    }
    @Test
    @Parameters({"a"})
    public void power5(int a){
        System.out.println("power5 = "+ (a*a*a*a*a));
    }
}
