package JavaStart.ObjectPrograming1.Cabrio;

public class main {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("Passat","Volkswagen", 340, false, false);
        cabrio.openRoof(cabrio.isDriving());
    }
}
