public class Queue<T>
{
    private Node<T> head;
    private Node<T> tail;
    private int counter;

    public Queue()
    {
        this.head = null;
        this.tail = null;
        this.counter = 0;
    }

    public void enqueue(T value)
    {
        if (this.head == null)
        {
            head = new Node<T>();
            tail = head;
            head.data = value;
        }
        else
        {
            Node<T> temp = new Node<>();
            temp.data = value;
            temp.next = head;
            head.previous = temp;
            head = temp;
        }

        counter++;
    }

    private T dequeue()
    {
        if (tail == null)
        {
            throw new NullPointerException();
        }

        T newValue = tail.data;

        if (tail.previous == null)
        {
            head = null;
            tail = null;
        }
        else
        {
            tail = tail.previous;
            tail.next = null;
        }

        counter--;

        return newValue;
    }

    public int Size()
    {
        return counter;
    }
}
