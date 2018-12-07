public class P9Power {
  public static double myPow(double x, int n) {
    if (n < 0) {
        x = 1 / x;
        n = -n;
    }
    return fastPower1(x, n);
  }

  public static double power(double x, int n) {
    if (n == 0) return 1;
    return x * power(x, n - 1);
  }
}
