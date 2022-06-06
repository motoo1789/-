package outer;

import java.awt.Color;

import javax.swing.JPanel;

public class BasePanel extends CreateFrame{
	JPanel panel;

	public BasePanel(){
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(240,240,240));
	}
	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return this.panel;
	}
}
