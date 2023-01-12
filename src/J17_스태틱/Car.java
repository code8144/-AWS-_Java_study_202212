package J17_스태틱;

import java.time.LocalDateTime;

public class Car {
	
	private static final int NOW_YEAR = LocalDateTime.now().getYear();
	
	private static final String CODE = "KIA-" + NOW_YEAR + "-";
	private static int ai = 1;
	
	
//	private final static String CODE = "KIA-2023-";
//	private static int ai = 1;
	
	public Car(String modelName) {
		serialCode = CODE + String.format("%04d", ai);
		this.modelName = modelName;
		ai++;
	}
	
	private String serialCode;	//KIA-2023-0000
	private String modelName;	//K9
	
//	public Car(String modelName) {
//		serialCode = CODE + ai;
//		ai++;
//		this.modelName = modelName;
//	}
	
	public static int getAutoIncrement() {
		System.out.println("현재 넘버 : " + ai);
		return ai;
	}

	@Override
	public String toString() {
		return "Car [serialCode=" + serialCode + ", modelName=" + modelName + "]";
	}
	
	
	

}
