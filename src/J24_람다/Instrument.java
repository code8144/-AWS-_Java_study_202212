package J24_람다;

public interface Instrument {
	
	public String play(String instrument);
	
	public default void testPrint() {
		System.out.println("테스트");
	}

}
