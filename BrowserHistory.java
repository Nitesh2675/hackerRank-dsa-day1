class BrowserHistory {

    private class Node{
        Node prev,next;
        String url;
        Node(String url){
            this.url=url;
        }
    }

    private Node current;
    public BrowserHistory(String homepage) {
        current=new Node(homepage);
    }

    public void visit(String url) {
        Node newNode = new Node(url);
        current.next=null;
        newNode.prev=current;
        current.next=newNode;
        current=newNode;
    }

    public String back(int steps) {
        while(steps-- > 0 && current.prev!=null){
            current=current.prev;
        }
        return current.url;
    }

    public String forward(int steps) {
        while(steps-- > 0 && current.next!=null){
            current=current.next;
        }
        return current.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */