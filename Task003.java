package Homework003;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task003 {
    public static void main(String[] args) {

        // Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.

        ArrayList<Integer> randomArray = new ArrayList<Integer>();

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            randomArray.add(random.nextInt(3, 11));
        }

        System.out.println(randomArray);

        Set<Integer> set = new HashSet<>(randomArray);
        randomArray.clear();
        randomArray.addAll(set);

        System.out.println(randomArray);
    }
}
