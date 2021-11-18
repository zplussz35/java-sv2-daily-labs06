package cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {



    @Test
    void testCreateCar(){
        Car car = new Car("Toyota",12.5,Color.RED,2_000_000);

        assertEquals("Toyota",car.getBrand());
        assertEquals(12.5,car.getEngineSize());
        assertEquals(Color.RED,car.getColor());
        assertEquals(2_000_000,car.getPrice());
    }

    @Test
    void testDecreasePrice(){
        Car car = new Car("Toyota",12.5,Color.RED,2_000_000);
        car.decreasePrice(10);
        assertEquals(1_800_000,car.getPrice());

    }

    @Test
    void testDecreasePriceWithWrongPercent(){
        Car car = new Car("Toyota",12.5,Color.RED,2_000_000);
        car.decreasePrice(-10);
        assertEquals(2_000_000,car.getPrice());

        car.decreasePrice(100);
        assertEquals(2_000_000,car.getPrice());
    }

}