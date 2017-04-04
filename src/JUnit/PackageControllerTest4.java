package JUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import vinnsla.Hotel;
import vinnsla.PackageController;

public class PackageControllerTest4 {

	@Test
	public void searchBySizeTest() {
		
		PackageController Junit = new PackageController();
		
		ArrayList<Hotel> result = new ArrayList<Hotel>();
		
		result = Junit.searchBySize(4);
		
		assertEquals(result,Junit.hotels);
	}

}
