package Patterns.Behavioral.State;

class PopCassette implements Cassette {
    @Override
    public void play() {
        System.out.println("Pop music is playing...");
    }
}
