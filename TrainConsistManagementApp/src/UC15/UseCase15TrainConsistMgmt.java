package UC15;

public class UseCase15TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("====================================");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum"); // valid

        System.out.println();

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum"); // invalid but handled

        System.out.println("\nProgram continues safely...");
    }
}
