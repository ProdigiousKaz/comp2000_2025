public class stage {
    private Grid grid;


    public stage() {
        grid = new Grid();
    }

    public void paint(Graphics g. paint mousePos){
        grid.paint(g, mousePos);
    }
}
