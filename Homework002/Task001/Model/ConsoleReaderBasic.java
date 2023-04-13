package Homework002.Task001.Model;

import java.util.Scanner;

public class ConsoleReaderBasic implements IConsoleReader {
    
    
    @Override
    public float getFloat() throws Exception{
        Scanner scanner = new Scanner(System.in, "Cp866");
        return scanner.nextFloat();
    }
    
}
