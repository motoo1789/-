package CoR;

import java.awt.Component;

import javax.swing.JComboBox;

public class SupportComboBox extends Support{

	@Override
	protected boolean resolve(Component compo) {
		// TODO 自動生成されたメソッド・スタブ
		if(compo instanceof JComboBox)	return true;
		else							return false;
	}

	@Override
	protected void done(Component compo) {
		// TODO 自動生成されたメソッド・スタブ
		JComboBox<String> combo = (JComboBox) compo;
		System.out.println("コンボボックスを対処" + (String) combo.getSelectedItem());
		SingletonAddData.setStr((String) combo.getItemAt(combo.getSelectedIndex()));
	}

}
