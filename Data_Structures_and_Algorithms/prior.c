#include <stdio.h>
#include <stdlib.h>
struct node
{ int item;
int priority;
struct node* next; };
struct node *front = NULL;
struct node *temp;
struct node *rear= NULL;
struct node *ptr;
struct node *ptr1= NULL;
void enque()
{int value, priority, t;
temp = (struct node*)malloc(sizeof(struct node));
printf("Enter value to add and its priority: ");
scanf("%d %d", &value, &priority);
temp->item = value;
temp->priority = priority;
temp->next = NULL;
if(rear==NULL)
{front=rear=temp; }
else
{ rear->next=temp;
rear=temp;
ptr=front;
ptr1=rear;
while(ptr->next != NULL)
{if(ptr1->priority < ptr->priority)
{ t= ptr1->priority;
ptr1->priority= ptr->priority;

ptr->priority= t;
t= ptr1->item;
ptr1->item= ptr->item;
ptr->item= t;
ptr=ptr->next; }
else
{ptr=ptr->next; }}}}

void deque()
{ if (front == NULL)
{ printf("The priority queue is empty.\n"); }
else
{ temp = front;
printf("Element %d with priority %d deleted.\n", temp->item, temp->priority);
front= temp->next;
if (front == NULL)
{ rear = NULL; }
free(temp); }}
void display()
{ if (front == NULL)
{ printf("The priority queue is empty.\n"); }
else {
temp = front;
printf("Priority Queue:\n");
while (temp != NULL) {
printf("Element: %d, Priority: %d\n", temp->item, temp->priority);
temp = temp->next; } }}
void main()
{ int ch, value, pri;
while (1)
{ printf("\n----------Priority Queue Menu----------\n");
printf("1. Add an element\n2. Delete an element\n3. Display the queue\n4. Exit\n");
printf("Enter your choice: ");
scanf("%d", &ch);
switch (ch)
{ case 1:
enque();
break;
case 2:
deque();
break;
case 3:
display();
break;
case 4:
exit(0);
default:
printf("Invalid choice. Please try again.\n"); } } }
