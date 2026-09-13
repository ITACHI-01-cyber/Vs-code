import java.util.*;

public class ArrayStack {   
    public static void main(String[] args){
        int d;
        Scanner sc = new Scanner(System.in);
        Stack01 s = new Stack01();
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

class Stack{
    int n = 10;
    int top = -1;
    int a[] = new int[n];

    void push(Scanner sc){
        if(top == n-1){
            System.out.println("Overflow");
        }
        else{
            System.out.print("Enter value to push: ");
            int i = sc.nextInt();
            top = top + 1;
            a[top] = i;
            System.out.println("item added");
        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Underflow");
        }
        else{
            top = top -1;
            System.out.println("Item Deleted");
        }
    }
    void display(){
        System.out.println("item are: ");
        for(int j = top; j >= 0;j--){
            System.out.println(a[j]);
        }
    }
}
