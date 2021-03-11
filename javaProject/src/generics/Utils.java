package generics;

public class Utils {
	public <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setBox(t);
		return null;
	}
	
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getkey().equals(p2.getkey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue(); //doubleValue는 Number클래스에 정의되어 있음.
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
	}
}
