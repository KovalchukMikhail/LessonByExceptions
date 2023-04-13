package Homework002.Task003;


public class Program {
   public static void main(String[] args) { // Убрал проброску исключени выше, так как это самый верхний метод и если пробросить выше то исключени не будут обработаны, хотя в данном случае ничего вверх не пробрасывается (все исключения обрабатываются тут)
      try {
          int a = 90;
          int b = 3;
          System.out.println(a / b);
          printSum(23, 234);
          int[] abc = { 1, 2 };
          abc[3] = 9;
      } catch (NullPointerException ex) {
          System.out.println("Указатель не может указывать на null!");
      } catch (IndexOutOfBoundsException ex) {
          System.out.println("Массив выходит за пределы своего размера!");
      } catch (Throwable ex) { // Переместил данный тип ниже, так как если его расположить выше, то на нем будут останавливаться все исключения вне зависимости от типа
         System.out.println("Что-то пошло не так...");
      }
   }

   public static void printSum(Integer a, Integer b) throws Exception { // заменил тип исключения на базовый тип
      System.out.println(a + b);
   }
   
}
