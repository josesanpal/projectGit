//Author Jose
package zellerg;

public class Zellerg {

    //Declaraciones globales
    String[] ArrayDias;

    public static void main(String[] args) {
        int d = ZellerG(22, 2, 2001);
        //modificamos el progama para ver el dia Lunes, Martes, .....
        String [] ArrayDias = new String[]{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        System.out.println(d);
        System.out.println(ArrayDias[d]);
    }

    private static int ZellerG(int Day, int Month, int Year) {
        int Zeller;
        Month = (Month + 10) % 12;
        Year = Year - 1 * ((Month > 10) ? 1 : 0);
        Zeller = (13 * Month - 1) / 5 + 1 + Year % 100 + (Year % 100) / 4 + (-2 * (Year / 100)) + (Year / 400) % 7;
        Zeller = ((Zeller + Day) % 7 + 6) % 7;
        return Zeller;
    }

}

