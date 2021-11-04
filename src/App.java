public class App {
    public static void main(String[] args) throws Exception {
        // a. 1 instance yang hanya anggota 
        Anggota ketut = new Anggota("Ketut", "01");
        ketut.display();

        System.out.println("#################################");
        // b. 1 instance ketua pengurus 
        Ketua salwa = new Ketua("Salwa", "02", "2019 / 2020");
        salwa.display();
        
        System.out.println("#################################");
        // c. 1 instance ketua panitia 
        KetuaPanitia karishma = new KetuaPanitia("Karishma", "03", "2020 / 2021");
        karishma.display();
    }
}