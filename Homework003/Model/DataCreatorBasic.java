package Homework003.Model;

import Homework003.Model.Interfaces.IDataCreator;

public class DataCreatorBasic implements IDataCreator{

    @Override
    public String creatStringData(String[] arrayData) {
        String data = "";
        for (String s : arrayData) {
            data += "<" + s + ">";
        }
        return data + "\n";
    }
    
}
