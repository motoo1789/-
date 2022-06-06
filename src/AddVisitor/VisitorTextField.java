package AddVisitor;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextField;

import Mediator.Mediator;

public class VisitorTextField extends Component{
	JTextField addtext;
	public VisitorTextField(Entry ent, int length , int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ
		addtext = new JTextField(length);
		Bounds(x,y,width,height);
		panel.add(addtext);
		add(this);
	}

	@Override
	public void accept(Visitor v) {
		// TODO 自動生成されたメソッド・スタブ
		v.visit(this);
	}

	public Entry add(Entry entry) {
		list.add(entry);
		return this;
	}

	public ArrayList getList() {
		// TODO 自動生成されたメソッド・スタブ
		return super.list;
	}


	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return super.panel;
	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		addtext.setBounds(x,y,width,height);
		addtext.setFont(new Font("",Font.BOLD,16));
		addtext.setText("お試し");
	}

	@Override
	public Mediator getMediator() {
		// TODO 自動生成されたメソッド・スタブ
		return super.mediator;
	}

}
