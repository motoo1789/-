package CoR;

import java.util.ArrayList;

public class SingletonAddData {
	private static SingletonAddData singleton = new SingletonAddData();
	private static String Text = new String();
	private static boolean cBox;
	private static ArrayList combo = new ArrayList();

	private SingletonAddData() {
		System.out.println("データ作成");
	}

	public static void Clear()					{combo.clear();};
	public static void setText(String str)		{Text = str;}
	//public static void setNum(int num)			{combo.add(num);}
	public static void setStr(String str)			{combo.add(str);}
	public static void setCheckBox(boolean flag)	{cBox = flag;}

	public static SingletonAddData getInstance() 	{return singleton;}
	public String getText() 						{return Text;};
	public ArrayList getCombo() 					{return combo;};
	public boolean getCheckBox() 					{return cBox;};
}

//public static void showData() {
//	System.out.println();
//	System.out.println("Singleton:");
//	System.out.println("Text:" + Text);
//	for(int i = 0; i < combo.size(); i++) {
//		System.out.println("combo:" + combo.get(i));
//	}
//	System.out.println("cBox:" + cBox);
//	System.out.println();
//}