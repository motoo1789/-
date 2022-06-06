package outer;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import AddVisitor.Entry;
import AddVisitor.VisitorAddButton;
import AddVisitor.VisitorCheckBox;
import AddVisitor.VisitorComboCate;
import AddVisitor.VisitorComboDay;
import AddVisitor.VisitorComboMonth;
import AddVisitor.VisitorComboYear;
import AddVisitor.VisitorLabel;
import AddVisitor.VisitorPanel;
import AddVisitor.VisitorRadioButton;
import AddVisitor.VisitorSearchButton;
import AddVisitor.VisitorTable;
import AddVisitor.VisitorTextField;


public class MainFrame extends JFrame implements ActionListener{
	JPanel mainPanel = new JPanel();
	CardLayout layout = new CardLayout();

	public MainFrame(String title) {
		setTitle(title);
		setBounds(100,100,900,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container conentPane = getContentPane();

		//上
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(67,135,233));
		headerPanel.setPreferredSize(new Dimension(900,50));

		//メニュー
		JPanel sidePanel= new JPanel();
		sidePanel.setBackground(new Color(120,120,120));
		sidePanel.setPreferredSize(new Dimension(190,600));

		//全体
		mainPanel.setLayout(layout);
		mainPanel.setBackground(new Color(240,240,240));

		//Visitor追加画面
		Entry add =
			new VisitorAddButton(
				new VisitorCheckBox(
					new VisitorTextField(
						new VisitorComboCate(
							new VisitorComboDay(
								new VisitorComboMonth(
									new VisitorComboYear(
										new VisitorLabel(
											new VisitorLabel(
												new VisitorLabel(
													new VisitorLabel(
														new VisitorLabel(
															new VisitorPanel(),
														"カテゴリー:",30,130,140,30),
													"日:",250,80,60,30),
												"月:",150,80,60,30),
											"年:",30,80,60,30),
										"タスク名:",30,30,120,30),
									65,80,85,30),
								185,80,60,30),
							285,80,60,30),
						160,130,80,30),
					100,140,30,200,30),
				"重要",250,130,100,30),
			"追加",360,120,185,40);

		Entry search =
			new VisitorRadioButton(
				new VisitorRadioButton(
					new VisitorRadioButton(
						new VisitorTable(
							new VisitorSearchButton(
								new VisitorCheckBox(
									new VisitorComboCate(
										new VisitorComboDay(
											new VisitorComboMonth(
												new VisitorComboYear(
													new VisitorLabel(
														new VisitorLabel(
															new VisitorLabel(
																new VisitorLabel(
																	new VisitorPanel(),
																"カテゴリー:",30,130,140,30),
															"日:",250,80,60,30),
														"月:",150,80,60,30),
													"年:",30,80,60,30),
												65,80,85,30),
											185,80,60,30),
										285,80,60,30),
									160,130,80,30),
								"重要",250,130,100,30),
							"検索",360,120,185,40),
						30,180,650,200),
					"期限",30,30,100,30),
				"カテゴリー",150,30,180,30),
			"重要",330,30,100,30);




		/*Decorator追加画面
		CreateFrame addCreateFrame =
			new AddButton(
				new AddCheck(
					new AddText(
						new AddComboCate(
							new AddCombo(
								new AddCombo(
									new AddComboYear(
										new AddLabel(
											new AddLabel(
												new AddLabel(
													new AddLabel(
														new AddLabel(
															new BasePanel(),
														"カテゴリー:",30,130,140,30),
													"日:",250,80,60,30),
												"月:",150,80,60,30),
											"年:",30,80,60,30),
										"タスク名:",30,30,120,30),
									2020,65,80,85,30),
								12,185,80,60,30),
							31,285,80,60,30),
						160,130,80,30),
					100,140,30,200,30),
				"重要",250,130,100,30),
			"追加",360,120,185,40);*/
		//Decorator検索画面
//		CreateFrame SearchCreateFrame =
//				new AddTable(
//					new SearchButton(
//						new AddCheck(
//							new AddText(
//								new AddComboCate(
//									new AddCombo(
//										new AddCombo(
//											new AddComboYear(
//												new AddLabel(
//													new AddLabel(
//														new AddLabel(
//															new AddLabel(
//																new AddLabel(
//																	new BasePanel(),
//																"カテゴリー:",30,130,140,30),
//															"日:",250,80,60,30),
//														"月:",150,80,60,30),
//													"年:",30,80,60,30),
//												"タスク名:",30,30,120,30),
//											2020,65,80,85,30),
//										12,185,80,60,30),
//									31,285,80,60,30),
//								160,130,80,30),
//							100,140,30,200,30),
//						"重要",250,130,100,30),
//					"検索",360,120,185,40),
//				30,180,650,200);

		this.mainPanel.add(add.getPanel(),"Add");
		//this.mainPanel.add(addCreateFrame.getPanel(),"Add");
		this.mainPanel.add(search.getPanel(),"Search");

		conentPane.add(headerPanel,BorderLayout.NORTH);
		conentPane.add(sidePanel,BorderLayout.WEST);
		//conentPane.add(addmodelPanel.getPanel());
		//conentPane.add(addCreateFrame.getPanel());
		conentPane.add(mainPanel);

		//ラベル文字配置
		JLabel headerLabel = new JLabel("ToDo");
		headerLabel.setForeground(Color.white);
		headerLabel.setPreferredSize(new Dimension(900,50));
		headerLabel.setHorizontalAlignment(JLabel.CENTER);
		headerLabel.setFont(new Font("Century",Font.BOLD,22));
		headerPanel.add(headerLabel,BorderLayout.CENTER);

		//サイドのボタン
		SideButton buttonAddMode = new SideButton("追加");
		buttonAddMode.setActionCommand("Add");
		buttonAddMode.addActionListener(this);

		SideButton buttonSearchMode = new SideButton("検索");
		buttonSearchMode.setActionCommand("Search");
		buttonSearchMode.addActionListener(this);

		sidePanel.add(buttonAddMode);
		sidePanel.add(buttonSearchMode);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		String cmd = e.getActionCommand();
		layout.show(this.mainPanel,cmd);
		System.out.println("機巧少女");
	}
}
