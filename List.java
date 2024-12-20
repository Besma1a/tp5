package tp5;

public class List {
    private static final int MAX_SIZE = 10000;
    private  Element[] array;
     private int listLength;
     
     

public static List emptylist() {
 List L = new List();
 L.array = new Element[MAX_SIZE];
 L.listLength = 0;
 return L;
}
public List insert( List L,int p, Element e) {
  
 if ( L.listLength <  MAX_SIZE ){ 
     if (L.listLength != 0 && p != L.listLength + 1) { 
         for (int i = L.listLength; i >= p; i--) {
            array[i+1] = array[i];
         }
     }
     array[p] = e;
     L.listLength++;
 } else {
     System.out.println("Insertion is impossible, the list is full.");
 }
 return L; 
}

public Element[] getArray() {
  return array;
}

public List delete (List L,int p) {
  if(L.listLength !=1) {
    for(int i=p;i<L.listLength;i++) {
      L.array[i]=L.array[i+1];
    }
  }
  L.listLength--;
  return L;
}



public Element access(List L, int p)
{
 return L.array[p];
}
public int lengthIterative(List L) {
 return L.listLength;
}

public boolean isEmpty(List L) {

 if (L.listLength==0) return true;
 else return false;
}

//public int lengthRecursive(List L) {
 //if(isEmpty(L)== true) {
   //  return 0;
//}else {
 //return 1+lengthRecursive(L.delete(L, 1));
//}
//}
public Element queue (List L) {
  if(L.listLength==0) {
     System.out.println("impossible, the list is empty.");
     return (null);
  }
  else {
  return L.access(L, L.listLength);
  }}
public List concactener(List L1,List L2) {
  if(L1.isEmpty(L1)&&L2.isEmpty(L2)||L1.listLength+L2.listLength>MAX_SIZE) {
    System.out.println("impossible, the lists are empty.");
    return(null);
  }
  else {if(L1.isEmpty(L1)) {return L2;}
  int i =0;
  if(L2.listLength>0) {
  while (L2.listLength!=i) {
    L1.insert(L1, L1.lengthIterative(L1), L2.access(L2, i));
    i++;
  }}
  return L1;
  
  
}
}

public void aff(List L) {
  for(int i=0;i<L.listLength;i++) {
    System.out.println(L.array[i]);
  }
}


}


