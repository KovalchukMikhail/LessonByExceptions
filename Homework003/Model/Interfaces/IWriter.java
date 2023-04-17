package Homework003.Model.Interfaces;

import java.io.IOException;

public interface IWriter {
    public void WriteInFile(String path, String result) throws IOException;
}
