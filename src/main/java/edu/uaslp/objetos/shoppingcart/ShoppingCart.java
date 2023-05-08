package edu.uaslp.objetos.shoppingcart;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    private ShoppingItemCatalog ShoppingItemCatalog;
    private LinkedList<ShoppingItem> itemList;
    private int TotalCostInCents;
    private int DistinctItemsCount;
    private int TotalItemsCount;
    public int getTotalCostInCents() {
        return TotalCostInCents;
    }

    public ShoppingCart(ShoppingItemCatalog shoppingItemCatalog) {
        this.ShoppingItemCatalog = shoppingItemCatalog;
        itemList = new LinkedList<>();
        TotalCostInCents = 0;
        DistinctItemsCount = 0;
        TotalItemsCount = 0;
    }

    public void add(String code) {
        ShoppingItem item = ShoppingItemCatalog.getItem(code);
        itemList.add(item);
        TotalCostInCents += item.getUnitCostInCents();
        TotalItemsCount++;
        DistinctItemsCount++;
    }

    public int getDistinctItemsCount() {
        return DistinctItemsCount;
    }

    public int getTotalItemsCount() {
        return TotalItemsCount;
    }

    public List<ShoppingItem> getItems() {
        return itemList;
    }

    public Collection<ShoppingItem> getDistinctItems() {
        return null;
    }


}