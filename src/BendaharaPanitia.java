public class BendaharaPanitia extends Panitia {
    BendaharaPanitia(String noAnggota, String nama, String periode) {
        super(noAnggota, nama, periode);
        //TODO Auto-generated constructor stub
    }
    void mengajukanAnggaran(){
        System.out.println("Mengajukan Anggaran");
    }
    void membuatLaporan(){
        System.out.println("Membuat Laporan");
    }
    void menghapusLaporan(){
        System.out.println("Menghapus Laporan");
    }
}
