package AddVisitor;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import database.DataSearch;

public class SearchListVisitor implements Visitor{
	private ArrayList<String> where = new ArrayList();
	private String date = "";

	@Override
	public void visit(VisitorComboYear compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;

		if(combo.isEnabled())
			date += "'" + combo.getSelectedItem();

	}
	@Override
	public void visit(VisitorComboMonth compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;

		if(combo.isEnabled())
			date += "-" + combo.getSelectedItem();

	}
	@Override
	public void visit(VisitorComboDay compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;

		if(combo.isEnabled())
			where.add("(combo_date <= " + date + "-" +combo.getSelectedItem() + "')");


	}

	@Override
	public void visit(VisitorComboCate compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;

		if(combo.isEnabled())
			where.add("(combo_cate = '" + (String) combo.getSelectedItem() + "')");

	}

	@Override
	public void visit(VisitorCheckBox compo) {
		// TODO 自動生成されたメソッド・スタブ
		JCheckBox check = compo.addcheck;

		if(check.isEnabled())
			where.add("(important = '" + check.isSelected() + "')");

	}

	public void visit(VisitorSearchButton compo) {

		Iterator it = compo.iterator();
		System.out.println(it);
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}

		DataSearch search  = new DataSearch();
		try {
			search.Search(where);
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

	@Override
	public void visit(VisitorAddButton compo) {
		// TODO 自動生成されたメソッド・スタブ
	}
	@Override
	public void visit(VisitorTextField compo) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
