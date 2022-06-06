package Mediator;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcreteMediator implements Mediator{
	Map<String, Colleague>colleaguesRadio = new HashMap<String, Colleague>();
	ArrayList<Map> colleaguesMapList = new ArrayList<Map>();

	@Override
	public void addColleague(String name, Colleague colleague) {
		// TODO 自動生成されたメソッド・スタブ
		colleague.setMediator(this);
		Map<String, Colleague>colleagues = new HashMap<String, Colleague>();
		colleagues.put(name, colleague);
		colleaguesMapList.add(colleagues);
	}
	@Override
	public void addColleagueRadio(String name, Colleague colleague) {
		// TODO 自動生成されたメソッド・スタブ
		colleague.setMediator(this);
		colleaguesRadio.put(name, colleague);
	}

	@Override
	public void ColleagueChanged(String keyName, boolean state) {
		// TODO 自動生成されたメソッド・スタブ
		Iterator<Map> it = colleaguesMapList.iterator();

		while(it.hasNext()) {
			Map<String, Colleague> MapTmp = (Map) it.next();
			if(MapTmp.containsKey(keyName)) {
				if(keyName.equals((MapTmp.get(keyName)).getName())) {
					MapTmp.get(keyName).setColleagueEnabled(state);
					System.out.println("CooleagueChanged");
				}
			}
		}
	}

}
