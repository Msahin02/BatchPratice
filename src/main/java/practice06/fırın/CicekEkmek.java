package practice06.fırın;

public class CicekEkmek extends BeyazEkmek{
    @Override
    public void sekil() {
        System.out.println("Cicek ekmek cicek şeklinde olur");
    }

    @Override
    public void tuz() {
        System.out.println("Cicek ekmek cicek %1 tuz içerir.");
    }
}
