package car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CarFactory {
     @Autowired
     @Qualifier("bmw")
     public Car car;
     
     public String toString() {
    	 return car.carName();
     }
}
