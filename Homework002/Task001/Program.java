package Homework002.Task001;

import Homework002.Task001.Controller.ControllerBasic;
import Homework002.Task001.Controller.IController;
import Homework002.Task001.Model.ConsoleReaderBasic;
import Homework002.Task001.Model.IConsoleReader;
import Homework002.Task001.View.ConsoleViewBasic;
import Homework002.Task001.View.IView;

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
