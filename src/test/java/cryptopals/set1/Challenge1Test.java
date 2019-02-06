package cryptopals.set1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Challenge1Test {
  @Test public void testByteToHex() {
    assertEquals(Challenge1.byteToHex((byte) 0), "00");
    assertEquals(Challenge1.byteToHex((byte) 15), "0f");
    assertEquals(Challenge1.byteToHex((byte) 27), "1b");
  }
  @Test public void testHexToByte() {
    assertEquals(Challenge1.hexToByte("00"), 0);
    assertEquals(Challenge1.hexToByte("0f"), 15);
    assertEquals(Challenge1.hexToByte("1b"), 27);
  }
  @Test public void testEncodeHex() {
      byte[] input = new byte[] {(byte) 0xde, (byte) 0xad};
      assertEquals(Challenge1.encodeHex(input), "dead");

      input = new byte[] {(byte) 0xbe, (byte) 0xef};
      assertEquals(Challenge1.encodeHex(input), "beef");
  }
}
