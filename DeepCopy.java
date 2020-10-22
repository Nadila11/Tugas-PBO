public class DeepCopy {
    public static void main(String[] args) {
        DeepCopy n = new DeepCopy();
        n.Deepcopy_productCategories();

    }
    public void Deepcopy_productCategories() {
        Product product = new Product("224","250.0000","30%","Uniqlo");
        Categories Baju = new Categories("blouse", "atasan");
        Categories DeepCopy = (Categories) SerializationUtils.clone(Baju);

        Categories Baju2 = new Categories(
                Baju.getJenisBarang(), Baju.getModelBarang());
        Product Baju3 = new Product(
                product.getCodeBarang(),product.getHargaBarang(),product.getMerkBarang(),product.getDiscountBarang());
        Baju.setModelBarang("busana");

        System.out.println(Baju);
        System.out.println(DeepCopy);
        System.out.println(Baju2);
        System.out.println(Baju3);
    }
}
