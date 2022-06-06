package AddVisitor;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JPanel;

import Mediator.Mediator;

public class VisitorSearchButton extends Component implements ActionListener{
	JButton searchbutton;

	public VisitorSearchButton(Entry ent ,String str, int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ
		searchbutton = new JButton(str);
		Bounds(x,y,width,height);
		super.panel.add(searchbutton);
	}

	public void accept(Visitor v) {
		// TODO 自動生成されたメソッド・スタブ
		v.visit(this);
	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		searchbutton.setBounds(x, y, width, height);
		searchbutton.setFont(new Font("",Font.PLAIN,24));
		searchbutton.addActionListener(this);
	}

	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return super.panel;
	}
	@Override
	public ArrayList getList() {
		// TODO 自動生成されたメソッド・スタブ
		return super.list;
	}

	public Iterator iterator() {
		return super.list.iterator();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		this.accept(new SearchListVisitor());
	}

	@Override
	public Mediator getMediator() {
		// TODO 自動生成されたメソッド・スタブ
		return super.mediator;
	}
}
