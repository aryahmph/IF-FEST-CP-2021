package aryahmph;

import java.util.ArrayDeque;
import java.util.Deque;

public class KalkulatorSolution {
    public static int kalkulator(String statement) {
        String[] str = statement.split(" ");
        Deque<String> stack = new ArrayDeque<>();

        for (String s : str) {
            if (s.equals("+")) {
                int b = Integer.parseInt(stack.pollLast());
                int a = Integer.parseInt(stack.pollLast());
                stack.offerLast(Integer.toString(a + b));
            } else if (s.equals("-")) {
                int b = Integer.parseInt(stack.pollLast());
                int a = Integer.parseInt(stack.pollLast());
                stack.offerLast(Integer.toString(a - b));
            } else if (s.equals("*")) {
                int b = Integer.parseInt(stack.pollLast());
                int a = Integer.parseInt(stack.pollLast());
                stack.offerLast(Integer.toString(a * b));
            } else {
                stack.offerLast(s);
            }
        }

        return Integer.parseInt(stack.peekLast());
    }
}
