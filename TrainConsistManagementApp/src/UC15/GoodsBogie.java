package UC15;

public class GoodsBogie {

    private String shape;
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargo) {

        try {
            // Rule: Rectangular cannot carry Petroleum
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe cargo assignment: Rectangular cannot carry Petroleum"
                );
            }

            // Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo assigned: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.");
        }
    }

    public String getShape() {
        return shape;
    }

    public String getCargo() {
        return cargo;
    }
}
