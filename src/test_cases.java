import org.testng.annotations.Test;

public class test_cases {

    @Test
    void steup(){
        System.out.println(" i am inside setup");
    }
    @Test
    void testSteps(){
        System.out.println("I am inside test step");
    }
    @Test
    void tearDown(){
        System.out.println("I am inside teardown");
    }
}
