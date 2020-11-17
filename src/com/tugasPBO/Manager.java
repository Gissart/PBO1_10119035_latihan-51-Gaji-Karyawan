package com.tugasPBO;

public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran =  kehadiran * 10000;
        return tunjanganKehadiran;
    }

    public float tunjanganJabatan(String jabatan){
        if(jabatan.equals("manajer")){
            tunjanganJabatan = 2000000;
        }else if(jabatan.equals("kabag")){
            tunjanganJabatan = 1000000;
        }else{
            tunjanganJabatan =  0;
        }
        return tunjanganJabatan;
    }

    public float tunjanganGolongan(int golongan){
        switch(golongan){
            case 1: tunjanganGolongan = 500000;
                    break;
            case 2: tunjanganGolongan = 1000000;
                    break;
            case 3: tunjanganGolongan =1500000;
                    break;
            default: tunjanganGolongan = 0;
        }
        return tunjanganGolongan;
    }

    public float gajiTotal(){
        return tunjanganKehadiran + tunjanganJabatan + tunjanganGolongan;
    }

}
