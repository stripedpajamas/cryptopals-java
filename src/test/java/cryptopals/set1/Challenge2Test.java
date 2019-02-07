package cryptopals.set1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Challenge2Test {
  @Test public void testXor() {
    byte[] a = Challenge1.decodeHex("1c0111001f010100061a024b53535009181c");
    byte[] b = Challenge1.decodeHex("686974207468652062756c6c277320657965");
    byte[] out = Challenge1.decodeHex("746865206b696420646f6e277420706c6179");
    assertArrayEquals(Challenge2.xor(a, b), out);
  }
}
