public class Buku {

    private int id;
    private String judul;
    private String penulis;
    private int tahun;

    public Buku() {
        System.out.println("Constructor 1: kosong");
    }

    public Buku(int id) {
        this.id = id;
        System.out.println("Constructor 2: id saja");
    }

    public Buku(int id, String judul, String penulis, int tahun) {
        this.id = id;
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        System.out.println("Constructor 3: lengkap");
    }

    public void create() {
        String sql = "INSERT INTO buku (id, judul, penulis, tahun) VALUES ("
                + id + ", '" + judul + "', '" + penulis + "', " + tahun + ")";
        System.out.println(sql);
    }

    public String read() {
        return "SELECT * FROM buku";
    }

    public void update() {
        String sql = "UPDATE buku SET judul='" + judul
                + "', penulis='" + penulis
                + "', tahun=" + tahun
                + " WHERE id=" + id;
        System.out.println(sql);
    }

    public String delete() {
        return "DELETE FROM buku WHERE id=" + id;
    }
}