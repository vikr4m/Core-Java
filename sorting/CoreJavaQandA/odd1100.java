//16) Print the odd no from 1 to 100 in a reverse way (for loop)
package CoreJavaQandA;

public class odd1100 {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
