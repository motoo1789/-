package AddVisitor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JRadioButton;

import Mediator.Colleague;
import Mediator.Mediator;

public class VisitorRadioButton  extends Component implements Colleague, ActionListener     {
	private Mediator mediator;
	public String name;
	public JRadioButton radio;

	public VisitorRadioButton(Entry ent, String str, int x, int y, int width, int height) {
		super(ent);
		// TODO 自動生成されたコンストラクター・スタブ
		radio = new JRadioButton(str);
		radio.addActionListener(this);
		Bounds(x,y,width,height);
		panel.add(radio);
		super.mediator.addColleagueRadio(str,this);
		name = str;
	}

	public String getName() {
		return name;
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
		radio.setEnabled(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		mediator.ColleagueChanged(name, !radio.isSelected());
	}

	@Override
	public Mediator getMediator() {
		// TODO 自動生成されたメソッド・スタブ
		return super.mediator;
	}

	public void accept(Visitor v) {
		// TODO 自動生成されたメソッド・スタブ
	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		radio.setBounds(x,y,width,height);
		radio.setFont(new Font("",Font.PLAIN,24));
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



}
