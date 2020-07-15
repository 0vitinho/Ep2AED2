import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AED2Ep2 {
    
    public static void main(String[] args) {
        List<Ids> IdsList = new ArrayList<>();
        List<Graus> graus = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo a ser lido");
        try (BufferedReader br = new BufferedReader (new FileReader(sc.nextLine()))){
            String aux = br.readLine(); 
            aux = br.readLine();       
            aux = br.readLine();

            while(aux != null){
                String[] line = aux.split(" ");

                Ids ID1 = new Ids(Integer.parseInt(line[0]));
                Ids ID2 = new Ids(Integer.parseInt(line[1]));

                if (!IdsList.contains(ID1)){ 
                    IdsList.add(ID1);
                    ID1.inserirNode(ID2);
                } else{
                    for (Ids IdAux : IdsList){
                        if(IdAux.equals(ID1)){
                            IdAux.inserirNode(ID2);
                            break;
                        }
                    }
                }
                
                if (!IdsList.contains(ID2)){ 
                    IdsList.add(ID2);
                    ID2.inserirNode(ID1);
                } else{
                    for (Ids IdAux : IdsList){
                        if(IdAux.equals(ID2)){
                            IdAux.inserirNode(ID1);
                            break;
                        }
                    }
                }
                aux = br.readLine();
            }
            for(Ids ids : IdsList){
                ids.setTamanho(ids.tamPilha());
                boolean existe = false;
                for(Graus d : graus){
                    if(d.getNEncontros() == ids.getTamanho()){
                        d.incEncontros();
                        existe = true;
                        break;
                    }
                }
                if(existe == false){ 
                    graus.add(new Graus(ids.getTamanho()));
                }
            }           
            
            System.out.print("Digite o caminho do arquivo de saída");
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(sc.nextLine()))){
                int tamLista = 0;
                for(Ids ids : IdsList) tamLista += ids.tamPilha();
                bw.write(Integer.toString(tamLista/2));
                bw.newLine();

                for(Graus d : graus){
                    bw.write(Integer.toString(d.getNEncontros()) + "," + Integer.toString(d.getQuantEncontros()));
                    bw.newLine();
                }
}
        }catch (IOException e){
            e.getMessage();
            e.printStackTrace();
        }
    }
}