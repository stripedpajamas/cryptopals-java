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
  @Test public void testDecodeHex() {
    String input = "deadbeef";
    byte[] output = new byte[] {(byte) 0xde, (byte) 0xad, (byte) 0xbe, (byte) 0xef};
    assertArrayEquals(Challenge1.decodeHex(input), output);
  }
  @Test public void testHexToBase64() {
    String input = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d";
    String output = "SSdtIGtpbGxpbmcgeW91ciBicmFpbiBsaWtlIGEgcG9pc29ub3VzIG11c2hyb29t";
    assertEquals(Challenge1.hexToBase64(input), output);
  }
}
