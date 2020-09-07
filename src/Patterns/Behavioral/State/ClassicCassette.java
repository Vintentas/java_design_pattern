package Patterns.Behavioral.State;

class ClassicCassette implements Cassette {
    @Override
    public void play() {
        System.out.println("Classic music is playing...");
    }
}
