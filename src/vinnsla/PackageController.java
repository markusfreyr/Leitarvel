package vinnsla;

import database.Database;
import vinnsla.Package;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class PackageController {
	
	private Database  gogn;
	
	private Date date;

	public PackageController(){
		
		Database gogn = new Database();
	}
	
	public List<Package> search(){
		
		gogn.getData1();
		
		List<Package> pakkar = new ArrayList<Package>();
		
		return pakkar;		
		
	}
	
	public List<Package> searchByQuality(int i){
		
		List<Package> pakkar = new ArrayList<Package>();
		
		return pakkar;
	}
	
	public List<Package> searchByDate(Date a, Date b){
		
		List<Package> pakkar = new ArrayList<Package>();
		
		return pakkar;
	}

	public List<Package> searchBySize(int i, int k){
		
		List<Package> pakkar = new ArrayList<Package>();
		
		return pakkar;
	}
	
	public List<Package> searchByLocation(String s){
		
		List<Package> pakkar = new ArrayList<Package>();
		
		return pakkar;
	}
	
	public List<Package> searchByprice(int low, int high){
		
		List<Package> pakkar = new ArrayList<Package>();
		
		return pakkar;
	}
	
	public List<Package> searchByAge(int low, int high){
		
		List<Package> pakkar = new ArrayList<Package>();
		
		return pakkar;
	}
	
		
}
