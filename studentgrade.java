import java.util.Scanner;
public class studentgrade
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of subjects you had:");
	int nsub=sc.nextInt();
	if(nsub <= 0)
	{
		System.out.println("enter  correct number of subjects");
		return;
	}
	int totalmarks = 0;
	int maxmarkspersubject = 100;
	for( int i=1;i<=nsub;i++)
	{
		System.out.print("Enter marks obtained" + i + "(out of 100):");
		int marks = sc.nextInt();
		if(marks <0 || marks > maxmarkspersubject)
		{
			System.out.println("enter valid marks");
			i--;
		}
		else
		{
			totalmarks += marks;
		}
	}
	double averagepercentage = (double) totalmarks / (nsub * maxmarkspersubject)*100;
	System.out.println("Total marks:" + totalmarks);
	System.out.println("Average percentage:" + averagepercentage + "%");
	String grade;
	if(averagepercentage >=90)
	{
		grade = "O";
	}
	if(averagepercentage >=80)
	{
		grade = "+A";
	}
	if(averagepercentage >=70)
	{
		grade = "A";
	}
	if(averagepercentage >=60)
	{
		grade = "B+";
	}
	if(averagepercentage >=50)
	{
		grade = "B";
	}
	if(averagepercentage >=40)
	{
		grade = "C";
	}
	else{
		grade = "F";
	}
	System.out.println("grade:" + grade);
}
}