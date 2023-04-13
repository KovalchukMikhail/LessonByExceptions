package Homework002.Task002;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            int [] intArray = new int [random.nextInt(3) + 7];
            try {
                int d = 0;
                double catchedRes1 = intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
             } catch (ArithmeticException e) {
                System.out.println("Catching exception: " + e);
             } catch (ArrayIndexOutOfBoundsException e) {       // добавил блок catch на случай если индекс выходит за границу массива
                System.out.println("Catching exception: " + e);
             } catch (Exception e) {                            // добавил блок catch на случай исключений которые не были учтены
                System.out.println("Catching exception: " + e);
             }
        }
        
         
    }
}
