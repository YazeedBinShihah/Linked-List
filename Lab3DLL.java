
package lab3dll;

import lab3part2_ex2.DLLLongInt;


public class Lab3DLL {

    
    public static void main(String[] args) {
      DLLLongInt dd1 = new DLLLongInt();
        DLLLongInt dd2 = new DLLLongInt("399");        
      
     
//        dd1.print();
//        dd2.print();
//        
//        DLLLongInt dd3 = dd1.sub(dd2);        
//     dd3.print();
//////        System.out.println();
////
////        
//     System.out.println(dd1.compareTo(dd2));
////      
      dd1.addLast(1);
      dd1.addLast(2);
      dd1.addLast(3);
      dd1.addFirst(7);
      dd1.print();
      dd1.removeFirst();
      dd1.print();
      dd1.removeLast();
      dd1.print();
////        
        
    }
    
}
