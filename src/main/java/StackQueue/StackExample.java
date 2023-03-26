package StackQueue;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Tạo một đối tượng Stack
        Stack<String> stack = new Stack<>();

        // Thêm phần tử vào Stack
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // In ra các phần tử của Stack
        System.out.println("Các phần tử trong Stack: " + stack);

        // Lấy phần tử ở đỉnh Stack nhưng không xóa nó
        String top = stack.peek();
        System.out.println("Phần tử ở đỉnh Stack: " + top);

        // Lấy và xóa phần tử ở đỉnh Stack
        String pop = stack.pop();
        System.out.println("Phần tử vừa lấy ra khỏi Stack: " + pop);

        // Kiểm tra xem Stack có rỗng không
        boolean empty = stack.empty();
        System.out.println("Stack có rỗng không? " + empty);

        // Tìm vị trí của phần tử "B" trong Stack
        int position = stack.search("B");
        System.out.println("Vị trí của phần tử 'B' trong Stack: " + position);
    }
}