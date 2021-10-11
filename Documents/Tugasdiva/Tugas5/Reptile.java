class SailfinDragon {
    public String Amboniesis;
    public String Weberi;

    void Jenis(){
        System.out.println("Program ini menyebutkan Jenis-jenis Salfin Dragon dan Ciri-cirinya");
        System.out.println("\nCiri dari Salfin Dragon Amboniesis");
        System.out.println("=============================================");
        System.out.println("\nCiri-ciri Salfin Dragon Amboniesis Jantan :");
        System.out.println("1. Warna Lebih dominan hitam pekat"+"\n2. Memiliki Layar pada Ekor dengan ukuran lebar"+"\n3.Memiliki tanduk di bagian kepala");
        System.out.println("\nCiri-ciri Salfin Dragon Amboniesis Betina :");
        System.out.println("1. Warnanya pucat"+"\n2. Layar pada ekor pendek"+"\n3. memiliki tanduk namun tidak sebesar jantan");
        System.out.println("\nCiri dari Salfin Dragon Amboniesis Weberi");
        System.out.println("============================================");
        System.out.println("\nCiri-ciri Salfin Dragon Weberi Jantan :");
        System.out.println("1. Memiliki warna hijau dengan bintik kuning"+"\n2. panjang bisa sampai 1 meter"+"\n3. memiliki layar ekor pendek");
        System.out.println("\nCiri-ciri Salfin Dragon Weberi Betina :");
        System.out.println("1. Warna tubuh tak sepekat jantan"+"\n2. Layar pada ekor pendek"+"\n3. Panjang tidak sampai 1 meter");
    }
}

class Ekor {
    public String ekor;

    public String getEkor(){
        return ekor;
    }
    public void setEkor(String newEkor){
        this.ekor = newEkor;
    }
}

class Layar {
    public String layar;

    public String getLayar(){
        return layar;
    }
    public void setLayar(String newLayar){
        this.layar = newLayar;
    }
}

class Tanduk {
    public String tanduk;

    public String getTanduk(){
        return tanduk;
    }
    public void setTanduk(String newTanduk){
        this.tanduk = newTanduk;
    }
}

class Reptile {
    public static void main (String[] args){
        SailfinDragon mySailfinDragon = new SailfinDragon();
        mySailfinDragon.Jenis();
    }
}