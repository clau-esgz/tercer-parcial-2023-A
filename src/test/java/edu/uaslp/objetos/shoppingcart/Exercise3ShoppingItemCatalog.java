package edu.uaslp.objetos.shoppingcart;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise3ShoppingItemCatalog {


    @Test
    public void givenAValidCode_whenGetItem_thenShoppingItemIsReturned(){
        //Given
        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();
        //When
        ShoppingItem item = shoppingItemCatalog.getItem("ABC2000");
        //Then
        Assertions.assertNotNull(item);
        assertThat(item).isNotNull();
    }

    @Test
    public void givenANotValidCode_whenGetItem_thenNullIsReturned(){
//Given
        ShoppingItemCatalog shoppingItemCatalog = new ShoppingItemCatalog();
        //When
        ShoppingItem item = shoppingItemCatalog.getItem("inexistente");
        //Then
        Assertions.assertNull(item);
        assertThat(item).isNull();
    }
}