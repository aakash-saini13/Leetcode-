import java.util.*;

public class Solution {
    public int removeStones(int[][] stones) {
        // Create a graph where each stone is a node, and two nodes are connected if the corresponding stones share the same row or column
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < stones.length; i++) {
            graph.put(i, new ArrayList<>());
            for (int j = 0; j < stones.length; j++) {
                if (i != j && (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1])) {
                    graph.get(i).add(j);
                }
            }
        }

        // Use DFS to find the largest connected component in the graph
        Set<Integer> visited = new HashSet<>();
        int maxRemoved = 0;
        for (int i = 0; i < stones.length; i++) {
            if (!visited.contains(i)) {
                Set<Integer> component = new HashSet<>();
                dfs(graph, visited, component, i);
                maxRemoved += component.size() - 1;
            }
        }

        return maxRemoved;
    }

    private void dfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, Set<Integer> component, int node) {
        visited.add(node);
        component.add(node);
        for (int neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(graph, visited, component, neighbor);
            }
        }
    }
}
