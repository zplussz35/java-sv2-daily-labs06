/*package cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {
    CarShop c = new CarShop("BestCars",100_000_000);

    @BeforeEach
    void init(){
        c.addCar(new Car("Toyota", 12.5, Color.RED, 10_000_000));
        c.addCar(new Car("Toyota", 12.5, Color.RED, 20_000_000));
        c.addCar(new Car("Toyota", 12.5, Color.RED, 30_000_000));
    }

    @Test
    void testCreateCarShop(){
        assertEquals("BestCars",c.getName());
        assertEquals(100_000_000,c.getMaxPrice());
        assertEquals(3,c.getCarsForSell().size());
    }

    @Test
    void testAddCarWithValidPrice(){
        boolean result=c.addCar(new Car("Toyota",12.5,Color.RED,2_000_000));
        assertTrue(result);
        assertEquals(4,c.getCarsForSell().size());
        assertEquals("Toyota",c.getCarsForSell().get(0).getBrand());
    }

    @Test
    void testAddCarWithInvalidPrice(){
        boolean result=c.addCar(new Car("Toyota",12.5,Color.RED,102_000_000));
        assertFalse(result);
        assertEquals(3,c.getCarsForSell().size());
    }

    @Test
    void testSumPriceOfCars(){
        assertEquals(60_000_000,c.sumCarPrice());
    }

    @Test
    void testNumberOfCarsCheaperThan() {
        assertEquals(3,c.numberOfCarsCheaperThan(60_000_000));

        }

    }*/