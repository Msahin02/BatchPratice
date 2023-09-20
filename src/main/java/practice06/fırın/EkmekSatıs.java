package practice06.fırın;

public class EkmekSatıs {
    public static void main(String[] args) {


        CicekEkmek ekmek1 = new CicekEkmek();
        ekmek1.tuz();
        ekmek1.un();
        KepekliEkmek ekmek2 = new KepekliEkmek();
        ekmek2.su();
        ekmek2.sekli();

        KepekliSandvicEkmegi ekmek3 = new KepekliSandvicEkmegi();
        ekmek3.maya();
        ekmek3.sekli();
        ekmek3.kepek();


    }
}
