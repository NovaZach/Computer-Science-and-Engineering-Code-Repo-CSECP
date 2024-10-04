import java.util.Scanner;
public class odd_even {
public static void main (String[] args)
{
	System.out.println("enter array limits");
	int[] num = new int[100];
	int i,lim,odd=0,even=0;
	Scanner sc = new Scanner(System.in);
	lim = sc.nextInt();
	
	System.out.println("enter elements: ");
	
	for(i=0;i<lim;i++) {
		num[i] = sc.nextInt(); }
	
	for(i=0;i<lim;i++) {
		if(num[i]%2 == 0) {
			even++ ; }
		
		else {
			odd++ ;}
			}
			
		System.out.println("odd= " +odd);
		System.out.println("even= " +even);
		}
	}
