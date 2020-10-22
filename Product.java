public class Product {
    public String CodeBarang;
    public String HargaBarang;
    public String DiscountBarang;
    public String MerkBarang;

    public Product(String codeBarang, String hargaBarang, String discountBarang, String merkBarang) {
        CodeBarang = codeBarang;
        HargaBarang = hargaBarang;
        DiscountBarang = discountBarang;
        MerkBarang = merkBarang;
    }

    public String getCodeBarang() {
        return CodeBarang;
    }

    public void setCodeBarang(String codeBarang) {
        CodeBarang = codeBarang;
    }

    public String getHargaBarang() {
        return HargaBarang;
    }

    public void setHargaBarang(String hargaBarang) {
        HargaBarang = hargaBarang;
    }

    public String getDiscountBarang() {
        return DiscountBarang;
    }

    public void setDiscountBarang(String discountBarang) {
        DiscountBarang = discountBarang;
    }

    public String getMerkBarang() {
        return MerkBarang;
    }

    public void setMerkBarang(String merkBarang) {
        MerkBarang = merkBarang;
    }
}

