//13) Print the program for displaying the fruit name by using its color.
package CoreJavaQandA;
import java.util.Scanner;
public class fruitoncolor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: ");
        String color = sc.next();
            if(color.equals("red")){
                System.out.println("Fruit is apple.");
            }
            if(color.equals("orange")){
                System.out.println("Fruit is orange.");
            }
            if(color.equals("yellow")){
                System.out.println("Fruit is banana.");
            }
            if(color.equals("green")){
                System.out.println("Fruit is grapes.");
            }
            if(color.equals("crimson")){
                System.out.println("Fruit is pomegranate.");
            }
            if(color.equals("greenred")){
                System.out.println("Fruit is Watermelon.");
            }
            if(color.equals("brown")){
                System.out.println("Fruit is pineapple.");
            }
        sc.close();
    }
}