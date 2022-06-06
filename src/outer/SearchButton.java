package outer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SearchButton extends Component implements ActionListener{
	JButton addbutton;
	protected SearchButton(CreateFrame createframe, String str, int x, int y, int width, int height) {
		super(createframe);
		addbutton = new JButton(str);
		Bounds(x,y,width,height);
		super.panel.add(addbutton);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		addbutton.setBounds(x, y, width, height);
		addbutton.setFont(new Font("",Font.PLAIN,24));
		addbutton.addActionListener(this);
	}

	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return super.panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
