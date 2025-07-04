 public class Interfaceexample {
    public static void main(String[] args) {
        Playable p = new Guitar("auto");
        Instrument i = new Guitar("electric");

        p.play();
        i.tune();
    }
}

interface Playable {
    void play();
}

abstract class Instrument {
    String type;

    Instrument(String type) {
        this.type = type;
    }

    abstract void tune();

class Guitar extends Instrument implements Playable {
    Guitar(String type) {
        super(type);
    }

    public void tune() {
        System.out.println("tuning the " + type + " guitar");
    }

    public void play() {
        System.out.println("playing the " + type + " guitar");
    }
}
}