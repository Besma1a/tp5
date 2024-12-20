package tp5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        List L1 = List.emptylist();
        Scanner s = new Scanner(System.in);

       
        System.out.println("list size : ");
        int i = s.nextInt();  
        for (int j = 0; j < i; j++) {
            System.out.println("Give new element : ");
            int n = s.nextInt();
            Element e = new Element(n);  
            L1.insert(L1, j, e);  
        }

       
        System.out.println("Give a new element to insert : ");
        int n1 = s.nextInt();
        System.out.println("Give the position : ");
        int n2 = s.nextInt();
        Element e1 = new Element(n1);
        L1.insert(L1, n2, e1);
        L1.aff(L1); 

        
        System.out.println("Give a position to delete : ");
        int n3 = s.nextInt();
        L1.delete(L1, n3);  
        L1.queue(L1);  

        
        List L2 = List.emptylist();
        System.out.println("List size : ");
        int k = s.nextInt();
        for (int j1 = 0; j1 < k; j1++) {  
            System.out.println("Give new element : ");
            int n = s.nextInt();
            Element e = new Element(n);
            L2.insert(L2, j1, e);  
        }
        L2.aff(L2);  

       
        L2 = L1.concactener(L1, L2);  
        L2.aff(L2);  
    }
}
