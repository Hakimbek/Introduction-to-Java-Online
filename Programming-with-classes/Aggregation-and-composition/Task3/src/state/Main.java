package state;

public class Main {
    public static void main(String[] args) {
        City urgench = new City("Urgench",100);
        City xiva = new City("Xiva",150);

        District xonka = new District("Xonka", 50);
        District gurlan = new District("Gurlan", 60);

        Region xorezm = new Region("Xorezm", "Urgench", new District[] {xonka, gurlan}, new City[] {urgench, xiva});

        City shayxontoxur = new City("Shayxontoxur",200);
        City yunusobod = new City("Yunusobod",220);
        City chilonzor = new City("Chilonzor",180);

        Region tashkent = new Region("Tashkent", "Tahkent", null, new City[]{shayxontoxur, chilonzor, yunusobod});

        State uzbekistan = new State("Uzbekistan", new Region[] {xorezm, tashkent}, "Tashkent");
        uzbekistan.amountOfRegions();

        System.out.println(uzbekistan.getCapital());
        System.out.println(uzbekistan.getSquare());
    }
}
