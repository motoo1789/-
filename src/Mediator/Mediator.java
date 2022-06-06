package Mediator;

public interface Mediator {
	public abstract void ColleagueChanged(String keyName, boolean state);
	public abstract void addColleague(String name, Colleague colleague);
	public abstract void addColleagueRadio(String name, Colleague colleague);

}
