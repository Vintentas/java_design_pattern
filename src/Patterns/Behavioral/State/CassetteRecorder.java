package Patterns.Behavioral.State;

class CassetteRecorder {
    Cassette cassette;

    public void setCassette(Cassette cassette) {
        this.cassette = cassette;
    }

    public void play() {
        cassette.play();
    }
}
