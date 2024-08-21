import java.util.Scanner;
public class DigitReverse{
public static void main(String[] args)
{
int n,number,revnum=0;
Scanner sc = new Scanner (System.in);
System.out.print("enter a number ");
number = sc.nextInt();
while (number >0){
n = number % 10;
number = number/10;
revnum = revnum*10+n;}
System.out.print("number: "+revnum);
System.out.print('\n');
sc.close();}} 
