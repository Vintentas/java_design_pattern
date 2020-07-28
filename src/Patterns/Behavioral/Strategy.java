package Patterns.Behavioral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Стратегия — это поведенческий паттерн проектирования, который определяет семейство схожих алгоритмов и помещает
каждый из них в собственный класс, после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.
 */
public class Strategy {
    public static void main(String[] args) {

        ArrayList<Integer> list =
                (ArrayList<Integer>) Stream.of (7, 4, 10, 4, 6, 2, 9).collect(Collectors.toList());

        System.out.println(new GetMaxValue(list).getValue());
        System.out.println(new GetMinValue(list).getValue());
        System.out.println(new GetSumValue(list).getValue());
        System.out.println(new GetAvgValue(list).getValue());
    }
}

interface GettingValue {
    int getValue();
}

class GetMaxValue implements GettingValue {
    ArrayList<Integer> list;

    GetMaxValue (ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public int getValue() {
        return Collections.max(list);
    }
}

class GetMinValue implements GettingValue {
    ArrayList<Integer> list;

    GetMinValue (ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public int getValue() {
        return Collections.min(list);
    }
}

class GetSumValue implements GettingValue {
    ArrayList<Integer> list;

    GetSumValue (ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public int getValue() {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}

class GetAvgValue implements GettingValue {
    ArrayList<Integer> list;

    GetAvgValue (ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public int getValue() {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum/(list.size());
    }
}