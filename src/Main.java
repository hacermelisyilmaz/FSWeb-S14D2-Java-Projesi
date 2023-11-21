public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Master bedroom",
                new Wall("north"), new Wall("east"), new Wall("south"), new Wall("west"),
                new Ceiling(3, PaintColor.BLUE),
                new Bed("King", 2, 3, 2, 1),
                new Lamp(LampType.BEDSIDE, true, 10),
                new Wardrobe(1, 2, 10),
                new Carpet(2, 2, PaintColor.WHITE));

        bedroom.getWall1().create();
        bedroom.getWall2().create();
        bedroom.getWall3().create();
        bedroom.getWall4().create();

        bedroom.getCeiling().create();

        bedroom.getBed().make();

        bedroom.getLamp().turnOn();

        bedroom.getWardrobe().add();

        bedroom.getCarpet().lying();
    }
}