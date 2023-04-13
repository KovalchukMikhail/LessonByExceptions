package Homework002.Task001.Controller;

import Homework002.Task001.Model.IConsoleReader;
import Homework002.Task001.View.IView;

public class ControllerBasic implements IController {

    IConsoleReader consoleReader;
    IView view;

    public ControllerBasic(IConsoleReader consoleReader, IView view) {
        this.consoleReader = consoleReader;
        this.view = view;
    }

    @Override
    public void run() {
        while (true) {
            view.showText("Введите дробное число\n");
            try {
                float answer = consoleReader.getFloat();
                view.showText("Вы ввели:\n" + answer);
                return;
            } catch (Exception ex) {
                view.showText("Некорректный ввод. Попробуйте еще раз");
            }

        }
    }

}
