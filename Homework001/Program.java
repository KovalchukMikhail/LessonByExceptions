package Homework001;

import Homework001.Controller.ControllerBasic;
import Homework001.Controller.IController;
import Homework001.Model.ArrayWorkerBasic;
import Homework001.Model.ConsoleReaderBasic;
import Homework001.Model.IArrayWorker;
import Homework001.Model.IConsoleReader;
import Homework001.View.ConsoleViewBasic;
import Homework001.View.IView;

public class Program {

    public static void main(String[] args) {
        IArrayWorker arrayWorker = new ArrayWorkerBasic();
        IConsoleReader consoleReader = new ConsoleReaderBasic();
        IView view = new ConsoleViewBasic();
        IController controller = new ControllerBasic(arrayWorker, consoleReader, view);

        controller.run();
    }
}
