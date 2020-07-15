public class pilhaDinamica {
    private Node topo;

    public pilhaDinamica(){
        topo = null;
    }

    public void inserirNode(Ids ID){
        Node novo = new Node(ID);
        novo.setProximo(topo);
        topo = novo;
    }
    
    public int removerNode(){
        if(topo == null) throw new NullPointerException("pilha vazia");
        else {
            Node id = topo;
            topo = topo.getProximo();
            return id.getID();
        }       
    }

    public Node buscarNaPilha(Ids buscaId){
        if(topo.getID() == buscaId.getId()) return topo;
        Node base = topo;
        
        while(base != null){
            if(base.getID() == buscaId.getId()) return base;
            base = base.getProximo();
        } 
        return null;
    }

    public int tamPilha(){
        int tam = 0;
        Node base = topo;
        while(base != null){
            tam++;
            base = base.getProximo();
        }
        return tam;
    }
    
    public boolean estaVazia(){
        if(topo == null) return true;
        return false;
    }
}