package outer;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class AddCombo extends Component implements ActionListener {
	JComboBox<String> addcombo;
	protected AddCombo(CreateFrame createframe,int num,int x, int y, int width, int height) {
		super(createframe);
		// TODO 自動生成されたコンストラクター・スタブ
		String[] data = new String[num];
		for(int i = 0; i < data.length; i++) {
			Integer oi = new Integer(i + 1);
			data[i] = oi.toString();
		}
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		//System.out.println((String) this.getSelectedItem());
	}

}
