package Mediator;

public interface Colleague{
	public abstract void setMediator(Mediator mediator);
	public abstract void setColleagueEnabled(boolean enabled);
	public abstract String getName();
}

