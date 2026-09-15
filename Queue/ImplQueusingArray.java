import java.util.*;

public class ImplQueusingArray { 
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        Queue s = new Queue(); 
        int v;
        
        do {
            System.out.println("PRESS 1 TO (ENQUEUE):");
            System.out.println("PRESS 2 TO (DEQUEUE):");
            System.out.println("PRESS 0 TO DISPLAY:");
            System.out.println("ENTER YOUR CHOICE:");
            d = sc.nextInt();
            
            switch(d) {
                case 1: {
                    s.enqueue(sc);
                    break;
                }
                case 2: {
                    s.dequeue();
                    break;
                }
                case 0: {
                    s.display();
                    break;
                }
            }
            
            System.out.println("ENTER 0 TO COME BACK TO MAIN MENU:");
            System.out.println("PRESS ANY OTHER NUMBER TO EXIT");
            v = sc.nextInt();
        } while(v == 0);
        
        System.out.println("Exit successfully");
        sc.close();
    }
}

class Queue {
    int f = -1, r = -1;
    int n = 10;
    int q[] = new int[n];

    void enqueue(Scanner sc) {
        if (r == n - 1) {
            System.out.println("Overflow: Queue is full");
        } else {
            System.out.println("Enter data: ");
            int i = sc.nextInt();
            if (f == -1 && r == -1) {
                f = 0;
                r = 0;
                q[r] = i; 
            } else {
                r = r + 1;
                q[r] = i;
            }
            System.out.println("Item inserted successfully.");
        }
    }

    void dequeue() {
        if (f == -1 || f > r) {
            System.out.println("Underflow: Queue is empty");
            f = -1;
            r = -1;
        } else {
            System.out.println("Dequeued item: " + q[f]);
            f = f + 1;
            // Reset pointers if queue becomes empty after deletion
            if (f > r) {
                f = -1;
                r = -1;
            }
        }
    }
    void display() {
        if (f == -1 || f > r) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Items are: ");
            for (int i = f; i <= r; i++) {
                System.out.println(q[i]);
            }
        }
    }
}
