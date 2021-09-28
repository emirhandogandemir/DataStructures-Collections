package dataStructures.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    private static BlockingQueue queue = new ArrayBlockingQueue<>(10);
    public static void main(String[] args) throws InterruptedException {

        /*
        // javanın içerisindeki queue yapısı
        Queue<String> queue = new LinkedList<String>();
        queue.offer("ahmet");
        queue.offer("mehmet");
        queue.offer("burak");
        System.out.println("Kuyruk sırasına göre çıkartılıyor ");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }

        //

        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("Ahmet");
        priorityQueue.offer("Mehmet");
        priorityQueue.offer("Mehmat");
        System.out.println("Artan sırada çıkartılacak");
        while(priorityQueue.size()>0){
            System.out.println(priorityQueue.remove());
        }

        */
        /*
        Queue<Book> queue = new PriorityQueue<Book>();
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b4 = new Book(122, "et us C", "Yashwant Kanetkar", "BPB", 8);
        queue.offer(b1);
        queue.offer(b2);
        queue.offer(b3);
        queue.offer(b4);
        for (Book b : queue) {
            System.out.println(b.id + " " + b.name + " " + b.author);
        }*/

    }

}
