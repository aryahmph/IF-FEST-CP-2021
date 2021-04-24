package aryahmph;

import java.util.ArrayDeque;
import java.util.Deque;

public class HapusKataHMIFSolution {
    public static int hapusKataHMIF(String word) {
        int deletedCount = 0;
        Deque<Character> stack = new ArrayDeque<>(word.length());

        for (char c : word.toCharArray()) {
            stack.offerLast(c);

            if (stack.size() > 3 && stack.peekLast() == 'F') {
                stack.pollLast();
                if (stack.peekLast() == 'I') {
                    stack.pollLast();
                    if (stack.peekLast() == 'M') {
                        stack.pollLast();
                        if (stack.peekLast() == 'H') {
                            stack.pollLast();
                            deletedCount++;
                        }
                    }
                }
            }
        }
        System.out.println(stack);
        return deletedCount;
    }
}
