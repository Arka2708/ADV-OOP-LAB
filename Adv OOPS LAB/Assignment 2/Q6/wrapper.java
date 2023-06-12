package Q6;

/* Q6. Consider a wrapper class for numeric basic data type. check the support for the following conversion:
 *  i) basic type to object type. 
 *  ii) object to basic type.
 *  iii) basic type to string type.
 *  iv) string(holding numeric data) to numeric object.
 *  v) object to string.
 */
import java.util.*;

public class wrapper {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number of Integer type= ");
        int n=in.nextInt();
        int ob=Integer.valueOf(n); //Conversion from basic type to object
        System.out.println("Number after conversion from basic to object= "+ob);

        System.out.print("Enter a number to be stored in Integer object");
        Integer obj=Integer.valueOf(in.nextInt());//object to basic type.
        System.out.println("Number after conversion from obejct to basic type= "+obj.intValue());
        System.out.print("");
        
        System.out.println("Using the first number to do String checkers as asked in the problem.");
        System.out.print("");
        String s=Integer.toString(n);//basic type to string type.
        System.out.println("The number after being converted to String= "+s);
        System.out.print("");

        String numStr="144";
        System.out.println("We have considered String \"144\" and using it for conversion.");
        System.out.print("");
        int num=Integer.parseInt(numStr);//string(holding numeric data) to numeric object.
        System.out.println("The converted number is= "+num);
        
        Integer numObj = Integer.valueOf(num);
        String xd=Integer.toString(numObj);//object to string.
        System.out.println("The final string is= "+xd);
        in.close();
    }
}