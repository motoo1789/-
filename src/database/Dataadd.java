package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dataadd {
	private static Dataadd 	dataadd = new Dataadd();
	private static String 	text 	 = new String();
	private static String 	year 	 = new String();
	private static String 	month 	 = new String();
	private static String 	day 	 = new String();
	private static String 	cate 	 = new String();
	private static boolean 	check;

	public static void setText		(String str)	{text 	= str;}
	public static void setYear		(String str)	{year 	= str;}
	public static void setMonth	(String str)	{month 	= str;}
	public static void setDay		(String str)	{day	= str;}
	public static void setCate		(String str)	{cate 	= str;}
	public static void setCheckBox	(boolean flag)	{check 	= flag;}


	public static void add() throws Exception {

		String strdate = year + "-" + month + "-" + day;
		final String SQL = "insert into task3 (text, combo_date, combo_cate, important) values(?,?,?,?);";

		try (
			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Task", // "jdbc:postgresql://<場所>:<ポート>/<データベース名>"
						"postgres", //user
						"purotofasma1789")){ //password;

			connection.setAutoCommit(false);

			try(PreparedStatement ps = connection.prepareStatement(SQL)){
				Date date = Date.valueOf(strdate); //Dateに変換

				ps.setString(1, text);
				ps.setDate	(2, date);
				ps.setString(3, cate);
				if(check)	ps.setString(4, "true");
				else 		ps.setString(4, "false");

				ps.executeUpdate();
				connection.commit();
			}
			catch(Exception e) {
				connection.rollback();
				System.out.println("rollback");
				throw e;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("処理が完了しました");
		}
	}
}
