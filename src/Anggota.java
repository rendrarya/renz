public class Anggota {
    String noAnggota;
    String nama;
    String telpon;
    String alamat;
    String periode;

    Anggota(String nama, String noAnggota, String periode){
        this.nama = nama;
        this.noAnggota = noAnggota;
        this.periode = periode;
    }
    
    Anggota(String nama, String noAnggota){
        this.nama = nama;
        this.noAnggota = noAnggota;
    }

    void display(){
        System.out.println("Nama: "+ this.nama + "\nNo Anggota: "+ this.noAnggota);
    }

    void melihatJadwal(){
        System.out.println("Melihat Jadwal");
    }

    void melihatPekerjaan(){
        System.out.println("Melihat Pekerjaan");
    }

    void melihatLaporan(){
        System.out.println("Melihat Laporan");
    }

    void melihatAnggaran(){
        System.out.println("Melihat Anggaran");
    }

    void melihatAnggota(){
        System.out.println("Melihat Anggota");
    }

    void melihatKegiatan(){
        System.out.println("Kelihat Kegiatan");
    }
}