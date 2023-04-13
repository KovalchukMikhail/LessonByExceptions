package Homework002.Task004;

import Homework002.Task004.Controller.ControllerBasic;
import Homework002.Task004.Controller.IController;
import Homework002.Task004.Model.ConsoleReaderBasic;
import Homework002.Task004.Model.IConsoleReader;
import Homework002.Task004.View.ConsoleViewBasic;
import Homework002.Task004.View.IView;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Program {

    public static void main(String[] args) {
        IConsoleReader consoleReader = new ConsoleReaderBasic();
        IView view = new ConsoleViewBasic();
        IController controller = new ControllerBasic(consoleReader, view);

        controller.run();
    }
}
