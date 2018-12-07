public class P8GenerateParentheses {
  public List<String> generateParentheses(int n) {
          List<String> l1 = new ArrayList();
          generate(l1, "", 0, 0, n);
          return l1;
  }
  public void generate(List<String> l1, String str, int a, int b, int x){
        if (str.length() == x * 2) {
            l1.add(str);
            return;
        }
        if (a < x)
            generate(l1, str+"(", a+1, b, x);
        if (b < a)
            generate(l1, str+")", a, b+1, x);
    }
}
