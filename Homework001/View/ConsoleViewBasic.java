package Homework001.View;

import java.lang.reflect.Array;

public class ConsoleViewBasic implements IView {

    @Override
    public void showMainMenu() {
        System.out.println("Выберети пункт меню:\n"+
                            "1 - Вычисление разности двух массивов\n"+
                            "2 - Вычисление частного двух массивов\n"+
                            "0 - для выхода");
    }

    @Override
    public void showError() {
        System.out.println("Вы ввели некоректное значение.");
    }

    @Override
    public void showText(String text) {
        System.out.println(text);
    }
    public void showArray(int [] array){
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.print("]\n\n");
    }
    
}
