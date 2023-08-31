package Entities;

public class Player {

    private Integer id;
    private String name;
    private boolean isWet;

    public Player(Integer id, String name, boolean isWet) {
        this.id = id;
        this.name = name + " " + id;
        this.isWet = isWet;
    }

    public boolean shot(Revolver revoler) {
        this.isWet = revoler.wet();
        revoler.nextShot();

        return this.isWet;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isWet=" + isWet +
                '}';
    }
}
