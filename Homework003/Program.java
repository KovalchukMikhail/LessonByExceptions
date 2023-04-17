package Homework003;

import Homework003.Controller.ControllerBasic;
import Homework003.Controller.IController;
import Homework003.Model.Checker;
import Homework003.Model.ConsoleReaderBasic;
import Homework003.Model.DataCreatorBasic;
import Homework003.Model.ParserBasic;
import Homework003.Model.Writer;
import Homework003.Model.Interfaces.IChecker;
import Homework003.Model.Interfaces.IConsoleReader;
import Homework003.Model.Interfaces.IDataCreator;
import Homework003.Model.Interfaces.IParser;
import Homework003.Model.Interfaces.IWriter;
import Homework003.View.ConsoleViewBasic;
import Homework003.View.IView;

public class Program {
    public static void main(String[] args) {
        IParser parser = new ParserBasic();
        IConsoleReader consoleReader = new ConsoleReaderBasic();
        IView view = new ConsoleViewBasic();
        IChecker checker = new Checker(parser);
        IWriter writer = new Writer();
        IDataCreator dataCreator = new DataCreatorBasic();
        IController controller = new ControllerBasic(checker, consoleReader, view, parser, writer, dataCreator);
        
        controller.run();
    }

}
