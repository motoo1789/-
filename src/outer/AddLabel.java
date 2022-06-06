package outer;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddLabel extends Component{
	JLabel addlabel;
	protected AddLabel(CreateFrame createframe,String str,
					int x, int y, int width, int height) {
		super(createframe);
		// TODO 自動生成されたコンストラクター・スタブ
		addlabel = new JLabel(str);
		Bounds(x,y,width,height);
		panel.add(addlabel);
	}
	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		addlabel.setBounds(x,y,width,height);
		addlabel.setFont(new Font("",Font.PLAIN,24));
	}
	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return super.panel;
	}
}
