package JUnit;

import vinnsla.Hotel;
import vinnsla.PackageController;
import vinnsla.HotelGroupMock;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

public class PackageControllerTest {


	@Test
	public void searchByQualityTest() {
		
		PackageController Junit = new PackageController();
		
		
		ArrayList<Hotel> result = new ArrayList<Hotel>();
		
		result = Junit.searchByQuality(4);
		
		assertEquals(result,Junit.hotels);
	
	}
	
}
