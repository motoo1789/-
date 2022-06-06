package outer;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddModePanel extends JPanel implements ActionListener{
	public JPanel panel;
	JComboBox<String> yearBox;
	JComboBox<String> monthBox;
	JComboBox<String> dayBox;
	JComboBox<String> categoBox;
	JButton addbutton = new JButton("追加");
	JCheckBox chbox = new JCheckBox("重要");
	
	public AddModePanel() {
		JPanel panel =new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(240,240,240));

		//タスクの内容
		JLabel label1 = new JLabel("タスク名:");
		label1.setBounds(30,30,120,30);
		label1.setFont(new Font("",Font.PLAIN,24));
		
		JTextField textField1 = new JTextField(100);
		textField1.setBounds(140,30,200,30);
		textField1.setFont(new Font("",Font.BOLD,16));

		//日付
		JLabel label2 = new JLabel("年:");
		label2.setBounds(30,80,60,30);
		label2.setFont(new Font("",Font.PLAIN,24));
		JLabel label3 = new JLabel("月:");
		label3.setBounds(150,80,60,30);
		label3.setFont(new Font("",Font.PLAIN,24));
		JLabel label4 = new JLabel("日:");
		label4.setBounds(250,80,60,30);
		label4.setFont(new Font("",Font.PLAIN,24));
		//カテゴリー
		JLabel label5 = new JLabel("カテゴリー:");
		label5.setBounds(30,130,140,30);
		label5.setFont(new Font("",Font.PLAIN,24));

		//コンボボックス
		String[] year = new String[50];
		String[] month = new String[12];
		String[] day = new String[31];
		String[] Categories = {"ゼミ","授業","私用"};

		for(int i = 0; i < year.length; i++) {
			Integer oi = new Integer(i + 2020);
			year[i] = oi.toString();
		}
		for(int i = 0; i < month.length; i++) {
			Integer oi = new Integer(i + 1);
			month [i] = oi.toString();
		}
		for(int i = 0; i < day.length; i++) {
			Integer oi = new Integer(i + 1);
			day[i] = oi.toString();
		}
		
		DefaultComboBoxModel<String> yearmodel = new DefaultComboBoxModel<String>(year);
		DefaultComboBoxModel<String> monthmodel = new DefaultComboBoxModel<String>(month);
		DefaultComboBoxModel<String> daymodel = new DefaultComboBoxModel<String>(day);
		DefaultComboBoxModel<String> categomodel = new DefaultComboBoxModel<String>(Categories);
		
		yearBox = new JComboBox<String>(yearmodel);
		yearBox.setBounds(65,80,85,30);
		//yearBox.setPreferredSize(new Dimension(80,30));
		yearBox.setFont(new Font("",Font.PLAIN,24));
		yearBox.addActionListener(this);
		
		monthBox = new JComboBox<String>(monthmodel);
		monthBox.setBounds(185,80,60,30);
		//monthBox.setPreferredSize(new Dimension(80,30));
		monthBox.setFont(new Font("",Font.PLAIN,24));
		monthBox.addActionListener(this);

		dayBox = new JComboBox<String>(daymodel);
		dayBox.setBounds(285,80,60,30);
		//dayBox.setPreferredSize(new Dimension(80,30));
		dayBox.setFont(new Font("",Font.PLAIN,24));
		dayBox.addActionListener(this);
		
		categoBox = new JComboBox<String>(categomodel);
		categoBox.setBounds(160,130,80,30);
		//categoBox.setPreferredSize(new Dimension(80,30));
		categoBox.setFont(new Font("",Font.PLAIN,24));
		categoBox.addActionListener(this);

		//チェックボックス
		chbox.setBounds(250,130,100,30);
		//chbox.setPreferredSize(new Dimension(100,100));
		chbox.setFont(new Font("",Font.PLAIN,24));

		//追加のボタン
		addbutton.setBounds(80,170,185,40);
		addbutton.setFont(new Font("",Font.PLAIN,24));
			
		panel.add(label1);
		panel.add(textField1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(yearBox);
		panel.add(monthBox);
		panel.add(dayBox);
		panel.add(categoBox);
		panel.add(chbox);
		panel.add(addbutton);
		
		this.panel = panel;
	}

	public JPanel getPanel() {
		return this.panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		String start;
	    String end;

	    if (monthBox.getSelectedIndex() == -1){
	        start = "(not select)";
	    }else{
	        start = (String)monthBox.getSelectedItem();
	    }

	    if (dayBox.getSelectedIndex() == -1){
	        end = "(not select)";
	    }else{
	        end = (String)dayBox.getSelectedItem();
	    }
	}
}
