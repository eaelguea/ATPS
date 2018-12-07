public class P6ZigZag {
    public String convert(String s, int row) {

        if (row == 1) return s;

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int length = 2 * row - 2;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j + i < n; j += length) {
                sb.append(s.charAt(j + i));
                if (i != 0 && i != row - 1 && j + length - i < n)
                    sb.append(s.charAt(j + length - i));
            }
        }
        return sb.toString();
    }
}
