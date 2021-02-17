package Collections.OptionalTasks.SecondTask;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        Arrays.stream(Integer.toString(number).split("")).forEach(digit -> stack.push(Integer.parseInt(digit)));
        for(int i = 0; i <stack.size();){
            System.out.print(stack.pop());
        }
    }
}

