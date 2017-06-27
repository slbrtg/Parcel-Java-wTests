import java.io.Console;
import java.util.Arrays;


public class App {
  public static void main(String[] args) {
    System.out.println("Please enter in the following orders the dimensions and weight of your package seperated by spaces: Height, Weight, Width");
    String userParcelInfo = System.console().readLine();
    String[] parcelDimensions = userParcelInfo.split("\\s+", -1);
    System.out.println(Arrays.toString(parcelDimensions));
    Parcel userParcel = new Parcel(Integer.parseInt(parcelDimensions[0]),Integer.parseInt(parcelDimensions[1]),Integer.parseInt(parcelDimensions[2]));
    System.out.println("Your total is...");
    System.out.println(userParcel.parcelCost());
  }
}
