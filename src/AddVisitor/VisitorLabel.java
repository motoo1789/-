package AddVisitor;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Mediator.Mediator;

public class VisitorLabel extends Component{
	JLabel addlabel;
	public VisitorLabel(Entry ent,String str,
			int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ
		addlabel = new JLabel(str);
		Bounds(x,y,width,height);
		panel.add(addlabel);
		add(this);
	}

	public void accept(Visitor v) {
		// TODO 自動生成されたメソッド・スタブ
	}

	public Entry add(Entry entry) {
		list.add(entry);
		return this;
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
	public ArrayList getList() {
		// TODO 自動生成されたメソッド・スタブ
		return super.list;
	}

	@Override
	public Mediator getMediator() {
		// TODO 自動生成されたメソッド・スタブ
		return super.mediator;
	}
}
