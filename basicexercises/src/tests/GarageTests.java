package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import garage.Car;
import garage.Garage;
import garage.Vehicle;

class GarageTests {

	Garage a;
	
	@BeforeEach
	void setup() {
		a = new Garage(); // rather than writing new garage every time, this will create new Garage at each method
	}
	
	@Test
	void testAddVehicle() {
		Vehicle Audi = new Car(123, true, 2000, 4, true, 5, "Audi", 2017);
		a.addVehicle(Audi);
		assertEquals(1, a.getVehicleListType().size());
	}

	@Test
	void testCalculateBill() {
		Vehicle Audi = new Car(123, true, 2000, 4, true, 5, "Audi", 2017);
		a.addVehicle(Audi);
		assertEquals("Bill is £2000", a.calculateBill());
	}

	@Test
	void testRemoveVehicle() {
		Vehicle Audi = new Car(224, true, 2000, 4, true, 5, "Audi", 2017);
		a.addVehicle(Audi);
		a.removeVehicle(Audi, 224);
		assertEquals(0, a.getVehicleListType().size());
	}

	@Test
	void testGetVehicleListType() {
		Vehicle Audi = new Car(224, true, 2000, 4, true, 5, "Audi", 2017);
		a.addVehicle(Audi);
		// Arrays.asList turns array into ArrayList by passing it in the constructor, it's casts the array into an ArrayList
		ArrayList<Vehicle> correct = new ArrayList<>(Arrays.asList(Audi));
		assertEquals(correct, a.getVehicleListType());
	}

}
