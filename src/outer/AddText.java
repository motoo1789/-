package outer;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddText extends Component{
	JTextField addtext;
	protected AddText(CreateFrame createframe, int length , int x, int y, int width, int height) {
		super(createframe);
		// TODO 自動生成されたコンストラクター・スタブ
		addtext = new JTextField(length);
		Bounds(x,y,width,height);
		panel.add(addtext);
	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		addtext.setBounds(x,y,width,height);
		addtext.setFont(new Font("",Font.BOLD,16));
		addtext.setText("お試し");
	}

	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return super.panel;
	}

}
