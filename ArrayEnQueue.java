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

}
public boolean isFull()
{

// Type your code here
}
public boolean isEmpty()
{

// Type your code here
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


} 
