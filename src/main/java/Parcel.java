import java.util.List;
import java.util.ArrayList;

public class Parcel {
  public int height;
  public int width;
  public int weight;
  public int cost;

  public Parcel(int userHeight, int userWidth, int userWeight){
    height = userHeight;
    width = userWidth;
    weight = userWeight;
  }

  public int parcelCost () {
    return height + width + weight;
  }
}
