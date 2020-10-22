public class DCInterface {
    public static void main(String args[]) {
        DCInterface main = new DCInterface();
        main.testCase();
    }
    public void testCase() {
        Product product = new Product("122", "200.000", "50%", "H&M");
        Categories Baju = new Categories("bluose, kemeja, sweater", " busana, trend, baju hangat");
        Categories Aku = new Categories(Baju.getJenisBarang(),Baju.getModelBarang());

        System.out.println(Aku);
        System.out.println(Baju);
    }
}
