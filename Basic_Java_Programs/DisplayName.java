/*6 -wap to accept your name and print it


 */
import java.util.*;
public class DisplayName {
    public static void main(String[] args)
    {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Your name is " +name);
    }
}
