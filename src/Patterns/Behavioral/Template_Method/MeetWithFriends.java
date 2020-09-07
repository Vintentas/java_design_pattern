package Patterns.Behavioral.Template_Method;

class MeetWithFriends extends PlanForSaturday {
    MeetWithFriends () {
        System.out.println("---MeetWithFriends---");
    }
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
