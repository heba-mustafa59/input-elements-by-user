
package course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Course {

  
public static void main(String[] args) {
    ArrayList <Integer> list1 =new ArrayList();
    Scanner in = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
        int t = in.nextInt();
        if (!list1.contains(t))
        list1.add(t);
    }

    System.out.println(list1);
    }
    
}
