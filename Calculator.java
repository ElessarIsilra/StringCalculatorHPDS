import java.util.EmptyStackException;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static java.lang.Integer.parseInt;

public class Calculator {


    public static int calculate(String s) throws Exception {
        String delimiter = ",|\n" ;
        if(s.isEmpty()){
            return 0;
        }
        String[] splitedString = s.split(delimiter);
        return getSum(splitedString);
    }
    private static int getSum(String[] splitedString) throws Exception {
        int returnedSum=0;
        for(int i =0;i<splitedString.length;i++){
            if(parseInt(splitedString[i])<=1000){
                findException(splitedString[i]);
                returnedSum+=parseInt(splitedString[i]);
            }
        }
        return returnedSum;
    }
    private static void findException(String number) throws Exception {
        if(parseInt(number)<0){
            throw new Exception("Números negativos no permitidos");
        }
    }
}

