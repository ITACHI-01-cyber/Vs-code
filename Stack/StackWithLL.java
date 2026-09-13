import java.util.*;

class Stack{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;
    void push(Scanner sc){
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if(top == null){
            top = new_node;
        }
        else{
            new_node.next = top;
            top = new_node;
        }
    }
    void pop(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            top = top.next;
        }
    }
    void display(){
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class StackWithLL {
     public static void main(String[] args){
        int d;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int v;
        do{
            System.out.println("PRESS 1 TO PUSH:");
            System.out.println("PRESS 2 TO POP:");
            System.out.println("PRESS 0 TO DISPLAY:");
            System.out.println("ENTER YOUR CHOISE:");
            d = sc.nextInt();
            switch(d){
                case 1:{
                    s.push(sc);
                    break;
                }
                case 2:{
                    s.pop();
                    break;
                }
                case 0:{
                    s.display();
                    break;
                }
            }
            System.out.println("ENTER 0 TO COME BACK TO MAIN MENU:");
            System.out.println("PRESS ANY OTHER NUMBER TO EXIT");
            v= sc.nextInt();
        } while(v == 0);
        
        System.out.println("Exit successfully");
    }
}
