package Homework002.Task004.Model;

import java.util.Scanner;

public class ConsoleReaderBasic implements IConsoleReader {
    
    
    @Override
    public String getString() throws RuntimeException{
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(!str.equals("")){
            return str;
        }
        else{
            throw new RuntimeException("Вы ввели пустую строку");
        }
            
    }
    
}
