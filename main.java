class Mahasiswa{
    String nama;
    String NPM;
    String kelas;
    checkPelunasanUKT checkPelunasanUKT;

    Mahasiswa(String nama, String NPM, String kelas){
        this.nama = nama;
        this.NPM = NPM;
        this.kelas = kelas;
    }

    void show(){
        System.out.println("Nama Mahasiswa \t:" + this.nama);
        System.out.println("NPM Mahasiswa \t:" + this.NPM);
        System.out.println("kls Mahasiswa \t:" + this.kelas);
        checkPelunasanUKT.show();
        System.out.println(" ");
    }

    void checkUKT(checkPelunasanUKT checkPelunasanUKT){
        this.checkPelunasanUKT = checkPelunasanUKT;
    }
}

class checkPelunasanUKT{
    String name;
    String status;

    checkPelunasanUKT(String status){
        this.status = status;
    }

    void show(){
        System.out.println("Status Pembayaran UKT " + this.status);
    }
}

public class main{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Nanda prasetyo", "C1A023003", "A");
        Mahasiswa mahasiswa2 = new Mahasiswa("Zaki nurrahman", "C1A023065", "A");
        Mahasiswa mahasiswa3 = new Mahasiswa("Prasetyo ghazali", "C1A023043", "A");
        Mahasiswa mahasiswa4 = new Mahasiswa("Intan Iskandar", "D1B023056", "B");
        Mahasiswa mahasiswa5 = new Mahasiswa("Annisa Tirto", "C1B023042", "B");
        Mahasiswa mahasiswa6 = new Mahasiswa("Cahaya Dewi", "C1A023024", "A");
        Mahasiswa mahasiswa7 = new Mahasiswa("Ilham Hasan", "C1B023041", "B");
        Mahasiswa mahasiswa8 = new Mahasiswa("Hamidah Wira", "C1A023025", "A");
        Mahasiswa mahasiswa9 = new Mahasiswa("Sri Ahmad", "C1A023065", "A");
        Mahasiswa mahasiswa10 = new Mahasiswa("Tirto Ilham", "C1B023014", "B");

        String refMahasiswa = Integer.toHexString(mahasiswa1.hashCode());
        String refMahasiswa2 = Integer.toHexString(mahasiswa2.hashCode());

        checkPelunasanUKT lunas = new checkPelunasanUKT( "Lunas");
        checkPelunasanUKT belumLunas = new checkPelunasanUKT( "Belum Lunas");

        mahasiswa1.checkUKT(lunas);
        mahasiswa2.checkUKT(belumLunas);
        mahasiswa3.checkUKT(lunas);
        mahasiswa4.checkUKT(belumLunas);
        mahasiswa5.checkUKT(lunas);
        mahasiswa6.checkUKT(lunas);
        mahasiswa7.checkUKT(belumLunas);
        mahasiswa8.checkUKT(lunas);
        mahasiswa9.checkUKT(lunas);
        mahasiswa10.checkUKT(belumLunas);

        mahasiswa1.show();
        System.out.println(refMahasiswa);
        mahasiswa2.show();
        System.out.println(refMahasiswa2);
        mahasiswa3.show();
        mahasiswa4.show();
        mahasiswa5.show();
        mahasiswa6.show();
        mahasiswa7.show();
        mahasiswa8.show();
        mahasiswa9.show();
        mahasiswa10.show();

    }
}