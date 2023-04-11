package Homework001.Model;

import java.util.Random;

public class ArrayWorkerBasic implements IArrayWorker {

    @Override
    public int [] getDifferenceArray(int [] arrayOne, int [] arrayTwo) {
        int size = arrayOne.length;
        if (size != arrayTwo.length) throw new RuntimeException("Длины массивов не равны");
        int [] result = new int [size];
        for(int i = 0; i < size; i++) result[i] = arrayOne[i] - arrayTwo[i];
        return result;
    }

    @Override
    public int [] getDividingArray(int [] arrayOne, int [] arrayTwo) {
        int size = arrayOne.length;
        if (size != arrayTwo.length) throw new RuntimeException("Длины массивов не равны");
        int [] result = new int [size];
        for(int i = 0; i < size; i++){
            if(arrayTwo[i] == 0) throw new RuntimeException("В рамках данной программы деление на 0 недопустимо");
            result[i] = arrayOne[i] / arrayTwo[i];
        }
        return result;
    }

    @Override
    public int [] createArray() {
        Random random = new Random();
        int size = random.nextInt(2) + 7;
        int [] array = new int [size];
        for(int i = 0; i < size; i++) array[i] = random.nextInt(10);
        return array;
    }


    
}
