import java.util.*;

public class P7Combine {
    public List<List<Integer>> combine(int n, int k) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        result.add(new ArrayList<>());
        for(int num = k; num > 0; num--) {
            int size = result.size();
            for(int i = 0; i < size; i++) {
                List<Integer> first = result.pollFirst();
                int start = first.size() == 0 ? 1 : first.get(first.size() - 1) + 1;
                for(int j = start; j <= n - num + 1; j++) {
                    List<Integer> temp = new ArrayList<>(first);
                    temp.add(j);
                    result.add(temp);
                }
            }
        }
        return result;
    }
}
