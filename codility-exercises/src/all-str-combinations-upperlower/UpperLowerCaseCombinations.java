import java.util.BitSet;

public class UpperLowerCaseCombinations {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello World!");

    return;
  }

  /**
   * Solution ref. https://stackoverflow.com/questions/6785358/permutate-a-string-to-upper-and-lower-case
   * @param input is the string from which we want to find all combinatons.
   */
  public void PrintCombinations(String input) {
    char[] currentCombo = input.toCharArray();

    // Create a bit vector the same length as the input, and set all of the bits to
    // 1
    BitSet bv = new BitSet(input.length());
    bv.set(0, currentCombo.length);

    // While the bit vector still has some bits set
    while (!bv.isEmpty()) {
      // Loop through the array of characters and set each one to uppercase or
      // lowercase,
      // depending on whether its corresponding bit is set
      for (int i = 0; i < currentCombo.length; ++i) {
        if (bv.get(i)) // If the bit is set
          currentCombo[i] = Character.toUpperCase(currentCombo[i]);
        else
          currentCombo[i] = Character.toLowerCase(currentCombo[i]);
      }

      // Print the current combination
      System.out.println(currentCombo);

      // Decrement the bit vector
      DecrementBitVector(bv, currentCombo.length);
    }

    // Now the bit vector contains all zeroes, which corresponds to all of the
    // letters being lowercase.
    // Simply print the input as lowercase for the final combination
    System.out.println(input.toLowerCase());
  }

  public void DecrementBitVector(BitSet bv, int numberOfBits) {
    int currentBit = numberOfBits - 1;
    while (currentBit >= 0) {
      bv.flip(currentBit);

      // If the bit became a 0 when we flipped it, then we're done.
      // Otherwise we have to continue flipping bits
      if (!bv.get(currentBit))
        break;
      currentBit--;
    }
  }
}
