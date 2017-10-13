
public class Mercedes extends Car {

    private String star;

    public Mercedes(int weight, int size, String star) {
        super(4, 1, weight, size);
        this.star = star;
    }

    // methods
    public void handSteering() {
        handSteering();
        System.out.println("Mercedes ist bereit zum Gangwechsel");

    }

    public void changingGears(int gear) {
        changingGears(5);
        System.out.println("Mercedes wechselt Gang");
    }

    public void moving(int speed) {
        moving(5);
        System.out.println("Mercedes wird schneller");
    }

    // getters
    public String getStar() {
        return star;
    }
}
