package CoR;

import java.awt.Component;

import javax.swing.JCheckBox;

public class SupportCheckBox extends Support{

	@Override
	protected boolean resolve(Component compo) {
		// TODO 自動生成されたメソッド・スタブ
		if(compo instanceof JCheckBox)	return true;
		else							return false;
	}
	@Override
	protected void done(Component compo) {
		// TODO 自動生成されたメソッド・スタブ
		JCheckBox check = (JCheckBox) compo;
		SingletonAddData.setCheckBox(check.isSelected());
		System.out.println("チェックボックスを対処"+check.isSelected());
	}
}
