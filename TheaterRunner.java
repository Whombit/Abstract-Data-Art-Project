import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {
    String[] images = {"playstation.png", "xbox.png", "nintendo.png"};
    DataScene scene = new DataScene(images, FileReader.toIntArray("data1.txt"), FileReader.toStringArray("data2.txt"));

    scene.drawConsoles();
    scene.biggestSeller();
    Theater.playScenes(scene);
  }
}
