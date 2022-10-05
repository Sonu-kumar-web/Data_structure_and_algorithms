import java.util.*;

public class TakeInput {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int i = scn.nextInt();
    String name = scn.nextLine();

    System.out.println("i:-"+ i);
    System.out.println("name:-"+ name);

     for (int j = 0; j <= i; j++)

    {

      System.out.println(j);

    }


    scn.close();
  }
  
}
