
package sisteminformasiperpustakaan;

import java.util.Scanner; // Mengimpor scanner ke program, Scanner merupakan class yang menyediakan fungsi-fungsi untuk mengambil input dari user

public class SistemInformasiPerpustakaan {
    
    static Scanner sc = new Scanner(System.in); // Membuat scanner baru
 
    //Manajemen Data Buku
    static class Buku{
        int id_buku; // Deklarasi variabel bertipe data integer
        String judul_buku,pengarang,penerbit,kategori_buku; // Deklarasi variabel bertipe data string
        
        //constructor yang isinya meminta data buku dari user
        Buku(){
            System.out.print("\nMasukkan ID buku : ");
            id_buku = sc.nextInt(); //menggunakan scanner dan menyimpan apa yang diinputkan user di variabel id_buku
            sc.nextLine();
            System.out.print("Masukkan judul buku : ");
            judul_buku = sc.nextLine(); //menggunakan scanner dan menyimpan apa yang diinputkan user di variabel judul_buku
            System.out.print("Masukkan pengarang buku : ");
            pengarang = sc.nextLine(); //menggunakan scanner dan menyimpan apa yang diinputkan user di variabel pengarang
            System.out.print("Masukkan penerbit buku : ");
            penerbit = sc.nextLine(); //menggunakan scanner dan menyimpan apa yang diinputkan user di variabel penerbit
            System.out.print("Masukkan kategori buku : ");
            kategori_buku = sc.nextLine(); //menggunakan scanner dan menyimpan apa yang diinputkan user di variabel kategori_buku
        }
        
        // fungsi untuk tampilkan data buku
        void tampilkan_data(){
            System.out.println("\nID = " + id_buku);
            System.out.println("Judul = " + judul_buku);
            System.out.println("Pengarang = " + pengarang);
            System.out.println("Penerbit = " + penerbit);
            System.out.println("Kategori = " + kategori_buku);
        }
        
        // fungsi untuk menghapus buku
        static Buku[] hapus_buku(Buku list[], int id){
            for (int i = 0; i < list.length; i++) { // Selama perulangan dijalankan akan dilakukan pengecekan
                if(list[i] != null && list[i].id_buku == id){  // Apabila pada array tidak kosong dan id yang yang diinputkan user nantinya sama dengan id_buku yang tersimpan pada array
                    list[i] = null;                         // maka data buku akan terhapus    
                    break;
                }
                
                if(i == list.length - 1){ 
                    System.out.println("Buku tersebut tidak ada di dalam list");
                }
            }
            return list;
        }
        
        // fungsi untuk cari buku
        static void cari_buku(Buku list[], int id){
            for (int i = 0; i < list.length; i++) {
                if(list[i] != null && list[i].id_buku == id){
                    System.out.println("\nBuku yang Anda cari adalah :");
                    System.out.println("ID = " + list[i].id_buku);
                    System.out.println("Judul Buku = " + list[i].judul_buku);
                    System.out.println("Pengarang Buku = " + list[i].pengarang);
                    System.out.println("Penerbit Buku = " + list[i].penerbit);
                    System.out.println("Kategori Buku = " + list[i].kategori_buku);
                    break;
                }
                
                if(i == list.length - 1){
                    System.out.println("Buku tersebut tidak ada di dalam list");
                }
            }
        }
        
        // fungsi untuk update buku
        static Buku[] update_buku(Buku list[], int id){
            for (int i = 0; i < list.length; i++) {
                if(list[i] != null && list[i].id_buku == id){
                    System.out.println("\nMasukkan data update: ");
                    System.out.print("Masukkan ID buku: ");
                    sc.nextLine();
                    list[i].id_buku = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    list[i].judul_buku = sc.nextLine();
                    System.out.print("Masukkan pengarang buku: ");
                    list[i].pengarang = sc.nextLine();
                    System.out.print("Masukkan penerbit buku: ");
                    list[i].penerbit = sc.nextLine();
                    System.out.print("Masukkan kategori buku: ");
                    list[i].kategori_buku = sc.nextLine();
                    break;
                }
                
                if(i == list.length - 1){
                    System.out.println("Buku tersebut tidak ada di dalam list");
                }
            }
            return list;
        }
    }
    
    //Manajemen Data Petugas Perpus
    static class Petugas_Perpus{
        int id_petugas;
        String nama_petugas,nomor_hp;

        //constructor yang isinya meminta data petugas perpus
        Petugas_Perpus(){
            System.out.print("\nMasukkan ID petugas : ");
            id_petugas = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan nama petugas : ");
            nama_petugas = sc.nextLine();
            System.out.print("Masukkan nomor hp petugas : ");
            nomor_hp = sc.nextLine();
        }
        
        // fungsi untuk tampilkan data petugas perpus
        void tampilkan_data(){
            System.out.println("\nID = " + id_petugas);
            System.out.println("Nama = " + nama_petugas);
            System.out.println("Nomor hp = " + nomor_hp);
        }
        
    }
    
    //Manajemen Data Anggota
    static class Anggota{
        int id_anggota;
        String nama_anggota, jurusan_anggota,jenis_kelamin;
        
        //constructor yang isinya meminta data anggota
        Anggota(){
            System.out.print("\nMasukkan ID anggota : ");
            id_anggota = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan nama anggota : ");
            nama_anggota = sc.nextLine();
            System.out.print("Masukkan jurusan anggota : ");
            jurusan_anggota = sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            jenis_kelamin = sc.nextLine();
        }
        
        // fungsi untuk tampilkan data anggota
        void tampilkan_data(){
            System.out.println("\nID = " + id_anggota);
            System.out.println("Nama = " + nama_anggota);
            System.out.println("Jurusan = " + jurusan_anggota);
            System.out.println("Jenis kelamin = " + jenis_kelamin);
        }
        
        // fungsi untuk menghapus data anggota
        static Anggota[] hapus_anggota(Anggota list[], int id){
            for (int i = 0; i < list.length; i++) {
                if(list[i] != null && list[i].id_anggota == id){
                    list[i] = null;
                    break;
                }
                
                if(i == list.length - 1){
                    System.out.println("Anggota tersebut tidak ada di dalam list");
                }
            }
            return list;
        }
        
        // fungsi untuk cari data anggota
        static void cari_anggota(Anggota list[], int id){
            for (int i = 0; i < list.length; i++) {
                if(list[i] != null && list[i].id_anggota == id){
                    System.out.println("\nAnggota yang Anda cari adalah :");
                    System.out.println("ID = " + list[i].id_anggota);
                    System.out.println("Nama Anggota = " + list[i].nama_anggota);
                    System.out.println("Jurusan Anggota = " + list[i].jurusan_anggota);
                    System.out.println("Jenis Kelamin = " + list[i].jenis_kelamin);
                    break;
                }
                
                if(i == list.length - 1){
                    System.out.println("Anggota tersebut tidak ada di dalam list");
                }
            }
        }
        
        // fungsi untuk update data anggota
        static Anggota[] update_anggota(Anggota list[], int id){
            for (int i = 0; i < list.length; i++) {
                if(list[i] != null && list[i].id_anggota == id){
                    System.out.println("\nMasukkan data update: ");
                    System.out.print("Masukkan ID anggota: ");
                    sc.nextLine();
                    list[i].id_anggota = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama anggota: ");
                    list[i].nama_anggota = sc.nextLine();
                    System.out.print("Masukkan jurusan anggota: ");
                    list[i].jurusan_anggota = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin: ");
                    list[i].jenis_kelamin = sc.nextLine();
                    break;
                }
                
                if(i == list.length - 1){
                    System.out.println("Anggota tersebut tidak ada di dalam list");
                }
            }
            return list;
        }
    }
    
    //Manajemen Data Peminjaman
    static class Peminjaman{
        int kode_buku;
        String npm,nomor_hp,tanggal_peminjaman,tanggal_pengembalian;
        
        //constructor yang isinya meminta data peminjaman
        Peminjaman(){
            System.out.print("\nMasukkan kode buku : ");
            kode_buku = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan npm : ");
            npm = sc.nextLine();
            System.out.print("Masukkan nomor hp : ");
            nomor_hp = sc.nextLine();
            System.out.print("Masukkan tanggal peminjaman (DD-MM-YYYY) : ");
            tanggal_peminjaman = sc.nextLine();
            System.out.print("Masukkan tanggal pengembalian (DD-MM-YYYY) : ");
            tanggal_pengembalian = sc.nextLine();
        }
        
        // fungsi untuk tampilkan data peminjaman
        void tampilkan_data(){
            System.out.println("\nKode Buku = " + kode_buku);
            System.out.println("NPM = " + npm);
            System.out.println("Nomor Hp = " + nomor_hp);
            System.out.println("Tanggal Peminjaman = " + tanggal_peminjaman);
            System.out.println("Tanggal Pengembalian = " + tanggal_pengembalian);
        }
        
        // fungsi untuk menghapus data peminjaman
        static Peminjaman[] hapus_peminjaman(Peminjaman list[], int kode){
            for (int i = 0; i < list.length; i++) {
                if(list[i] != null && list[i].kode_buku == kode){
                    list[i] = null;
                    break;
                }
                
                if(i == list.length - 1){
                    System.out.println("Peminjaman tersebut tidak ada di dalam list");
                }
            }
            return list;
        }
        
        // fungsi untuk cari data peminjaman
        static void cari_peminjaman(Peminjaman list[], int kode){
            for (int i = 0; i < list.length; i++) {
                if(list[i] != null && list[i].kode_buku == kode){
                    System.out.println("\nData peminjaman yang Anda cari adalah :");
                    System.out.println("Kode Buku = " + list[i].kode_buku);
                    System.out.println("NPM = " + list[i].npm);
                    System.out.println("Nomor Hp = " + list[i].nomor_hp);
                    System.out.println("Tanggal Peminjaman = " + list[i].tanggal_peminjaman);
                    System.out.println("Tanggal Pengembalian = " + list[i].tanggal_pengembalian);
                    break;
                }
                
                if(i == list.length - 1){
                    System.out.println("Peminjaman tersebut tidak ada di dalam list");
                }
            }
        }
        
        // fungsi untuk update data peminjaman
        static Peminjaman[] update_peminjaman(Peminjaman list[], int kode){
            for (int i = 0; i < list.length; i++) {
                if(list[i] != null && list[i].kode_buku == kode){
                    System.out.println("\nMasukkan data update: ");
                    System.out.print("Masukkan kode buku: ");
                    sc.nextLine();
                    list[i].kode_buku = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan npm: ");
                    list[i].npm = sc.nextLine();
                    System.out.print("Masukkan nomor hp: ");
                    list[i].nomor_hp = sc.nextLine();
                    System.out.print("Masukkan tanggal peminjaman (DD-MM-YYYY): ");
                    list[i].tanggal_peminjaman = sc.nextLine();
                    System.out.print("Masukkan tanggal pengembalian (DD-MM-YYYY): ");
                    list[i].tanggal_pengembalian = sc.nextLine();
                    break;
                }
                
                if(i == list.length - 1){
                    System.out.println("Peminjaman tersebut tidak ada di dalam list");
                }
            }
            return list;
        }
    }
    
    //Manajemen Data Pengembalian
    static class Pengembalian{
        int kode_buku;
        String npm,tanggal_pengembalian;
        
        //constructor yang isinya meminta data pengembalian
        Pengembalian(){
            System.out.print("\nMasukkan kode buku : ");
            kode_buku = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan npm : ");
            npm = sc.nextLine();
            System.out.print("Masukkan tanggal pengembalian (DD-MM-YYYY) : ");
            tanggal_pengembalian = sc.nextLine();
        }
        
        // fungsi untuk tampilkan data pengembalian
        void tampilkan_data(){
            System.out.println("\nKode Buku = " + kode_buku);
            System.out.println("NPM = " + npm);
            System.out.println("Tanggal Pengembalian = " + tanggal_pengembalian);
        }
        
        // fungsi untuk menghapus data pengembalian
        static Pengembalian[] hapus_pengembalian(Pengembalian list[], int kode){
            for (int i = 0; i < list.length; i++) {
                if(list[i] != null && list[i].kode_buku == kode){
                    list[i] = null;
                    break;
                }
                
                if(i == list.length - 1){
                    System.out.println("Pengembalian tersebut tidak ada di dalam list");
                }
            }
            return list;
        }
        
        // fungsi untuk cari data pengembalian
        static void cari_pengembalian(Pengembalian list[], int kode){
            for (int i = 0; i < list.length; i++) {
                if(list[i] != null && list[i].kode_buku == kode){
                    System.out.println("\nData pengembalian yang Anda cari adalah :");
                    System.out.println("Kode Buku = " + list[i].kode_buku);
                    System.out.println("NPM = " + list[i].npm);
                    System.out.println("Tanggal Pengembalian = " + list[i].tanggal_pengembalian);
                    break;
                }
                
                if(i == list.length - 1){
                    System.out.println("Pengembalian tersebut tidak ada di dalam list");
                }
            }
        }
        
        // fungsi untuk update data pengembalian
        static Pengembalian[] update_pengembalian(Pengembalian list[], int kode){
            for (int i = 0; i < list.length; i++) {
                if(list[i] != null && list[i].kode_buku == kode){
                    System.out.println("\nMasukkan data update: ");
                    System.out.print("Masukkan kode buku: ");
                    sc.nextLine();
                    list[i].kode_buku = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan npm: ");
                    list[i].npm = sc.nextLine();
                    System.out.print("Masukkan tanggal pengembalian (DD-MM-YYYY): ");
                    list[i].tanggal_pengembalian = sc.nextLine();
                    break;
                }
                
                if(i == list.length - 1){
                    System.out.println("Pengembalian tersebut tidak ada di dalam list");
                }
            }
            return list;
        }
    }
        
    public static void main(String[] args) {
        int id_buku,id_anggota,kode_buku; // Deklarasi variabel bertipe data integer
        int index = 0, index1=0, index2=0, index3=0, index4=0; //Inisialisasi variabel=0 bertipe data integer
        
        Buku list_buku[] = new Buku[50]; 
        Petugas_Perpus list_petugas[] = new Petugas_Perpus[50];
        Anggota list_anggota[] = new Anggota[50];
        Peminjaman list_peminjaman[] = new Peminjaman[50];
        Pengembalian list_pengembalian[] = new Pengembalian[50];
        
        menu_utama:
        while(true){
            System.out.println("\n\t\t MENU"); //Tampilan Menu
            System.out.println("[1]. Manajemen Data Buku");
            System.out.println("[2]. Manajemen Data Petugas Perpus");
            System.out.println("[3]. Manajemen Data Anggota");
            System.out.println("[4]. Manajemen Data Peminjaman");
            System.out.println("[5]. Manajemen Data Pengembalian");
            System.out.println("[6]. Keluar");
            System.out.println("\n>> ");
            int pilihan=sc.nextInt();  //Inputan pilihan dari menu
            switch(pilihan){
                case 1:
                    menu_manajemendatabuku: //label 
                    while(true){
                        System.out.println("\n\t\t MENU MANAJEMEN DATA BUKU");
                        System.out.println("1. Input buku");
                        System.out.println("2. Tampilkan buku");
                        System.out.println("3. Cari buku");
                        System.out.println("4. Update buku");
                        System.out.println("5. Hapus buku");
                        System.out.println("6. Kembali ke MENU");
                        System.out.println("\n>> ");
                        int pilih=sc.nextInt(); 
                        switch(pilih){
                            case 1:
                                list_buku[index] = new Buku();
                                index++;
                                break;
                            case 2:
                                for (int i = 0; i < list_buku.length; i++) {
                                    if (list_buku[i] != null) {
                                        list_buku[i].tampilkan_data();
                                    }

                                    if(i == list_buku.length - 1){
                                        System.out.println("\nSemua data sudah ditampilkan");
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.print("Masukkan ID buku yang ingin dicari: ");
                                id_buku = sc.nextInt(); 
                                Buku.cari_buku(list_buku, id_buku); 
                                break;
                            case 4:
                                System.out.print("Masukkan ID buku yang ingin diubah: ");
                                id_buku = sc.nextInt();
                                list_buku = Buku.update_buku(list_buku, id_buku); 
                                break;
                            case 5:
                                System.out.print("Masukkan ID buku yang ingin dihapus: ");
                                id_buku = sc.nextInt();
                                list_buku = Buku.hapus_buku(list_buku, id_buku);
                                break; 
                            case 6:
                                continue menu_utama;
                        }
                        continue menu_manajemendatabuku;
                    }
                    
                case 2:
                    menu_manajemendatapetugasperpus:
                    while(true){
                        System.out.println("\n\t\t MENU MANAJEMEN DATA PETUGAS PERPUS");
                        System.out.println("1. Input data petugas perpus");
                        System.out.println("2. Tampilkan data petugas perpus");
                        System.out.println("3. Kembali ke MENU");
                        System.out.println("\n>> ");
                        int pilih=sc.nextInt(); 
                        switch(pilih){
                            case 1:
                                list_petugas[index1] = new Petugas_Perpus();
                                index1++;
                                break;
                            case 2:
                                for (int i = 0; i < list_petugas.length; i++) {
                                    if (list_petugas[i] != null) {
                                        list_petugas[i].tampilkan_data();
                                    }

                                    if(i == list_petugas.length - 1){
                                        System.out.println("\nSemua data sudah ditampilkan");
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                continue menu_utama;
                        }
                        continue menu_manajemendatapetugasperpus;
                    }  
                
                case 3:
                    menu_manajemendataanggota:
                    while(true){
                        System.out.println("\n\t\t MENU MANAJEMEN DATA ANGGOTA");
                        System.out.println("1. Input data anggota");
                        System.out.println("2. Tampilkan data anggota");
                        System.out.println("3. Cari data anggota");
                        System.out.println("4. Update data anggota");
                        System.out.println("5. Hapus data anggota");
                        System.out.println("6. Kembali ke MENU");
                        System.out.println("\n>> ");
                        int pilih=sc.nextInt(); 
                        switch(pilih){
                            case 1:
                                list_anggota[index2] = new Anggota();
                                index2++;
                                break;
                            case 2:
                                for (int i = 0; i < list_anggota.length; i++) {
                                    if (list_anggota[i] != null) {
                                        list_anggota[i].tampilkan_data();
                                    }

                                    if(i == list_anggota.length - 1){
                                        System.out.println("\nSemua data sudah ditampilkan");
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.print("Masukkan ID anggota yang ingin dicari: ");
                                id_anggota = sc.nextInt();
                                Anggota.cari_anggota(list_anggota, id_anggota);
                                break;
                            case 4:
                                System.out.print("Masukkan ID anggota yang ingin diubah: ");
                                id_anggota = sc.nextInt();
                                list_anggota = Anggota.update_anggota(list_anggota, id_anggota);
                                break;
                            case 5:
                                System.out.print("Masukkan ID anggota yang ingin dihapus: ");
                                id_anggota = sc.nextInt();
                                list_anggota = Anggota.hapus_anggota(list_anggota, id_anggota);
                                break; 
                            case 6:
                                continue menu_utama;
                        }
                        continue menu_manajemendataanggota;    
                    }
                
                case 4:
                    menu_manajemendatapeminjaman:
                    while(true){
                        System.out.println("\n\t\t MENU MANAJEMEN DATA PEMINJAMAN");
                        System.out.println("1. Input data peminjaman");
                        System.out.println("2. Tampilkan data peminjaman");
                        System.out.println("3. Cari data peminjaman");
                        System.out.println("4. Update data peminjaman");
                        System.out.println("5. Hapus data peminjaman");
                        System.out.println("6. Kembali ke MENU");
                        System.out.println("\n>> ");
                        int pilih=sc.nextInt(); 
                        switch(pilih){
                            case 1:
                                list_peminjaman[index3] = new Peminjaman();
                                index3++;
                                break;
                            case 2:
                                for (int i = 0; i < list_peminjaman.length; i++) {
                                    if (list_peminjaman[i] != null) {
                                        list_peminjaman[i].tampilkan_data();
                                    }

                                    if(i == list_peminjaman.length - 1){
                                        System.out.println("\nSemua data sudah ditampilkan");
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.print("Masukkan kode buku yang ingin dicari: ");
                                kode_buku = sc.nextInt();
                                Peminjaman.cari_peminjaman(list_peminjaman, kode_buku);
                                break;
                            case 4:
                                System.out.print("Masukkan kode buku yang ingin diubah: ");
                                kode_buku = sc.nextInt();
                                list_peminjaman = Peminjaman.update_peminjaman(list_peminjaman, kode_buku);
                                break;
                            case 5:
                                System.out.print("Masukkan kode buku yang ingin dihapus: ");
                                kode_buku = sc.nextInt();
                                list_peminjaman = Peminjaman.hapus_peminjaman(list_peminjaman, kode_buku);
                                break; 
                            case 6:
                                continue menu_utama;
                        }
                        continue menu_manajemendatapeminjaman;    
                    }
                    
                case 5:
                    menu_manajemendatapengembalian:
                    while(true){
                        System.out.println("\n\t\t MENU MANAJEMEN DATA PENGEMBALIAN");
                        System.out.println("1. Input data pengembalian");
                        System.out.println("2. Tampilkan data pengembalian");
                        System.out.println("3. Cari data pengembalian");
                        System.out.println("4. Update data pengembalian");
                        System.out.println("5. Hapus data pengembalian");
                        System.out.println("6. Kembali ke MENU");
                        System.out.println("\n>> ");
                        int pilih=sc.nextInt(); 
                        switch(pilih){
                            case 1:
                                list_pengembalian [index4] = new Pengembalian();
                                index4++;
                                break;
                            case 2:
                                for (int i = 0; i < list_pengembalian.length; i++) {
                                    if (list_pengembalian[i] != null) {
                                        list_pengembalian[i].tampilkan_data();
                                    }

                                    if(i == list_pengembalian.length - 1){
                                        System.out.println("\nSemua data sudah ditampilkan");
                                        break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.print("Masukkan kode buku yang ingin dicari: ");
                                kode_buku = sc.nextInt();
                                Pengembalian.cari_pengembalian(list_pengembalian, kode_buku);
                                break;
                            case 4:
                                System.out.print("Masukkan kode buku yang ingin diubah: ");
                                kode_buku = sc.nextInt();
                                list_pengembalian = Pengembalian.update_pengembalian(list_pengembalian, kode_buku);
                                break;
                            case 5:
                                System.out.print("Masukkan kode buku yang ingin dihapus: ");
                                kode_buku = sc.nextInt();
                                list_pengembalian = Pengembalian.hapus_pengembalian(list_pengembalian, kode_buku);
                                break; 
                            case 6:
                                continue menu_utama;
                        }
                        continue menu_manajemendatapengembalian;    
                    }
                    
                case 6:
                    break menu_utama;  
        }
               
    }
    
}
}
