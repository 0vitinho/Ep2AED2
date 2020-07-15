public class Ids extends pilhaDinamica{
    private int id;
    private int tamLista;

    public Ids(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getTamanho() {
        return tamLista;
    }

    public void setTamanho(int tamLista) {
        this.tamLista = tamLista;
    }
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ids)) {
            return false;
        }
        Ids ids = (Ids) o;
        return id == ids.id && tamLista == ids.tamLista;
    }

    @Override
    public int hashCode() {
        int hash = 6;
        hash = 68 * hash + this.id;
        return hash;
    }


}