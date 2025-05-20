package factory;

public class Main {
    public static void main(String[] args) {
        FabricaVehicul fabrica = new FabricaVehicul();

        Vehicul v1 = fabrica.creeazaVehicul("masina");
        Vehicul v2 = fabrica.creeazaVehicul("bicicleta");
        Vehicul v3 = fabrica.creeazaVehicul("motocicleta");

        if (v1 != null) v1.afiseazaTipul();
        if (v2 != null) v2.afiseazaTipul();
        if (v3 != null) v3.afiseazaTipul();
    }
}

