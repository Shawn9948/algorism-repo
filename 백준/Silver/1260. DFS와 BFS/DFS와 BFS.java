import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public String dfsSolution(int start, Node[] nodes) {
        StringBuilder sb = new StringBuilder();
        Node first = nodes[start - 1];
        dfs(first, sb);
        return sb.toString();
    }

    public void dfs(Node node, StringBuilder sb) {
        sb.append(node.getNum()).append(" ");
        node.setMark(true);
        node.getEdges().sort((o1, o2) -> o1.getNum() - o2.getNum());
        for (Node edge : node.getEdges()) {
            if (!edge.isMark()) {
                dfs(edge, sb);
            }
        }
    }

    public String bfsSolution(int start, Node[] nodes) {
        StringBuilder sb = new StringBuilder();
        Node first = nodes[start - 1];
        Queue<Node> arrayDeque = new LinkedList<>();
        arrayDeque.add(first);
        while (!arrayDeque.isEmpty()) {
            Node node = arrayDeque.poll();
            if (!node.isMark())
                sb.append(node.getNum()).append(" ");
            node.setMark(true);

            node.getEdges().sort((o1, o2) -> o1.getNum() - o2.getNum());
            for (Node edge : node.getEdges()) {
                if (!edge.isMark())
                    arrayDeque.add(edge);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main main = new Main();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        Node[] nodes = new Node[N];
        for (int i = 0; i < N; i++) {
            nodes[i] = new Node(i + 1, false);
        }
        connectNodes(br, M, nodes);
        System.out.println(main.dfsSolution(start, nodes));
        for (Node node : nodes) {
            node.setMark(false);
        }
        System.out.println(main.bfsSolution(start, nodes));
    }

    private static void connectNodes(BufferedReader br, int M, Node[] nodes) throws IOException {
        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int i1 = Integer.parseInt(st.nextToken()) - 1;
            int i2 = Integer.parseInt(st.nextToken()) - 1;
            if (!nodes[i1].getEdges().contains(nodes[i2]))
                nodes[i1].getEdges().add(nodes[i2]);
            if (!nodes[i2].getEdges().contains(nodes[i1]))
                nodes[i2].getEdges().add(nodes[i1]);
        }
    }
}

class Node {
    private final int num;
    private boolean mark;
    private List<Node> edges;

    public int getNum() {
        return num;
    }

    public List<Node> getEdges() {
        return edges;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public Node(int num, boolean mark) {
        this.num = num;
        this.mark = mark;
        this.edges = new ArrayList<>();
    }


}