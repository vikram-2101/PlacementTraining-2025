import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class infected_BT {
    Map<Integer, List<Integer>> graph = new HashMap<>();

    public int amountOfTime(TreeNode root, int start) {
        // Step 1: Convert tree to undirected graph
        buildGraph(root, null);

        // Step 2: BFS from the start node
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.offer(start);
        visited.add(start);

        int minutes = -1;

        while (!q.isEmpty()) {
            int size = q.size();
            minutes++; // every level = 1 minute

            for (int i = 0; i < size; i++) {
                int current = q.poll();
                for (int neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        visited.add(neighbor);
                        q.offer(neighbor);
                    }
                }
            }
        }

        return minutes;
    }

    // DFS to build the graph
    private void buildGraph(TreeNode node, TreeNode parent) {
        if (node == null)
            return;

        graph.putIfAbsent(node.val, new ArrayList<>());
        if (parent != null) {
            graph.get(node.val).add(parent.val);
            graph.get(parent.val).add(node.val);
        }

        buildGraph(node.left, node);
        buildGraph(node.right, node);
    }
}
