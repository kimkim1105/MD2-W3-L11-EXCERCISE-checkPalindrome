import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi: ");
        String str = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.toLowerCase().charAt(i));
            queue.offer(str.toLowerCase().charAt(i));
        }
        if (check(stack,queue)){
            System.out.println("Chuỗi nhập vào là Palidrome");
        }else {
            System.out.println("Chuỗi nhập vào không là Palidrome");
        }
//        System.out.println(stack);
//        System.out.println(queue);
    }
    public static boolean check(Stack stack,Queue queue){
        while (!stack.isEmpty()){
            if (stack.pop()!=queue.poll())
                return false;
        }return true;
    }
}
