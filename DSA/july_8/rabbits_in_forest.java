import java.util.HashMap;
import java.util.Map;

public class rabbits_in_forest {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;

        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }

        for (int x : map.keySet()) {
            int count = map.get(x);
            int groupSize = x + 1;
            int numberOfGroups = (count + x) / groupSize;
            total += numberOfGroups * groupSize;
        }

        return total;
    }

}