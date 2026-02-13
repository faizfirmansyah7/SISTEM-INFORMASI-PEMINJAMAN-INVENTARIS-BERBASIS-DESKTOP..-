public class Barang {
    private int idBarang;
    private String namaBarang;
    private int jumlah;
    private String kondisi;

    public Barang(int idBarang, String namaBarang, int jumlah, String kondisi) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.kondisi = kondisi;
    }

    public String getNamaBarang() {
        return namaBarang;
    }
}
