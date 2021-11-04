public class Koordinator extends Panitia {
    Koordinator(String noAnggota, String nama, String periode) {
        super(noAnggota, nama, periode);
        //TODO Auto-generated constructor stub
    }
    void membuatLaporan(){
        System.out.println("Membuat Laporan");
    }
    void menghapusLaporan(){
        System.out.println("Menghapus Laporan");
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
}
