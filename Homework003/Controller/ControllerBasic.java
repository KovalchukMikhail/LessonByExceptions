package Homework003.Controller;

import java.util.ArrayList;

import Homework003.Model.Interfaces.IChecker;
import Homework003.Model.Interfaces.IConsoleReader;
import Homework003.Model.Interfaces.IDataCreator;
import Homework003.Model.Interfaces.IParser;
import Homework003.Model.Interfaces.IWriter;
import Homework003.View.IView;

public class ControllerBasic implements IController {
    IChecker checker;
    IConsoleReader consoleReader;
    IView view;
    IParser parser;
    IWriter writer;
    IDataCreator dataCreator;

    public ControllerBasic(IChecker checker, IConsoleReader consoleReader, IView view, IParser parser, IWriter writer,
            IDataCreator dataCreator) {
        this.checker = checker;
        this.consoleReader = consoleReader;
        this.view = view;
        this.parser = parser;
        this.writer = writer;
        this.dataCreator = dataCreator;
    }

    @Override
    public void run() {
        String request = "\nВведите данные:\n"
                            +"Фамилия Имя Отчество датарождения(dd.mm.yyyy) номертелефона(9 цифр) пол(m - муж, f - жен)\n"
                            +"Пример формата ввода данных:"
                            +"Иванов Иван Иванович 20.02.2012 9261234567 m\n"
                            +"Или введите n для выхода";
        while(true){
            view.showText(request);
            try {
                String answer = consoleReader.getStringFromConsole();
                if(answer.equals("n"))return;
                else{
                    String[] data = parser.parseOfData(answer, " ");
                    int code = checker.checkCountOfData(data, 6);
                    switch (code) {
                        case 0:
                            checker.checkData(data);
                            String path = "HomeWork003/DataBase/" + data[0] + ".txt";
                            writer.WriteInFile(path, dataCreator.creatStringData(data));
                            view.showText("Данные успешно добавлены");
                            break;
                        case -1:
                            view.showText("Ошибка:\nКоличество переданных значение меньше требуемого");
                            break;
                        case 1:
                            view.showText("Ошибка:\nКоличество переданных значение больше требуемого");
                            break;
                    }
                }          
            }catch (Exception e) {
                view.showText("Ошибка:\n" + e.getMessage());
            }
        }
    } 
}
