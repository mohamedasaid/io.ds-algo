package DFS;



import java.util.ArrayList;

import java.util.List;

public class DepthFirstSearch {

    static class Node {
        String name;
        List<Node> children;

        public Node(String name) {
            this.name = name;
            this.children  = new ArrayList<>();

        }

        public Node addChild(String name){
            Node child = new Node(name);
            children.add(child);
            return this;
        }

        public List<String> depthFirstSearch(List<String> list) {

            list.add(this.name);
            for(int i = 0; i < children.size(); i++) {
                children.get(i).depthFirstSearch(list);
            }
            return list;
        }
    }


    public void test() {
        List<String> list = new ArrayList<>();
        Node node = new Node("1");
        node.addChild("2").addChild("3").addChild("4").addChild("13");
        node.children.get(0).addChild("5").addChild("6");
        node.children.get(2).addChild("7").addChild("8");
        node.children.get(0).children.get(1).addChild("9").addChild("10");
        node.children.get(2).children.get(0).addChild("11");
        node.addChild("12");
        System.out.println(node.depthFirstSearch(list));
    }



    public static void main(String[] args) {
        DepthFirstSearch dfs = new DepthFirstSearch();
        dfs.test();

    }


}
