public class Graus {
    private int NEncontros;
    private int quantEncontros = 1;

    public Graus(int NEncontros) {
        this.NEncontros = NEncontros;
    }

    public int getNEncontros() {
        return NEncontros;
    }

    public void setNEncontros(int NEncontros) {
        this.NEncontros = NEncontros;
    }

    public int getQuantEncontros() {
        return quantEncontros;
    }
    
    public void incEncontros(){
        this.quantEncontros++;
    }

    @Override
    public int hashCode() {
        int hash = 6;
        hash = 68 * hash + this.NEncontros;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Graus other = (Graus) obj;
        if (this.NEncontros != other.NEncontros) {
            return false;
        }
        return true;
    }
    
    
}