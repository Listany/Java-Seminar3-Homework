package Homework003;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task001 {
    public static void main(String[] args) {
        //1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

        ArrayList<Integer> myArray = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(30); i++) {
            myArray.add(random.nextInt(10));
        }

        System.out.println(myArray);

        Iterator<Integer> myArrayIterator = myArray.iterator();
        while (myArrayIterator.hasNext()){
            int myArrayNext = myArrayIterator.next();
            if (myArrayNext % 2 == 0){
                myArrayIterator.remove();
            }
        }
        System.out.println(myArray);

    }
}
