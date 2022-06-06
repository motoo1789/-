package AddVisitor;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

import Mediator.Colleague;
import Mediator.Mediator;

public class VisitorCheckBox extends Component implements Colleague{
	private Mediator mediator;
	private String name;

	JCheckBox addcheck;
	public VisitorCheckBox(Entry ent,String str,int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ
		addcheck = new JCheckBox(str);
		this.name = str;

		Bounds(x,y,width,height);
		super.panel.add(addcheck);
		super.mediator.addColleague(name,this);
		add(this);
	}

	public String getName() {
		return name;
	}
	@Override
	public void setMediator(Mediator mediator) {
		// TODO 自動生成されたメソッド・スタブ
		this.mediator = mediator;
	}
	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO 自動生成されたメソッド・スタブ
		addcheck.setEnabled(enabled);
	}


	@Override
	public Mediator getMediator() {
		// TODO 自動生成されたメソッド・スタブ
		return super.mediator;
	}

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
		addcheck.setBounds(x,y,width,height);
		addcheck.setFont(new Font("",Font.PLAIN,24));
		addcheck.setSelected(true);
	}


}
