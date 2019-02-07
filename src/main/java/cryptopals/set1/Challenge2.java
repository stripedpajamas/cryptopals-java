package cryptopals.set1;

public class Challenge2 {
  public static byte[] xor(byte[] a, byte[] b) {
    if (a.length != b.length) {
      throw new IllegalArgumentException(
        "Inputs must be same size"
      );
    }
    byte[] out = new byte[a.length];
    for (int i = 0; i < a.length; i++) {
      out[i] = (byte) (a[i] ^ b[i]);
    }
    return out;
  }
}
