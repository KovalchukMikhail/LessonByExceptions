package Homework003.Model;

import java.io.FileWriter;
import java.io.IOException;

import Homework003.Model.Interfaces.IWriter;

public class Writer implements IWriter{
    public void WriteInFile(String path, String result) throws IOException
    {
        try (FileWriter fw = new FileWriter(path, true))
        {
            fw.write(result);
        }
        catch (IOException ex)
        {
            throw ex;
        }
    }
}
