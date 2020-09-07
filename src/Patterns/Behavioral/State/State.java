package Patterns.Behavioral.State;

/*
 Состояние — это поведенческий паттерн проектирования, который позволяет объектам менять поведение в зависимости от
 своего состояния. Извне создаётся впечатление, что изменился класс объекта.

 Состояние можно рассматривать как надстройку над Стратегией. Оба паттерна используют композицию,
 чтобы менять поведение основного объекта, делегируя работу вложенным объектам-помощникам.
 Однако в Стратегии эти объекты не знают друг о друге и никак не связаны.
 В Состоянии сами конкретные состояния могут переключать контекст.

 В примере состояние объекта CassetteRecorder зависит от объекта Cassette.
 Магнитофон проигрывает музыку в зависимости от вставленной кассеты.
 */


public class State {
    public static void main(String[] args) {
        CassetteRecorder cassetteRecorder = new CassetteRecorder();

        cassetteRecorder.setCassette(new RockCassette());
        cassetteRecorder.play();

        cassetteRecorder.setCassette(new ClassicCassette());
        cassetteRecorder.play();

        cassetteRecorder.setCassette(new PopCassette());
        cassetteRecorder.play();

    }
}
