package edu.uaslp.objetos.shoppingcart;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    List<ShoppingItem> items = new LinkedList<>();
    private final ShoppingItemCatalog ShoppingItemCatalog;


    public ShoppingCart(ShoppingItemCatalog shoppingItemCatalog) {
        this.ShoppingItemCatalog = shoppingItemCatalog;
    }

    public void add(String code) {
        items.add(ShoppingItemCatalog.getItem(code));
    }

    public int getTotalCostInCents() {
        int totalCost = 0;
        for(ShoppingItem item: items){
            totalCost += item.getUnitCostInCents();
        }
        return totalCost;
    }




    public int getDistinctItemsCount() {
        Collection<ShoppingItem> distinctItems = getDistinctItems();

        return distinctItems.size();
    }
    private boolean itemIsPresent(ShoppingItem itemToFind, Collection<ShoppingItem> distinctItems){
        for(ShoppingItem item : distinctItems){
            if(itemToFind.getCode().equals(item.getCode())){
                return true;
            }
        }
        return false;
    }

    public int getTotalItemsCount() {
        return items.size();
    }

    public List<ShoppingItem> getItems() {
        return items;
    }

    public Collection<ShoppingItem> getDistinctItems() {
        Collection<ShoppingItem> distinctItems = new LinkedList<>();
        for (ShoppingItem item: items){
            if (!itemIsPresent(item,distinctItems)){
                distinctItems.add(item);
            }

        }
        return distinctItems;
    }

}