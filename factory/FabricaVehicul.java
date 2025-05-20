package factory;

public class FabricaVehicul {
    public Vehicul creeazaVehicul(String tip) {
        if (tip == null) {
            return null;
        }
        switch (tip.toLowerCase()) {
            case "masina":
                return new Masina();
            case "bicicleta":
                return new Bicicleta();
            case "motocicleta":
                return new Motocicleta();
            default:
                return null;
        }
    }
}

