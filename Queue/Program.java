public class Solution
{
    public static void main(String[] args)
    {
        Queue<Integer> myQueue = new Queue<>();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println(myQueue.Size());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.Size());
    }
}
