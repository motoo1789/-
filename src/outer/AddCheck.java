package outer;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class AddCheck extends Component{
	JCheckBox addcheck;
	protected AddCheck(CreateFrame createframe,String str,int x, int y, int width, int height) {
		super(createframe);
		// TODO 自動生成されたコンストラクター・スタブ
		addcheck = new JCheckBox(str);
		Bounds(x,y,width,height);
		super.panel.add(addcheck);
	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		addcheck.setBounds(x,y,width,height);
		addcheck.setFont(new Font("",Font.PLAIN,24));
		addcheck.setSelected(true);
	}

	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return super.panel;
	}

}
