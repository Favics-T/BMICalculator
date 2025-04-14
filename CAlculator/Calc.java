package CAlculator;

public class Calc {
    
    public int divide(int a, int b){
       if(b==0){
        throw new ArithmeticException(a+"cannot divide 0")
       }
       
        int result = a/b;
        return result;
       }
}
