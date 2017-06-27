import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class AppTest {

  @Test
  public void testMain(){
    String userParcelInfo = "3 3 3";
    String[] parcelDimensions = userParcelInfo.split("\\s+", -1);
    Parcel userParcel = new Parcel(Integer.parseInt(parcelDimensions[0]),Integer.parseInt(parcelDimensions[1]),Integer.parseInt(parcelDimensions[2]));
    int expectedOutput = 9;
    assertEquals(expectedOutput, userParcel.parcelCost());
  }
}
