import java.util.ArrayList;
import java.util.List;

public class GraphFlow {

    private String beginNode;
    private String endNode;

    public GraphFlow() {
        this.beginNode = "";
        this.endNode = "";
    }

    public GraphFlow(String beginNode, String endNode) {
        this.beginNode = beginNode;
        this.endNode = endNode;
    }

    public String getBeginNode() {
        return beginNode;
    }

    public String getEndNode() {
        return endNode;
    }

    public void setBeginNode(String beginNode) {
        this.beginNode = beginNode;
    }

    public void setEndNode(String endNode) {
        this.endNode = endNode;
    }

}
