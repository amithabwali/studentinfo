package studentinformation;
import java.util.Scanner;
public class studentinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.println("enter the no of students");
int n=scn.nextInt();
System.out.println("enter the pass marks");
int pm=scn.nextInt();
int pass=0;
int fail=0;
for(int i=0;i<n;i++)
{
	System.out.println("enter the name of student");
	String name=scn.next();
	System.out.println("enter the marks of the student");
	double marks=scn.nextDouble();
	if(marks>pm)
	{
		System.out.println("pass");
		pass++;
	}
	else
	{
		System.out.println("fail");
		fail++;
	}
}
System.out.println("the no of students failed are "+pass);
System.out.println("the no students failed are  "+fail);
	}

}
