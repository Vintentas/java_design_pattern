package Patterns.Behavioral.Template_Method;

/*
Шаблонный метод — это поведенческий паттерн проектирования, который определяет скелет алгоритма,
перекладывая ответственность за некоторые его шаги на подклассы.
Паттерн позволяет подклассам переопределять шаги алгоритма, не меняя его общей структуры.

В примере изменяется распорядок субботнего дня. Шаблонный метод - PlanForSaturday имеет конкретные реализации.
 */

public class Template_Method {
    public static void main(String[] args) {

        PlanForSaturday planForSaturday = new Standard();
        planForSaturday.printPlan();

        System.out.println("----------");
        planForSaturday = new MeetWithFriends();
        planForSaturday.printPlan();

        System.out.println("----------");
        planForSaturday = new SpendTimeAtHome();
        planForSaturday.printPlan();

    }
}