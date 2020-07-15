public class Node {
    private Ids ID;
    private Node proximo;

    public Node(Ids ID){
       this.ID = ID;
       this.proximo = null;
   }

    public int getID() {
        return ID.getId();
    }
    
    public void setID(Ids ID) {
        this.ID = ID;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node prox) {
        this.proximo = prox;
    }   
}