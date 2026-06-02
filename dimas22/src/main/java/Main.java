public class Main {

    public static void main(String[] args) {

        Buku buku1 = new Buku();

        Buku buku2 = new Buku(101);

        Buku buku3 = new Buku(102, "Laskar Pelangi", "Andrea Hirata", 2005);

        buku3.create();

        System.out.println(buku3.read());

        buku3.update();

        System.out.println(buku3.delete());
    }
}