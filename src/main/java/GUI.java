import java.util.List;

public class GUI {
    private List<Hoja> hojaList;
    Cuaderno cuaderno=new Cuaderno();
    QuitarHoja quitarHoja= new QuitarHoja();
    Escribir escribir= new Escribir();
    int option;
    public static void Gui(){

    }

    public void Menu(){
        cuaderno.setHojaList(hojaList);
        System.out.println("Cuaderno contiene: "+ hojaList.size());
    }
}
