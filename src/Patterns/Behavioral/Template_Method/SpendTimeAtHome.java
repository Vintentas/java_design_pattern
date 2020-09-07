package Patterns.Behavioral.Template_Method;

class SpendTimeAtHome extends PlanForSaturday {
    SpendTimeAtHome () {
        System.out.println("---SpendTimeAtHome---");
    }
    void step3 () {}
    void step4 () {
        System.out.println("Play computer games");
    }
    void step5 () {}
}
