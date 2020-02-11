import java.util.*;
public class MainCalc {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();int a = sc.nextInt(); int b = sc.nextInt();
	        switch (x){
	            case 1:
	                AddCal add = new AddCal();
	                add.addition(a,b);
	                break;
	            case 2:
	                SubCalc sub = new SubCalc();
	                sub.subtraction(a,b);
	                break;
	            case 3:
	                MultCalc mul = new MultCalc();
	                mul.multi(a,b);
	                break;
	            case 4:
	                DivClass div = new DivClass();
	                div.division(a,b);
	                break;
	        }
	    }

	}


