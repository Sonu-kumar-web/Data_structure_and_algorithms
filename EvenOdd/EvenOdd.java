import java.util.*;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int num = scn.nextInt();

    int i=0;
    while (i<=num){
      if(i%2 == 0) System.out.println(i+ " is Even.");
      else System.out.println(i+ " is Odd." );
      i++;
    }
scn.close();
  }
}
