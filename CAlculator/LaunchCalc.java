package CAlculator;

public class LaunchCalc {
    public static void main(String []args){
        Calc c = new Calc();
      int result =  c.divide(10, 5);
//manual testing
        if(result == 2){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Test failed");
        }

        // steps for running junt

        /*
         * prepare (setup a test enviroment, write test methods)
         * provide testing input
         * run the test
         * provide the expected output
         * perform assertion
         * report test results(alert developer if test failed or passed)
         */
    }
}
