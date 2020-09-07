package Patterns.Behavioral.Strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Стратегия — это поведенческий паттерн проектирования, который определяет семейство схожих алгоритмов и помещает
каждый из них в собственный класс, после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.

 Состояние можно рассматривать как надстройку над Стратегией. Оба паттерна используют композицию,
 чтобы менять поведение основного объекта, делегируя работу вложенным объектам-помощникам.
 Однако в Стратегии эти объекты не знают друг о друге и никак не связаны.
 В Состоянии сами конкретные состояния могут переключать контекст.

 В примере классы реализующие GettingValue - алгоритмы, которые находят нужное значение в массиве.
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
