public class EggBox {
    // vars
    private int eggs;
    private int boxSize;
    private int numBoxes;
    private int leftOverEggs;

    // set
    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public void setBoxSize(int boxSize) {
        this.boxSize = boxSize;
    }

    // compute
    public void computeBoxes() {
        numBoxes = eggs / 6;
    }

    public void computeLeftover() {
        leftOverEggs = eggs % boxSize;
    }

    // get
    public int getBoxes() {
        return numBoxes;
    }

    public int getLeftover() {
        return leftOverEggs;
    }

    public static void main(String[] args) {
        EggBox eggBox = new EggBox();

        // Set the number of eggs and box size
        eggBox.setEggs(24);
        eggBox.setBoxSize(6);

        // Compute the number of boxes and leftover eggs
        eggBox.computeBoxes();
        eggBox.computeLeftover();

        // Get the results and print them
        int numBoxes = eggBox.getBoxes();
        int leftOver = eggBox.getLeftover();
        System.out.println("Welcome To EggBox!");
        System.out.println("Number of boxes needed: " + numBoxes);
        System.out.println("Number of leftover eggs: " + leftOver);
        System.out.println("Thank you for using EggBox!");
    }
}
