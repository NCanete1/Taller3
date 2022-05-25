import java.util.ArrayList;
import java.util.List;

public class Cuaderno {

    private List<Hoja> hojaList;
    Escribir escribir= new Escribir();

    private List<Hoja> getHojaList() {
        return hojaList;
    }

    public void setHojaList(List<Hoja> hojaList) {
        this.hojaList = hojaList;
    }

    public Cuaderno(){
        this.hojaList = new ArrayList<Hoja>(100);
    }

    public void Escribir(int cant_hojas){
        int i= cant_hojas;
        if(i>this.hojaList.size()||i<this.hojaList.size()) {
            for (i = 0; i < cant_hojas; i++) {
                hojaList.get(i).setHoja(escribir.Escribir());
            }
        }
    }

}