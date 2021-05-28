// max depth of N-ARY TREE.(BFS)
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solutin42 {
    class Node {
        public int val;
        public List<Node> children;
        public Node(int _val) {
            val = _val;
        }
            

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        if (root == null) return 0;

        int depth = 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i=0; i<size; i++) {
                Node currNode = queue.poll();
                for (Node child : currNode.children) {

                    queue.offer(child);
                }
            }
            depth++;
        }
        return depth;
    }
}
