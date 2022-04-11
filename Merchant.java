package com.company;

public class Merchant {
    private String namaMerchant;
    private String namaProduk;
    private double hargaMakanan;

    /**
     * @param namaMerchant
     * @param namaProduk
     * @param hargaMakanan
     */
    public Merchant(String namaMerchant, String namaProduk, double hargaMakanan) {
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }

    /**
     * @return the namaMerchant
     */
    public String getNamaMerchant() {
        return namaMerchant;
    }

    /**
     * @param namaMerchant the namaMerchant to set
     */
    public void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    /**
     * @return the namaProduk
     */
    public String getNamaProduk() {
        return namaProduk;
    }

    /**
     * @param namaProduk the namaProduk to set
     */
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    /**
     * @return the hargaMakanan
     */
    public double getHargaMakanan() {
        return hargaMakanan;
    }

    /**
     * @param hargaMakanan the hargaMakanan to set
     */
    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

}