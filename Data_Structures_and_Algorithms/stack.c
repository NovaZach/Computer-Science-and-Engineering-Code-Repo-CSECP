#include <stdio.h>   
int a[100],i,j,choice=0,n,top=-1,x;  //n is the max size of the array

void push(int i);  
void pop();  
void stack(); 

void push (int i)  {
    		if (top == n-1 )   
    		printf("\n Overflow state");  //there are more elements than there is limit 
    		else   {
    		        
        	top++;   // top +1 adds the value that you entered into the stack basically at the very bottom
       	 a[top] = i;   
    		}   
	}  
	 
 void pop () {  
	int j;
    	if(top == -1)   // if there are no elements in the stack underflow state
    	printf("Underflow state\t");  
    	
    	else  {
    	j=a[top];
    	top--;   //top -- takes away a value that you entered into the stack at the very top
		}  
	} 
	
	void stack()  {
		printf("Stack is:"); // stack display that is , just to display the stack
    		for (i=top;i>=0;i--)  {  
        		printf("%d\t",a[i]);  // prints the array as the stack that is the index would be reversed
    			}  
    			
    	if(top == -1) {  
        	printf("empty");  // check case to see if the stack is empty 
    			}  
		}  
	
void main ()	{  
      
    printf("Enter no: of ele: ");   
    scanf("%d",&n);   
    printf("pick choice:\n1.Push\n2.Pop\n3.Show\n4.Exit");
    while(choice != 4)  {    
    	
        printf("\nchoice:");        
        scanf("%d",&choice);  
        switch(choice)  { //menu driven for the same thng it is obvious
        
            case 1: { 
            printf("Enter element to be added:");
            scanf("%d",&x);
                push(x);  
                break;  } 
            
            case 2:  {
                pop();
                stack();  
                break;  }
              
            case 3:  {
                stack();  
                break;  }

            case 4:   {
                printf("lol bye");  
                break; }  
 
            default: { 
                printf("pick the right thing");  
            }   
        } 
    }  
}  
 

   
  

