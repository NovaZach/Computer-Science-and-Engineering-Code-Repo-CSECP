import java.util.Scanner;
public class GradeMaker {
public static void main (String[] args)
{
int mark;
char grade;
Scanner sc = new Scanner (System.in);	
System.out.print("enter the mark ");
mark= sc.nextInt();
if( mark>90 )
{grade = 'A';}
else if( mark>70 )
{grade = 'B';}	
else 
{grade = 'F';}	
System.out.print("grade is "+grade);
System.out.print("\n");
sc.close();}}
