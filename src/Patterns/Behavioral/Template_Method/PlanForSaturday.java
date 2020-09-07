package Patterns.Behavioral.Template_Method;

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

