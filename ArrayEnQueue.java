import java.util.*;
public class ArrayEnQueue{
protected int capacity;
protected int[] queue;
protected int front=-1;
protected int rear= -1;
public ArrayEnQueue(int cap) {
capacity = cap;
queue = new int[capacity];
}
public int size()
{
    return (rear+1);
}
public void enQueue(int data)
{

// Type your code here
if (isFull())
{
System.out.println("Queue is Overflow. Not possible to insert in Full Queue");
display();
}
else
{
queue[++rear] = data;
System.out.println("Element is inserted");
}


}
public boolean isFull()
{

// Type your code here
    return (size()==capacity);
}
public boolean isEmpty()
{

// Type your code here
return (front==rear);
}


public void display()
{
    if(isEmpty())
System.out.println("Queue is Underflow. No elements to display in Empty Queue");
    else
    {
System.out.println("Queue Elements");
for(int i=front+1;i<=rear;i++)
System.out.print(queue[i]+"\t");
System.out.print("\n");
    }
}
public static void main(String[] args)
{
    int n;
     Scanner sc=new Scanner(System.in);
int data;
    char ch;
     System.out.println("EnQueue Using Array");
    System.out.println("Enter the number of elements to be inserted:");

// Type your code here
    n=sc.nextInt();
    ArrayEnQueue q=new ArrayEnQueue(n);
    do
    {
System.out.println("Enter the element to insert:");
        data=sc.nextInt();
q.enQueue(data);
System.out.println("Do you want to insert(y/n):");
ch=sc.next().charAt(0);
}
while(ch!='n');
q.display();
}
}