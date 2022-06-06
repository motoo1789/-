package AddVisitor;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Mediator.Mediator;
import database.DataSearch;

public class VisitorTable extends Component{
	public JScrollPane sp;

	String[] columnNames = {"タスク名","期限","カテゴリー","重要度"};


	public DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
	public JTable addtable;

	private final int DataLenght = 4;

	public VisitorTable(Entry ent,int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ


		addtable = new JTable(tableModel);
		sp = new JScrollPane(addtable);

		//sp.setPreferredSize(new Dimension(600,200));
		Bounds(x,y,width,height);
		panel.add(sp);

		DataSearch.setVisitorTable(this);
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

	    for (int i = 1 ; i < DataLenght ; i++){
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



	@Override
	public ArrayList getList() {
		// TODO 自動生成されたメソッド・スタブ
		return super.list;
	}

	@Override
	public Mediator getMediator() {
		// TODO 自動生成されたメソッド・スタブ
		return super.mediator;
	}

	@Override
	public void accept(Visitor v) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
