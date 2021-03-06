package com.dao;

import java.util.List;
import java.util.Optional;

import com.entity.Product;
import com.entity.Shop;

import org.javatuples.Pair;

public interface ShopDao extends AutoCloseable {
  public Optional<Long> insert(Shop shop);

  public Optional<Long> havingCheapestProduct(Product product);

  public List<Pair<Integer, Product>> shopsHavingAnyOfTheseProducts(
      List<Product> products);

  public Optional<Shop> findById(Long id);

  public Optional<String> insertProduct(Shop shop, Product product);

  public Optional<String> updateProduct(Shop shop, Product product,
      Boolean newPrice);

  public List<Product> fetchProducts(Shop shop);

  public Optional<Product> fetchProduct(Shop shop, Product product);
}