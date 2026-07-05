class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] time : times) {
            graph.get(time[0]).add(new int[]{time[1], time[2]});
        }

        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[1] - b[1]);

        pq.offer(new int[]{k, 0});

        boolean[] visited = new boolean[n + 1];

        int time = 0;
        int count = 0;

        while (!pq.isEmpty()) {

            int[] current = pq.poll();

            int node = current[0];
            int dist = current[1];

            if (visited[node]) {
                continue;
            }

            visited[node] = true;
            count++;
            time = dist;

            for (int[] neighbor : graph.get(node)) {

                if (!visited[neighbor[0]]) {
                    pq.offer(new int[]{
                        neighbor[0],
                        dist + neighbor[1]
                    });
                }
            }
        }

        return count == n ? time : -1;
    }
}