package J20_JSON.builder;

public class UserMain {
	
	public static void main(String[] args) {
//		User user = new User();
		User.UserBuilder userBuilder = new User.UserBuilder();
		
		User user2 = User.builder()
				.username("aaa")
				.password("1234")
				.name("김상현")
				.email("aaa@gmail.com")
				.build();
		
		System.out.println(user2);
	}

}
