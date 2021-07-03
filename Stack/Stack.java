import java.util.*;

public class Stack
{
    private Node top;
    private int size;

    public void push(int data)
    {
        Node nodeToPush = new Node(data);
        nodeToPush.next = top;
        top = nodeToPush;

        size++;
    }

    public int pop()
    {
        int data;

        if (!isEmpty())
        {
            data = top.value;
            top = top.next;
            size--;
        }
        else
        {
            throw new EmptyStackException();
        }

        return data;
    }

    public int peek()
    {
        if (!isEmpty())
        {
            return top.value;
        }

        throw new EmptyStackException();
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    public void printStack()
    {
        Node current = top;

        while (current != null)
        {
            System.out.println(current.value + " ");
            current = current.next;
        }
    }
}
