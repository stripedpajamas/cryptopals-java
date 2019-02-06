package cryptopals.set1;

import java.util.Base64;

public class Challenge1 {
  private static int toDigit(char hexChar) {
    int digit = Character.digit(hexChar, 16);
    if (digit == -1) {
      throw new IllegalArgumentException(
        "Invalid hexadecimal digit:" + hexChar
      );
    }
    return digit;
  }
  public static String byteToHex(byte b) {
    char[] digits = new char[2];
    digits[0] = Character.forDigit((b >> 4) & 0xF, 16);
    digits[1] = Character.forDigit((b & 0xF), 16);
    return new String(digits);
  }
  public static byte hexToByte(String s) {
    int firstDigit = toDigit(s.charAt(0));
    int secondDigit = toDigit(s.charAt(1));
    return (byte) ((firstDigit << 4) + secondDigit);
  }
  public static String encodeHex(byte[] input) {
    StringBuffer output = new StringBuffer();
    for (int i = 0; i < input.length; i++) {
      output.append(byteToHex(input[i]));
    }
    return output.toString();
  }
  public static byte[] decodeHex(String input) {
    if (input.length() % 2 == 1) {
      throw new IllegalArgumentException(
        "Invalid hexadecimal string supplied."
      );
    }

    byte[] bytes = new byte[input.length() / 2];
    for (int i = 0; i < input.length(); i += 2) {
      bytes[i / 2] = hexToByte(input.substring(i, i + 2));
    }
    return bytes;
  }
  public static String hexToBase64(String input) {
    // convert hex string to bytes
    byte[] hex = decodeHex(input);
    // then convert byte string to base64
    String b64 = Base64.getEncoder().encodeToString(hex);
    return b64;
  }
}