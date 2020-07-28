package Patterns.Behavioral;

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

class CassetteRecorder {
    Cassette cassette;

    public void setCassette(Cassette cassette) {
        this.cassette = cassette;
    }

    public void play() {
        cassette.play();
    }
}

interface Cassette{
    void play();
}

class RockCassette implements Cassette {
    @Override
    public void play() {
        System.out.println("Rock music is playing...");
    }

}

class ClassicCassette implements Cassette {
    @Override
    public void play() {
        System.out.println("Classic music is playing...");
    }
}

class PopCassette implements Cassette {
    @Override
    public void play() {
        System.out.println("Pop music is playing...");
    }
}