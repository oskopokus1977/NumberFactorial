import java.math.BigInteger;

public class FactorialNumber {

  public static void main(String[] args) {
    //  factorial number calculation with big integer
    BigInteger bigInteger = new BigInteger("5040");
    System.out.println(factorialBigNumber(bigInteger));

    //  factorial number calculation with integer
    System.out.println(factorialNumber(5040));
  }


  public static int factorialNumber(long factorial) {
    if (factorial <= 1) {
      return 1;
    }
    int n = 1;
    while (factorial > 1) {
      if (factorial % n == 0) {
        factorial = factorial / n;
        n++;
      } else {
        throw new ArithmeticException("This number is not factorial for any number");
      }
    }
    return n - 1;
  }


  public static BigInteger factorialBigNumber(BigInteger factorial) {
    if (factorial.equals(BigInteger.ONE)) {
      return BigInteger.ONE;
    }
    BigInteger oneOper = BigInteger.ONE;
    while (factorial.compareTo(BigInteger.ONE) != 0) {

      if (factorial.mod(oneOper).compareTo(BigInteger.ZERO) == 0) {
        factorial = factorial.divide(oneOper);
        oneOper = oneOper.add(BigInteger.ONE);
      } else {
        System.out.println("This number is not factorial for any number");
        oneOper = BigInteger.ONE;
        break;
      }
    }
    return oneOper.subtract(BigInteger.ONE);
  }


}
