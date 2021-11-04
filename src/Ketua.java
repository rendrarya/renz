public class Ketua extends Perangkat {
    
    
    // Ketua(String nama, String noAnggota) {
    //     super(nama, noAnggota);
    //     //TODO Auto-generated constructor stub
    // }

    Ketua(String nama, String noAnggota, String periode) {
        super(nama, noAnggota, periode);
        //TODO Auto-generated constructor stub
    }

    void display(){
        System.out.println("nama: "+ this.nama + "\nNo angota: "+ this.noAnggota + "\nPeriode: "+ this.periode);
    }

    void menyetujuiAnggaran(){
        System.out.println("Menyetujui Anggaran");
    }
    void menyetujuiPekerjaan(){
        System.out.println("Menyetujui Pekerjaan");
    }
    void menyetujuiJadwal(){
        System.out.println("Menyetujui Kadwal");
    }
    void menyetujuiKegiatan(){
        System.out.println("Menyetujui Kegiatan");
    }
}