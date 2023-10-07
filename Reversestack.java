//-----------------------------------REVERSE THE STACK USING RECURSION-----------------------------------------------------
import java.util.Stack;

public class Reversestack {

    public static void reverse(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverse(stack);
            insert(stack, temp);
        }
    }

    public static void insert(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insert(stack, item);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        System.out.println(S);
        reverse(S);
        System.out.println(S);
    }
}
/*
 * Time Complexity: O(N^2)
 * Space Complexity: O(N)
 */
