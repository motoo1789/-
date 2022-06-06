package outer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import CoR.Support;
import CoR.SupportCheckBox;
import CoR.SupportComboBox;
import CoR.SupportText;
import database.Dataadd;

public class AddButton extends Component implements ActionListener{

	JButton addbutton;

	protected AddButton(CreateFrame createframe, String str, int x, int y, int width, int height) {
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
		JPanel rootpanel = (JPanel)addbutton.getParent();
		//Chain of Responsibility試し
		Support text = new SupportText();
		Support combo = new SupportComboBox();
		Support check = new SupportCheckBox();
		text.setNext(combo).setNext(check);
		for(int i = 0; i < rootpanel.getComponentCount(); i++)
		{
			text.support(panel.getComponent(i));
		}

		try {
			Dataadd dataadd = new Dataadd();
			dataadd.add();
		} catch (Exception e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
	}

}
