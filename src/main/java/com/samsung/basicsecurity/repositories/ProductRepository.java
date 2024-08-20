package com.samsung.basicsecurity.repositories;

import com.samsung.basicsecurity.repositories.models.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    public List<Product> getDummyProducts()
    {
        List<Product> lstProduct= new ArrayList<>();
        /*lstProduct.add(
                Product.builder()
                        .id(7l)
                        .name("s11")
                        .picture("https://images.samsung.com/is/image/samsung/assets/vn/home/2024/S24_Ultra_Ex_PC.jpg?$330_330_JPG$")
                        .price(821000).build());

        lstProduct.add(
                Product.builder()
                        .id(22l)
                        .name("galaxy A13")
                        .picture("https://images.samsung.com/is/image/samsung/assets/vn/home/2024/S24_Series_PC1.jpg?$330_330_JPG$")
                        .price(1423770).build());

        lstProduct.add(
                Product.builder()
                        .id(32l)
                        .name("G56")
                        .picture("https://images-na.ssl-images-amazon.com/images/I/61O30g0cZmL._SR200,200_.jpg")
                        .price(2352000).build());

       */ lstProduct.add(
                Product.builder()
                        .id(43l)
                        .name("G80")
                        .picture("https://images.samsung.com/is/image/samsung/assets/vn/2407/pcd/smp/PCD_E3_Whats-new_160x160_pc.png?$160_160_PNG$")
                        .price(2171000).build());

        lstProduct.add(
                Product.builder()
                        .id(44l)
                        .name("Utra 10")
                        .picture("https://images.samsung.com/is/image/samsung/assets/vn/2407/pcd/smp/PCD_E3_Whats-new_160x160_pc.png?$160_160_PNG$")
                        .price(2171000).build());
      //  https://images.samsung.com/is/image/samsung/assets/vn/2407/pcd/smp/PCD_E3_Whats-new_160x160_pc.png?$160_160_PNG$
        lstProduct.add(
                Product.builder()
                        .id(47l)
                        .name("Utra 24")
                        .picture("https://images.samsung.com/is/image/samsung/assets/vn/2407/pcd/smp/PCD_E3_Whats-new_160x160_pc.png?$160_160_PNG$")
                        .price(2171000).build());

        lstProduct.add(
                Product.builder()
                        .id(48l)
                        .name("Galaxy r")
                        .picture("https://images.samsung.com/is/image/samsung/assets/vn/2407/pcd/smp/PCD_E3_Whats-new_160x160_pc.png?$160_160_PNG$")
                        .price(2171000).build());

        lstProduct.add(
                Product.builder()
                        .id(49l)
                        .name("S70")
                        .picture("https://images.samsung.com/is/image/samsung/assets/vn/2407/pcd/smp/PCD_E3_Whats-new_160x160_pc.png?$160_160_PNG$")
                        .price(2171000).build());

        lstProduct.add(
                Product.builder()
                        .id(40l)
                        .name("S78")
                        .picture("https://images.samsung.com/is/image/samsung/assets/vn/2407/pcd/smp/PCD_E3_Whats-new_160x160_pc.png?$160_160_PNG$")
                        .price(2171000).build());

        lstProduct.add(
                Product.builder()
                        .id(433l)
                        .name("A20")
                        .picture("https://images.samsung.com/is/image/samsung/assets/vn/2407/pcd/smp/PCD_E3_Whats-new_160x160_pc.png?$160_160_PNG$")
                        .price(2171000).build());

        lstProduct.add(
                Product.builder()
                        .id(44l)
                        .name("G7")
                        .picture("https://images.samsung.com/is/image/samsung/assets/vn/2407/pcd/smp/PCD_E3_Whats-new_160x160_pc.png?$160_160_PNG$")
                        .price(2171000).build());

        return lstProduct;
    }

    public Product getProductById(Long id)
    {
        List<Product> lstProducts = this.getDummyProducts();
        return lstProducts.stream().filter(p->p.getId() == id).findFirst().get();
    }
}
