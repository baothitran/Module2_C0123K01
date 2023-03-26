package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Tạo một đối tượng Queue
        Queue<String> queue = new LinkedList<>();

        // Thêm phần tử vào Queue
        queue.add("A");
        queue.add("B");
        queue.add("C");

        // In ra các phần tử của Queue
        System.out.println("Các phần tử trong Queue: " + queue);

        // Lấy phần tử đầu tiên của Queue nhưng không xóa nó
        String head = queue.peek();
        System.out.println("Phần tử đầu tiên của Queue: " + head);

        // Lấy và xóa phần tử đầu tiên của Queue
        String poll = queue.poll();
        System.out.println("Phần tử vừa lấy ra khỏi Queue: " + poll);

        // Thêm phần tử vào Queue bằng phương thức offer()
        queue.offer("D");
        System.out.println("Các phần tử trong Queue sau khi thêm D: " + queue);

        // Lấy phần tử đầu tiên của Queue bằng phương thức element()
        String first = queue.element();
        System.out.println("Phần tử đầu tiên của Queue bằng element(): " + first);

        // Kiểm tra xem Queue có rỗng không
        boolean empty = queue.isEmpty();
        System.out.println("Queue có rỗng không? " + empty);
    }
}