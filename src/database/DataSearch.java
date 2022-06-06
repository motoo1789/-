package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import AddVisitor.VisitorTable;

public class DataSearch {
	private static DataSearch singleton = new DataSearch();
	private static VisitorTable table;
	private static String[] columnNames = {"タスク名","期限","カテゴリー","重要度"};


	public static void Search(ArrayList<String> where) throws Exception {
		Connection connection = null;
		String SQL = "SELECT * FROM task3";
		String url = "jdbc:postgresql://localhost:5432/Task";
		String user = "postgres";
		String password = "purotofasma1789";
		DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

		try {
			if(0 < where.size()) {
				SQL += " WHERE ";
				for(int i = 0; i < where.size(); i++)
				{
					SQL += where.get(i);

					if(i+1 < where.size())	SQL += " AND ";
					else					SQL += ";";
				}
			}

			connection = DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(false);
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(SQL);

			//Removetable();

			while(rs.next()) {
				Vector<String> result = new Vector();
				result.add(rs.getString("text"));
				result.add(rs.getString("combo_date"));
				result.add(rs.getString("combo_cate"));
				result.add(rs.getString("important"));

				Addtable(result,tableModel);
			}
			rs.close();
			stmt.close();

		}catch (SQLException e){
			System.out.println("SQLException:" + e.getMessage());
		}catch (Exception e){
			System.out.println("Exception:" + e.getMessage());
		}finally{
			try{
				if (connection != null){
					connection.close();
				}
			}catch (SQLException e){
				System.out.println("SQLException:" + e.getMessage());
			}
		}
	}

	public static void setVisitorTable(VisitorTable tmp) {
		table = tmp;
	}

	public static void Addtable(Vector<String> result,DefaultTableModel tableModel) {

		tableModel.addRow(result);
		table.addtable = new JTable(tableModel);
		table.sp.setViewportView(table.addtable);

	}
}
