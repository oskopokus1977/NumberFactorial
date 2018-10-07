import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
//   factorialBIG(100);

    int[]arr = {5,0,4,0};
    factorialBIG(arr, 2000);

  }

//  public static int factorial(BigInteger factorial) {
//    if (factorial.equals(1)) {
//      return 1;
//    }
//    int n = 1;
//    while (factorial.longValue()>1) {
//      if (factorial.intValue() % n == 0) {
//        factorial = factorial.divide(BigInteger.valueOf(n));
//        n++;
//      } else {
//        throw new ArithmeticException("This number is not factorial for any number");
//      }
//    }
//    return n - 1;
//  }

//  static void factorialBIG(int n)
//  {
//    int res[] = new int[500];
//
//    // Initialize result
//    res[0] = 1;
//    int res_size = 1;
//
//    // Apply simple factorial formula
//    // n! = 1 * 2 * 3 * 4...*n
//    for (int x = 2; x <= n; x++)
//      res_size = multiply(x, res, res_size);
//
//    System.out.println("Factorial of given number is ");
//    for (int i = res_size - 1; i >= 0; i--)
//      System.out.print(res[i]);
//  }
//
//  // This function multiplies x with the number
//  // represented by res[]. res_size is size of res[] or
//  // number of digits in the number represented by res[].
//  // This function uses simple school mathematics for
//  // multiplication. This function may value of res_size
//  // and returns the new value of res_size
//  static int multiply(int x, int res[], int res_size)
//  {
//    int carry = 0; // Initialize carry
//
//    // One by one multiply n with individual
//    // digits of res[]
//    for (int i = 0; i < res_size; i++)
//    {
//      int prod = res[i] * x + carry;
//      res[i] = prod % 10; // Store last digit of
//      // 'prod' in res[]
//      carry = prod/10; // Put rest in carry
//    }
//
//    // Put carry in res and increase result size
//    while (carry!=0)
//    {
//      res[res_size] = carry % 10;
//      carry = carry / 10;
//      res_size++;
//    }
//    return res_size;
//  }

  static void factorialBIG(int[] arr, int n )
  {
    int res[] = new int[500];
//    int res[] = new int[n.length];

    // Initialize result
    res[0] = 1;
    int res_size = 1;

    // Apply simple factorial formula
    // n! = 1 * 2 * 3 * 4...*n
    for (int x = 2; x <= n; x++)
        res_size = multiply(x, res, res_size);





    System.out.println("Factorial of given number is ");
    for (int i = res_size - 1; i >= 0; i--)
      System.out.print(res[i]);
  }

  // This function multiplies x with the number
  // represented by res[]. res_size is size of res[] or
  // number of digits in the number represented by res[].
  // This function uses simple school mathematics for
  // multiplication. This function may value of res_size
  // and returns the new value of res_size
  static int multiply(int x, int res[], int res_size)
  {
    int carry = 0; // Initialize carry

    // One by one multiply n with individual
    // digits of res[]
    for (int i = 0; i < res_size; i++)
    {
      int prod = res[i] * x + carry;
      res[i] = prod % 10; // Store last digit of
      // 'prod' in res[]
      carry = prod/10; // Put rest in carry
    }

    // Put carry in res and increase result size
    while (carry!=0)
    {
      res[res_size] = carry % 10;
      carry = carry / 10;
      res_size++;
    }
    return res_size;
  }

}
