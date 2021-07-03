public class Program
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
