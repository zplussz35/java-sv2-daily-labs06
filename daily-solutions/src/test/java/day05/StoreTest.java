package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    Store store = new Store();
    @BeforeEach
    void init(){
        store.addProduct(new Product("alma", Type.FOOD, 200));
        store.addProduct(new Product("kalács", Type.FOOD, 300));
    }


    @Test
    void testProductCountByType() {
        List<ProductWithPiece> result = store.productCountByType();

        assertEquals(1,result.size());
        assertEquals(Type.FOOD,result.get(0).getType());
        assertEquals(2,result.get(0).getCount());
    }
}