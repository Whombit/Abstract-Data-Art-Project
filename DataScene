import org.code.theater.*;

public class DataScene extends Scene {
    private String[] images;
    private int[] salesData;
    private String[] consolesData;

    public DataScene() {
        this.images = new String[0]; // Initialize arrays as empty arrays
        this.salesData = new int[0];
        this.consolesData = new String[0];
    }

    public DataScene(String[] images, int[] data1, String[] data2) {
        this.images = images;
        this.salesData = data1;
        this.consolesData = data2;
    }

  public void biggestSeller() {
    int smallest = salesData[0];
    int largest = salesData[0];
    
    for (int i = 1; i < salesData.length; i++) {
        if (salesData[i] < smallest) {
            smallest = salesData[i];
        } else if (salesData[i] > largest) {
            largest = salesData[i];
        }
    }

    System.out.println("Smallest value in sales data: " + smallest);
    System.out.println("Largest value in sales data: " + largest);
  }

  public void drawConsoles() {
    for (int i = 0; i < salesData.length; i++) {
        int xCoordinate = i * (int) (Math.random() * 100) + 1; // Adjust x-coordinate based on index
        int yCoordinate = (int) (Math.random() * 100) + 1; // Random y-coordinate between 1 and 50
        double consoleSize = (double) salesData[i] / 1750000; // Adjust size based on sales data

        // Round the console size using Math.round() for more accurate representation
        // Adjust parameters as needed based on the actual signature of the drawImage() method
        drawImage(images[i], xCoordinate, yCoordinate, (int) Math.round(consoleSize));
    }
}

}
