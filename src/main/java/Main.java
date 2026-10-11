
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
      int i , n ,resul;
      
      n = scanner.nextInt();
      
      for(i = 1 ; i <= 10 ; i++){
          resul = i * n;
          System.out.println(i+" x "+n+" = "+resul);
      }
      
        
    }
}
