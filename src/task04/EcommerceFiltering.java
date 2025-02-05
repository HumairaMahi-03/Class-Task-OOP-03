package task04;
import java.util.Scanner;
class ProductFilter {

    // Filter by category
    void filterProducts(String category) {
        System.out.println("Filtering products in category: " + category);
    }

    // Filter by price range
    void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Filtering products in price range: $" + minPrice + " - $" + maxPrice);
    }

    // Filter by brand
    void filterProductsByBrand(String brand) {
        System.out.println("Filtering products by brand: " + brand);
    }

    // Filter by category and price range
    void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Filtering products in category: " + category + " with price range $" + minPrice + " - $" + maxPrice);
    }

    // Filter by category, price range, and brand
    void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Filtering products in category: " + category + ", brand: " + brand + ", with price range $" + minPrice + " - $" + maxPrice);
    }
}

public class EcommerceFiltering {
    public static void main(String[] args) {
        ProductFilter filter = new ProductFilter();
        Scanner sc =new Scanner(System.in);
        String catagory = sc.nextLine();
        Double minPrice = sc.nextDouble();
        Double maxPrice = sc.nextDouble();
        sc.nextLine();
        String brand = sc.nextLine();
        filter.filterProducts(catagory);
        filter.filterProducts(minPrice,maxPrice);
        filter.filterProductsByBrand(brand);
        filter.filterProducts(catagory, minPrice, maxPrice);
        sc.close();
    }
}
