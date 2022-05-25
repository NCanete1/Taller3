import java.util.ArrayList;
import java.util.List;

public class Cuaderno {

    private ArrayList<Hoja>bs;
    Escribir escribir= new Escribir();

    private ArrayList<Hoja> getBs() {
        return bs;
    }

    public void setBs(ArrayList<Hoja> bs) {
        this.bs = bs;
    }

    public Cuaderno(){
        this.bs= new ArrayList<Hoja>(100);
    }

    public void Escribir(int cant_hojas){
        for(int i=0; i<cant_hojas;i++){
            bs.set(i,escribir.Escribir());
        }

    }

}