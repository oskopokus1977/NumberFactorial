public class FactorialNumber {
  public static void main(String[] args) {
    System.out.println(factorialNumber(720));
  }

  public static int factorialNumber(int factorial) {
    if (factorial <= 1) {
      return 1;
    }
    int n = 1;
    while (factorial > 1) {
      if (factorial % n == 0) {
        factorial = factorial/n;
        n++;
      } else {
        throw new ArithmeticException("This number is not factorial for any number");
      }
    }
    return n - 1;
  }

}
