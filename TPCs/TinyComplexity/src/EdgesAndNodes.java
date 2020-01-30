public class EdgesAndNodes {

    private int edges;
    private int nodes;

    public EdgesAndNodes(int edges, int nodes) {
        this.edges = edges;
        this.nodes = nodes;
    }

    public EdgesAndNodes() {
        this.edges = 0;
        this.nodes = 0;
    }

    public int getEdges() {
        return edges;
    }

    public int getNodes() {
        return nodes;
    }

    public void setNodes(int nodes) {
        this.nodes = nodes;
    }

    public void setEdges(int edges) {
        this.edges = edges;
    }

    public void sum(EdgesAndNodes en) {
        this.edges += en.edges;
        this.nodes += en.nodes;
    }
}
