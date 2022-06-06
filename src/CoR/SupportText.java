package CoR;

import java.awt.Component;

import javax.swing.JTextField;

public class SupportText extends Support{

	public SupportText(){
		SingletonAddData.Clear();
	}
	@Override
	protected boolean resolve(Component compo) {
		// TODO 自動生成されたメソッド・スタブ
		if(compo instanceof JTextField)	return true;
		else 								return false;
	}

	@Override
	protected void done(Component compo) {
		// TODO 自動生成されたメソッド・スタブ
		JTextField text = (JTextField) compo;
		System.out.println("テキストフィールドを対処" + (String) text.getText());
		SingletonAddData.setText((String) text.getText());
	}

}
