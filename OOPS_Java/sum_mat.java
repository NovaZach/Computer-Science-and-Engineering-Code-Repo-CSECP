import java.util.Scanner;
public class sum_mat {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
	        //x,y,X,Y,t=0
        int lim1x,lim2x,lim1y,lim2y,i,j,flag=0;

	    System.out.println("no: of rows max1 = no: of max2");

	    System.out.println("enter array limits (1)");	
	    lim1x = sc.nextInt();
	    lim1y = sc.nextInt();
	
	    System.out.println("enter array limits (2)");
	    lim2x = sc.nextInt();
	    lim2y = sc.nextInt();
	
	    //fc=1
	    if ( lim1x == lim2x && lim1y == lim2y ){ 
		    flag = 1;
		    }
	    else {
		    System.out.println("Cannot compute"); }
	
	    int[][]arr1 = new int[10][10];
	    int[][]arr2 = new int [10][10];
	    int[][]res_arr = new int [10][10];
	
	    //5678
	    if (flag == 1) {
	
	        for(i=0;i<lim1x;i++) {
		        for(j=0;j<lim1y;j++){
			        System.out.println("enter elements for 1");
			        arr1[i][j] = sc.nextInt();
			    }
		    }
		
	        System.out.println("\n");

	    //""5678
	        for(i=0;i<lim1x;i++) {
		        for(j=0;j<lim1y;j++) {
			        System.out.print("\t" +arr1[i][j]);
			    }
			    System.out.println ("\n");
		    }
		
	        System.out.println("\n");
	
	    //8979
	        for(i=0;i<lim1x;i++) {
		        for(j=0;j<lim1y;j++){
			        System.out.println("\nenter elements for 2");
			        arr2[i][j] = sc.nextInt();
			    }
		    }
		
	        System.out.println("\n");

	    //""8979	
	        for(i=0;i<lim1x;i++) {
		        for(j=0;j<lim1y;j++) {
			        System.out.print("\t" +arr2[i][j]);
			    }
			System.out.println ("\n");
		    }
		
	        System.out.println("\n");
	
	    //255+255+255+255
	        for(i=0;i<lim1x;i++) {
		        for(j=0;j<lim1y;j++){
			        res_arr[i][j] = arr1[i][j] + arr2[i][j];
				}
			}
			
	        System.out.println("SUM");
	
	    //""255+255+255+255	
	        for(i=0;i<lim1x;i++) {
		        for(j=0;j<lim1y;j++){
			        System.out.print ("\t" +res_arr[i][j]);
				}
			System.out.println ("\n");
			}
				
	        System.out.println ("transpose of the matrix");
	
	    //69=96
	        for(j=0;j<lim1y;j++) {
		        for(i=0;i<lim1x;i++){
			        System.out.print("\t"+res_arr[i][j]);
                }	
			    System.out.println ("\t"); 
            }
		}
	}
}
