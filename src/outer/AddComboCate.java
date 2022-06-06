package outer;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class AddComboCate extends Component{
	JComboBox<String> addcombo;
	protected AddComboCate(CreateFrame createframe,int x, int y, int width, int height) {
		super(createframe);
		// TODO 自動生成されたコンストラクター・スタブ
		String[] data = {"ゼミ","授業","私用"};
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(data);
		addcombo = new JComboBox<String>(model);
		Bounds(x,y,width,height);
		panel.add(addcombo);
	}

	@Override
	public void Bounds(int x, int y, int width, int height) {
		// TODO 自動生成されたメソッド・スタブ
		addcombo.setSelectedIndex(2);
		addcombo.setBounds(x,y,width,height);
		addcombo.setFont(new Font("",Font.PLAIN,24));
	}

	@Override
	public JPanel getPanel() {
		// TODO 自動生成されたメソッド・スタブ
		return super.panel;
	}

}
