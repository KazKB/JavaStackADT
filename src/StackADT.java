import java.util.Stack;

public class StackADT {
    public static void main(String[] args) {
        String x, y;
        Stack<String> intStack = new Stack<>();

        intStack.push("Kaleel");
        intStack.push("Tariq");
        intStack.push("Boston");
        System.out.println("Integers on the stack: " + intStack);

        x = intStack.pop();
        System.out.println("Removed item: " + x);

        y = intStack.peek();
        System.out.println("Top item: " + y);

        intStack.add("KazKJr");
        System.out.println("Stack after add: " + intStack);
        System.out.println(intStack.capacity());
    }
}
