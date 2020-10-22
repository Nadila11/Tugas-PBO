public class Main {
    public static void main(String[] args){
        Main main1 = new Main();
        main1.Swallowing_productCategories();
    }
    public void Swallowing_productCategories(){
        Product product = new Product("122", "200.000", "50%", "H&M");
        Categories Baju = new Categories("bluose, kemeja, sweater", " busana, trend, baju hangat");
        Categories Aku = new Categories(Baju.getJenisBarang(),Baju.getModelBarang());

        System.out.println(Aku);
        System.out.println(Baju);




    }
}
