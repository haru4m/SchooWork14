import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.http.HttpServletRequest;

public class SelectHuman {
	public List SelectHuman(HttpServletRequest request) {
		Connection con = null;
		PreparedStatement ps = null;

		List<Human> humanList = new ArrayList<>();

		// データベースでとってきたデータをとっておく
		ResultSet rs = null;

		try {

			//jdbcドライバの入力
			Class.forName("org.postgresql.Driver");

			// データベースへの接続
			String url = "jdbc:postgresql://192.168.33.10:5432/javauser";
			String user = "postgres";
			String password = "haru4m";

			// ③ステートメントオブジェクトSql
			con = DriverManager.getConnection(url, user, password);

			// ④ステートメントオブジェクトの取得
			String sql = "SELECT * FROM user_list";
			ps = con.prepareStatement(sql);

			rs = ps.executeQuery();

			while (rs.next()) {
//				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				Human human = new Human(name,age);
				humanList.add(human);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

			//データべースへの接続
		} finally {
			try {
				if (con != null) {
					con.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}return humanList;
	}
}
