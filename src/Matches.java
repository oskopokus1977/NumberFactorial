public class Matches {

  public static void main(String[] args) {
    System.out.println(matchesQuantity(4));
  }

  public static int matchesQuantity(int squareQuantity) {
    int size = (int) Math.sqrt(squareQuantity);
    int count = 0;
    count += calcSquare(size);
    int height = (int) (squareQuantity - Math.pow(size, 2));
    if (height != 0) {
      if (height > size) {
        count += 6;
        height -= 2;
      } else {
        count += 3;
        height--;
      }
      count += height * 2;
    }
    return count;
  }

  private static int calcSquare(int size) {
    if (size == 0) {
      return 0;
    }
    int result = 4;
    size--;
    result += size * 2 * 3;
    result += Math.pow(size, 2) * 2;
    return result;
  }
}
