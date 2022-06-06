package AddVisitor;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import Mediator.Mediator;

public abstract class Entry extends JPanel implements Element{
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	public Iterator iterator() throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	public abstract JPanel getPanel();
	public abstract ArrayList getList();

	public abstract Mediator getMediator();

}
