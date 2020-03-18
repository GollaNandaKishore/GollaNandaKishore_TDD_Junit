package TDD_Junit;
import java.util.*;
public class Junit_Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		String res=cal(str);
		System.out.println(res);
	}
	public static String cal(String str)
	{
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(i>1)
				res=res+str.charAt(i);
			else if(i<=1 && str.charAt(i)!='A')
				res=res+str.charAt(i);
				
		}
		return(res);
	}
}
