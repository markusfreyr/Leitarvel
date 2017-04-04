package JUnit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import vinnsla.Hotel;
import vinnsla.PackageController;

public class PackageControllerTest2 {

		@Test
		public void searchByPriceRangeTest(){
			
			PackageController Junit = new PackageController();
			
			ArrayList<Hotel> result = new ArrayList<Hotel>();
			
			
			result = Junit.searchByPriceRange(2000, 10000);
			
			assertEquals(result,Junit.hotels);
			
			
		}

}
