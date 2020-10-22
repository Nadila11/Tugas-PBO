public class Categories {
    public String JenisBarang;
    public String ModelBarang;

    public Categories(String jenisBarang, String modelBarang) {
        this.JenisBarang = jenisBarang;
        this.ModelBarang= modelBarang;
    }

    public String getJenisBarang() {
        return JenisBarang;
    }

    public String getModelBarang() {
        return ModelBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        JenisBarang = jenisBarang;
    }

    public void setModelBarang(String modelBarang) {
        ModelBarang = modelBarang;
    }
}
