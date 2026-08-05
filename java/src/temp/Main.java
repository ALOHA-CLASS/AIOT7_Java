package temp;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] students = {
        };

        List<String> list = new LinkedList<>(Arrays.asList(students));

        Collections.shuffle(list);

        int count = 1;
        int i = 0;

        while (i < list.size()) {

            int remain = list.size() - i;

            // 남은 인원이 4명이면 2명씩 2조
            if (remain == 4) {
                System.out.println(count++ + "조 : " + list.subList(i, i + 2));
                System.out.println(count++ + "조 : " + list.subList(i + 2, i + 4));
                break;
            }

            int end = Math.min(i + 3, list.size());
            System.out.println(count++ + "조 : " + list.subList(i, end));
            i += 3;
        }
    }
}