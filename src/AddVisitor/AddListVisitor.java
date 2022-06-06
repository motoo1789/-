
package AddVisitor;

import java.util.Iterator;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import database.Dataadd;

public class AddListVisitor implements Visitor{
	@Override
	public void visit(VisitorCheckBox compo) {
		// TODO 自動生成されたメソッド・スタブ
		JCheckBox check = compo.addcheck;
		Dataadd.setCheckBox(check.isSelected());
	}

	@Override
	public void visit(VisitorTextField compo) {
		// TODO 自動生成されたメソッド・スタブ
		JTextField text = compo.addtext;
		Dataadd.setText((String) text.getText());
	}

	public void visit(VisitorAddButton compo) {
		Iterator it = compo.iterator();
		System.out.println(it);

		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
	}
	@Override
	public void visit(VisitorComboDay compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		System.out.println("コンボボックスDayを対処" + (String) combo.getItemAt(combo.getSelectedIndex()));
		Dataadd.setDay((String) combo.getItemAt(combo.getSelectedIndex()));
	}

	@Override
	public void visit(VisitorComboMonth compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		System.out.println("コンボボックスMonthを対処" + (String) combo.getItemAt(combo.getSelectedIndex()));
		Dataadd.setMonth((String) combo.getItemAt(combo.getSelectedIndex()));
	}

	@Override
	public void visit(VisitorComboYear compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		Dataadd.setYear((String) combo.getItemAt(combo.getSelectedIndex()));
	}

	@Override
	public void visit(VisitorComboCate compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = compo.addcombo;
		Dataadd.setCate((String) combo.getItemAt(combo.getSelectedIndex()));
	}

	public  void visit(VisitorSearchButton compo) {

	}


}


