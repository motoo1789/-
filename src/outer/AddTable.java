package outer;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class AddTable extends Component{
	JScrollPane sp;
	JTable addtable;
	String[][] tabledata = {
			{"タスク名","年","１２","11","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
			{"タスク名","年","月","日","カテゴリー","重要度"},
	};
	String[] columnNames = {"タスク名","年","月","日","カテゴリー","重要度"};
	protected AddTable(CreateFrame frame,int x, int y, int width, int height) {
		super(frame);
		// TODO 自動生成されたコンストラクター・スタブ
		
		
		addtable = new JTable(tabledata,columnNames);
		
		sp = new JScrollPane(addtable);
		//sp.setPreferredSize(new Dimension(600,200));
		Bounds(x,y,width,height);
		super.panel.add(sp);
	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		//addtable.setBounds(x, y, width, height);
		DefaultTableColumnModel columnModel
	      = (DefaultTableColumnModel)addtable.getColumnModel();

	    TableColumn column = null;
	    column = columnModel.getColumn(0);
	    column.setPreferredWidth(150);
	    
	    for (int i = 1 ; i < 6 ; i++){
		    column = columnModel.getColumn(i);
		    column.setPreferredWidth(5);
	    }

	    
		addtable.setFont(new Font("",Font.PLAIN,24));
		addtable.setRowHeight(30);
		sp.setBounds(x, y, width, height);
		
		
	}

	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return super.panel;
	}

}
