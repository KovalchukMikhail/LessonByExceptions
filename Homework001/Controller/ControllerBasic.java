package Homework001.Controller;

import Homework001.Model.IArrayWorker;
import Homework001.Model.IConsoleReader;
import Homework001.View.IView;

public class ControllerBasic implements IController {

    IArrayWorker arrayWorker;
    IConsoleReader consoleReader;
    IView view;

    public ControllerBasic(IArrayWorker arrayWorker, IConsoleReader consoleReader, IView view) {
        this.arrayWorker = arrayWorker;
        this.consoleReader = consoleReader;
        this.view = view;
    }

    @Override
    public void run() {
        while (true) {
            view.showMainMenu();
            int answer = consoleReader.getInt();
            switch (answer) {
                case 1:
                    try {
                        int[] arrayFirst = arrayWorker.createArray();
                        int[] arraySecond = arrayWorker.createArray();
                        performСalculations(arrayFirst, arraySecond, arrayWorker::getDifferenceArray);
                    } catch (RuntimeException ex) {
                        view.showText("\n" + ex.getMessage() + "\n");
                    }
                    break;
                case 2:
                    try {
                        int[] arrayFirst = arrayWorker.createArray();
                        int[] arraySecond = arrayWorker.createArray();
                        performСalculations(arrayFirst, arraySecond, arrayWorker::getDividingArray);
                    } catch (RuntimeException ex) {
                        view.showText("\n" + ex.getMessage() + "\n");
                    }
                    break;
                case 0:
                    return;
                default:
                    view.showError();
            }
        }
    }

    private void performСalculations(int[] arrayFirst, int[] arraySecond, Expression expression){
        int [] result = expression.perform(arrayFirst, arraySecond);
        view.showText("\nпервый массив:");
        view.showArray(arrayFirst);
        view.showText("\nвторой массив:");
        view.showArray(arraySecond);
        view.showText("\nРезультат вычисления:");
        view.showArray(result);
    }

    interface Expression{
        int [] perform(int[] arrayFirst, int[] arraySecond);
    }

}
