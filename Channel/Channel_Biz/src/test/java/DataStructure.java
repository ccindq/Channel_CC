import java.util.LinkedList;

/**
 * @author changcheng
 * @version 2017/6/21
 * @description
 */
public class DataStructure {

    LinkedList<Node> linkedList;

    public Node getNode() {
        return linkedList.getLast();
    }

    public void addNode(Node node) {
        linkedList.addLast(node);
    }

    class Node {
        private String key ;
        private Node nextNode;

        public Node(String key){
            this.key=key;
        }

        public String getKey() {
            return key;
        }
        public void setKey(String key) {
            this.key = key;
        }
        public Node getNextNode() {
            return nextNode;
        }
        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }

}
