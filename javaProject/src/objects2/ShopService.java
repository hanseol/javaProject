package objects2;

public class ShopService {

	static ShopService shopservice = new ShopService();
	
	public static ShopService getInstance(){
		return shopservice;
	}
}
