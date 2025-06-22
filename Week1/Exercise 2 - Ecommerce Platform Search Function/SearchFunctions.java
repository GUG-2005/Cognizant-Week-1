import java.util.*;
import java.io.*;

class Product 
{
  int productId;
  String productName;
  String catrgory;

  Product (int productId, String productName, String catrgory)
  {
    this.productId = productId;
    this.productName = productName;
    this.catrgory = catrgory;
  }
}

class Search
{
  public static Product LinearSearchFun (Product [] products, int targetId)
  {
    for (Product product : products) {
      if (product.productId == targetId){
        return product;
      }
    }
    return null;
  }

  public static Product BinarySearchFun (Product [] products, int targetId)
  {
    Arrays.sort(products, Comparator.comparingInt(p->p.productId));

    int l=0, r=products.length - 1;
    while (l <= r)
    {
      int mid = (l+r)/2;
      if (products[mid].productId == targetId){
        return products[mid];
      } else if (products[mid].productId < targetId) {
        l = mid +1;
      } else {
        r = mid -1;
      }
    }
    return null;
  }
}

public class SearchFunctions
{
  public static void main (String [] args)
  {
    Product [] products = {
      new Product (103, "Shoes", "Fashion"),
      new Product (102, "Laptop", "Technology"),
      new Product (105, "Chair", "Furnitue"),
      new Product (101, "Travel Bag", "Travel")
    };

    int targetId = 104;

    Product product1 = Search.LinearSearchFun(products, targetId);
    if (product1 != null)
    {
      System.out.println("Item Found through Linear Search: "+ product1.productName);
    }
    else
    {
      System.out.println("Not found through Linear Search");
    }

    Product product2 = Search.BinarySearchFun(products, targetId);
    {
      if (product2 != null)
      {
        System.out.println("Item Found through Binary Search: "+ product1.productName);
      }
      else
      {
        System.out.println("Not found through Binary Search");
      }
    }
  }
}