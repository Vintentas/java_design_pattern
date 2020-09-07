package Patterns.Behavioral.Observer;

class PersonImpl implements Person {
    String name;

    PersonImpl(String string) {
        name = string;
    }

    @Override
    public void getSpam(String string) {
        System.out.println("  " + name + " gets massage: \"" + string + "\"");
    }
}
