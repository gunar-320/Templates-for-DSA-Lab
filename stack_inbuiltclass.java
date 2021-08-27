import java.io.*;
import java.util.*;

public class AG{
    public static void main(String[] args){

        Stack<Integer> stk = new Stack <>();
        boolean a = stk.empty();
        System.out.println(a);
        stk.push(8);
        stk.push(9);
        int b = stk.peek();
        System.out.println(b);
        int c = stk.search(8);
        System.out.println(c);
        
    }
}
