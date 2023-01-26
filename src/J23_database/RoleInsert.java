package J23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RoleInsert {
	
	private DBConnectionMgr pool;	//java와 mySql연결
	
	public RoleInsert() {
		pool = DBConnectionMgr.getInstance();	
	}
	
	public int saveRole(String roleName) {	//saveRole 메소드
		int successCount = 0;	//successCount 초기값 설정
		
		String sql = null;		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection();
			sql = "insert into role_mst values (0, ?)";
			pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, roleName);
			
			successCount = pstmt.executeUpdate();
			
			int newKey = 0;
			
			if(rs.next()) {
				newKey = rs.getInt(1);
			}
			
			System.out.println(newKey != 0 ? "새로운 키값 : " + newKey : "키가 생성되지 않음");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return successCount;
	}
	
	public static void main(String[] args) {
		
		RoleInsert roleInsert = new RoleInsert();
		
		int successCount = roleInsert.saveRole("ROLE_TESTER");
		System.out.println("insert 성공 건수 : " + successCount);
		
		
	}

}
