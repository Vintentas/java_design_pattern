package Patterns.Behavioral;

/*
Шаблонный метод — это поведенческий паттерн проектирования, который определяет скелет алгоритма,
перекладывая ответственность за некоторые его шаги на подклассы.
Паттерн позволяет подклассам переопределять шаги алгоритма, не меняя его общей структуры.
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


abstract class PlanForSaturday {
    void printPlan() {
        step1();
        step2();
        step3();
        step4();
        step5();
        step6();
    }

    void step1 () {
        System.out.println("Sleep to 10.00 a.m.");
    }
    void step2 () {
        System.out.println("Have a coffee");
    }
    void step3 () {
        System.out.println("Do housework");
    }
    void step4 () {
        System.out.println("Meet with parents");
    }
    void step5 () {
        System.out.println("Read a book");
    }
    void step6 () {
        System.out.println("Go to the bed at 11.00 p.m.");
    }
}

class Standard extends PlanForSaturday {}

class MeetWithFriends extends PlanForSaturday {
    void step3() {
        System.out.println("Do makeup");
    }
    void step4() {
        System.out.println("Meet with friends");
    }
    void step5() {
        System.out.println("Have a fan");
    }
    void step6() {
        System.out.println("Go to the bed later");
    }
}

class SpendTimeAtHome extends PlanForSaturday {
    void step3 () {}
    void step4 () {
        System.out.println("Play computer games");
    }
    void step5 () {}
}

