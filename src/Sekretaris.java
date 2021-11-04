public class Sekretaris extends Perangkat {
    Sekretaris(String noAnggota, String nama, String periode) {
        super(noAnggota, nama, periode);
        //TODO Auto-generated constructor stub
    }
    void membuatPekerjaan(){
        System.out.println("Membuat Pekerjaan");
    }
    void menghapusPekerjaan(){
        System.out.println("Menghapus Pekerjaan");
    }
    void membuatJadwal(){
        System.out.println("Membuat Jadwal");
    }
    void menghapusJadwal(){
        System.out.println("Menghapus Jadwal");
    }
    void menambahAnggota(){
        System.out.println("Menambah Anggota");
    }
    void menghapusAnggota(){
        System.out.println("Menghapus Anggota");
    }
    void menambahKegiatan(){
        System.out.println("Menambah Kegiatan");
    }
    void menghapusKegiatan(){
        System.out.println("Menghapus Kegiatan");
    }
}
