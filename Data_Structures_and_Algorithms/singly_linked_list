#include<stdio.h>
#include<stdlib.h>
struct Node{
	int val;
	struct Node *next;
};
struct Node * head=NULL;
struct Node *link;
struct Node *ptr,*ptr1;
void create(){
	int item;
	link=(struct Node*)malloc(sizeof(struct Node));
	printf("enter item");
	scanf("%d",&item);
	link->val=item;
	link->next=NULL;

}
void iend(){
	if(head==NULL){
		head=link;
	}
	else{
		ptr=head;
		while(ptr->next!=NULL){
			ptr=ptr->next;
		}
		ptr->next=link;
	}
}
void istart(){
	if(head==NULL){
		head=link;
	}
	else{
		link->next=head;
		head=link;
	}
	
	
}
void inode(){
	int item;
	printf("enter the node after you want to insert");
	scanf("%d",&item);
	ptr=head;
	while(ptr->val!=item){
		ptr=ptr->next;
	}
	link->next=ptr->next;
	ptr->next=link;
	
}
void dbeg(){
	if(head==NULL){
		printf("stack empty");
	}
	else if(head->next==NULL){
		printf("%d deleted ",head->val);
		ptr=head;
		head=NULL;
		free(ptr);
	}
	else{
		ptr=head;
		head=head->next;
		free(ptr);	
	}
}
void dend(){
	if(head==NULL){
		printf("stack empty");
	}
	else if(head->next==NULL){
		printf("%d deleted ",head->val);
		ptr=head;
		head=NULL;
		free(ptr);
	}
	else{
		ptr=head;
		ptr1=ptr->next;
		while(ptr1->next!=NULL){
			ptr=ptr1;
			ptr1=ptr1->next;
		}
		printf("%d deleted",ptr1->val);
		ptr->next=NULL;
		free(ptr1);
	}
}
void dnode(){
	int item;
	printf("enter node to be deleted");
	scanf("%d",&item);
	if(head==NULL){
		printf("stack empty");
	}
	else if(head->val==item){
		printf("%d deleted ",head->val);
		ptr=head;
		head=NULL;
		free(ptr);
	}
	else{
		ptr=head;
		ptr1=ptr->next;
		while(ptr1->val!=item){
			ptr=ptr1;
			ptr1=ptr1->next;
		}
		ptr->next=ptr1->next;
		free(ptr1);
	}
}
void display(){
	ptr=head;
	while(ptr!=NULL){
		printf("%d->",ptr->val);
		ptr=ptr->next;
	}
	printf("Null\n");
}
void main(){
	int ch;
	do{
		printf("\n1.insertion from front\n");
		printf("\n2.insertion from behind\n");
		printf("\n3.insertion from a node\n");
		printf("\n4.deletion from front\n");
		printf("\n5.deletion from behind\n");
		printf("\n6.deletion at a nodee\n");
		printf("\n7.display\n");
		
	       printf("enter your choice ");
		scanf("%d",&ch);
		switch(ch){
			case 1:
			create();
			istart();
			break;
			case 2:
			create();
			iend();
			break;
			case 3:
			create();
			inode();
			break;
			case 4:
			dbeg();
			break;
			case 5:
			dend();
			break;
			case 6:
			dnode();
			break;
			case 7:
			display();
			break;
		}
	}while(ch!=8);
	
	
}
