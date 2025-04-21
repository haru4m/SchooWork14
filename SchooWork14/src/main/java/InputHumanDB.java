import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InputHumanDB {
	int iiAge;
	String name;

	public static Human getHumandb(String name, String age) {
		int iAge = Integer.parseInt(age);
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");

			String url = "jdbc:postgresql://192.168.33.10:5432/javauser";
			String username = "postgres";
			String password = "haru4m";
			con = DriverManager.getConnection(url, username, password);
			//ステートオブジェクトの取得
			String sql = "INSERT INTO user_list(name,age) VALUES('"+ name +"'," + iAge+")";
			ps = con.prepareStatement(sql);

			int count = ps.executeUpdate();
			System.out.println("入力が完了しました。");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			//5 データベースとの接続を完了
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
		}

		return new Human(name, iAge);
	}
}
