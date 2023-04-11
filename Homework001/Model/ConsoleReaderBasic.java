package Homework001.Model;

import java.util.Scanner;

public class ConsoleReaderBasic implements IConsoleReader {
    Scanner scanner = new Scanner(System.in, "Cp866");
    
    @Override
    public int getInt() {
        int num;
        try
        {
            num = Integer.valueOf(scanner.next());
        }
        catch (Exception e)
        {
            num = -1;
        }
        return num;
    }
    
}
