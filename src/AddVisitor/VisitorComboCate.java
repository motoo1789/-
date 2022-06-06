package AddVisitor;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import Mediator.Colleague;
import Mediator.Mediator;

public class VisitorComboCate extends Component implements Colleague {
	private Mediator mediator;
	private String name = "カテゴリー";

	JComboBox<String> addcombo;
	public VisitorComboCate(Entry ent,int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ
		String[] data = {"ゼミ","授業","私用"};

		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(data);
		addcombo = new JComboBox<String>(model);
		Bounds(x,y,width,height);

		super.mediator.addColleague(name,this);
		panel.add(addcombo);
		add(this);
	}

	public void accept(Visitor v) {
		// TODO 自動生成されたメソッド・スタブ
		v.visit(this);
	}

	public Entry add(Entry entry) {
		list.add(entry);
		return this;
	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		addcombo.setBounds(x,y,width,height);
		addcombo.setFont(new Font("",Font.PLAIN,24));
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

	//Mediator
	@Override
	public void setMediator(Mediator mediator) {
		// TODO 自動生成されたメソッド・スタブ
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO 自動生成されたメソッド・スタブ
		addcombo.setEnabled(enabled);
	}

	public String getName() {
		return name;
	}

	@Override
	public Mediator getMediator() {
		// TODO 自動生成されたメソッド・スタブ
		return super.mediator;
	}
}
