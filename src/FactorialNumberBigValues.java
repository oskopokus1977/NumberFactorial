import java.util.Arrays;

public class FactorialNumberBigValues {

  public static void main(String[] args) {

    String factorial = "2432902008176640000";

    System.out.println(factorialNumber(factorial));
  }

  public static int factorialNumber(String factorial) {
    char[] chars = factorial.toCharArray();
    int[] arrayFactorial = new int[chars.length];
    for (int i = 0; i < chars.length; i++) {
      arrayFactorial[i] = Integer.parseInt(chars[i] + "");
    }
    int numberFact = 0;
    while (true) {
      int[] factorValue = factorial(numberFact);
      if (factorValue.length > arrayFactorial.length) {
        System.out.println("This value is not factorial for any number");
        numberFact = 0;
        break;
      }
      if (Arrays.equals(factorValue, arrayFactorial)) {
        break;
      }
      numberFact++;
    }
    return numberFact;
  }

  static int[] factorial(int n) {
    int res[] = new int[10000];

    res[0] = 1;
    int res_size = 1;

    for (int x = 2; x <= n; x++) {
      res_size = multiply(x, res, res_size);
    }

    int[] factNew = new int[res_size];
    for (int i = res_size - 1; i >= 0; i--) {
      factNew[Math.abs(i - res_size) - 1] = res[i];
    }
    return factNew;
  }

  static int multiply(int x, int res[], int res_size) {
    int carry = 0;
    for (int i = 0; i < res_size; i++) {
      int prod = res[i] * x + carry;
      res[i] = prod % 10;
      carry = prod / 10;
    }
    while (carry != 0) {
      res[res_size] = carry % 10;
      carry = carry / 10;
      res_size++;
    }
    return res_size;
  }
}
