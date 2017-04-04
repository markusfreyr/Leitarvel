package JUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import vinnsla.Hotel;
import vinnsla.PackageController;

public class PackageControllerTest3 {

	@Test
	public void searchByLocationTest() {
		
		PackageController Junit = new PackageController();
		
		ArrayList<Hotel> result = new ArrayList<Hotel>();
		
		result = Junit.searchByLocation("Reykjavík");
		
		assertEquals(result,Junit.hotels);
		
	}

}
