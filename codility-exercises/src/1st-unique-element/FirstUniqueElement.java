import java.util.HashMap;
import java.util.Map;

public class FirstUniqueElement {
  public static void main(String[] args) throws Exception {
    int[] arr = new int[] { 1, 2, -2, 15, 1, 0, 3, 7, 3, 1, 15, 2, 19, 22, -2, -5 };
    System.out.println("The first unique element is " + findFirstUniqueElement(arr));
    return;
  }

  public static int findFirstUniqueElement(int[] A) {
    Map<Integer, Integer> result = new HashMap<>();

    for (int i : A) {
      Integer aDefault = result.getOrDefault(i, 0);
      result.put(i, ++aDefault);
    }

    for (int i : A) {
      if (result.get(i) == 1) {
        return i;
      }
    }
    return -1;
  }

}
