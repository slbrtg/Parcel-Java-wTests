import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class ParcelTest {

  @Test
  public void addParcel_HeightWeightWidth_Int(){
    Parcel testParcel = new Parcel(1,1,1);
    int expectedOutput = 3;
    assertEquals(expectedOutput, testParcel.parcelCost());
  }
}
