package Homework002.Task004.Controller;

import Homework002.Task004.Model.IConsoleReader;
import Homework002.Task004.View.IView;

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
            view.showText("Введите текст\n");
            try {
                String answer = consoleReader.getString();
                view.showText("Вы ввели:\n" + answer);
                return;
            } catch (Exception ex) {
                view.showText(ex.getMessage());
            }

        }
    }

}
