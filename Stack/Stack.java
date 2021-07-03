import java.util.*;

public class Stack<T>
{
    private Node top;
    private int size;

    public void push(T data)
    {
        Node nodeToPush = new Node(data);
        nodeToPush.next = top;
        top = nodeToPush;

        size++;
    }

    public T pop()
    {
        T data;

        if (!isEmpty())
        {
            data = (T)top.value;
            top = top.next;
            size--;
        }
        else
        {
            throw new EmptyStackException();
        }

        return data;
    }

    public T peek()
    {
        if (!isEmpty())
        {
            return (T)top.value;
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
