package firstpalace.testcard;

public class Game {

    private int image;
    private String Platform;
    private String Name;

    public int getImage() {
        return image;
    }

    public String getPlatform() {
        return Platform;
    }

    public String getName() {
        return Name;
    }

    public Game(int image, String platform, String name) {
        this.image = image;
        Platform = platform;
        Name = name;
    }
}
