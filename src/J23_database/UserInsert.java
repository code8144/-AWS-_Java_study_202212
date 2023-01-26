package J23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import usermanagement.entity.User;

public class UserInsert {
	
	private DBConnectionMgr pool;
	
	public UserInsert() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public int saveUser(User user) {
		int successCount = 0;
		
		String sql = null;
		Connection con = null;	// DB에 연결
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection();
			
			sql = "insert into user_mst\r\n"
					+ "values (0, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getEmail());
			
			successCount = pstmt.executeUpdate();	// insert, update, delete 명령 실행
			
			rs = pstmt.getGeneratedKeys();
			
			if(rs.next()) {
				System.out.println("이번에 만들어진 user_id Key값 : " + rs.getInt(1));
				user.setUserId(rs.getInt(1));
			}
			
			System.out.println("쿼리 실행 성공 : " + successCount + "건");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
	
		
		return successCount;
		
}
	
	public int saveRoles(Map<String, Object> map) {
		int successCount = 0;
		
		String sql = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		
		try {
			connection = pool.getConnection();
			List<Integer> roles = (List<Integer>)map.get("roles");
			User user = (User) map.get("user");
			
			sql = "insert into role_dtl values";
			
			for(int i = 0; i < roles.size(); i++) {
				
				sql += "(0, ?, ?)";
				
				if(i < roles.size() - 1) {
					sql += ",";
				}
			}
			
			preparedStatement = connection.prepareStatement(sql);
			
			for(int i = 0; i < roles.size(); i++) {
				preparedStatement.setInt((i * 2) + 1, roles.get(i));
				preparedStatement.setInt((i * 2) + 2, user.getUserId());
			}
			
			successCount = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return successCount;
	}
	
	
	public static void main(String[] args) {
		
		UserInsert userInsert = new UserInsert();
		
		User user = User.builder()
				.username("ddd")
				.password("1234")
				.name("ddd")
				.email("ddd@gmail.com")
				.build();
		
		int successCount = userInsert.saveUser(user);
		
		System.out.println("쿼리 실행 성공 : " + successCount + "건");
		
		System.out.println(user);
		
		/*==============================================================================*/
		
		List<Integer> roleIdList = new ArrayList<>();
		roleIdList.add(2);
		roleIdList.add(3);
		
		Map<String, Object> map = new HashMap<>();
		map.put("user", user);
		map.put("roles", roleIdList);
		
		System.out.println(map);
		
		successCount = userInsert.saveRoles(map);
		
		System.out.println("쿼리 실행 성공 : " + successCount + "건");
		
	}

}
