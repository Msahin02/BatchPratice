package practice06.fırın;

public abstract class BeyazEkmek implements Ekmek{

    public BeyazEkmek() {

    }

    @Override
    public void un() {

        System.out.println("Beyaz ekmek %59 un içerir");
    }

    @Override
    public void su() {
        System.out.println("Beyaz ekmek %38 su içerir");

    }

    @Override
    public void maya() {
        System.out.println("Beyaz ekmek %1.5 maya içerir");
    }


    public abstract void sekil ();





}
