package CoR;

import java.awt.Component;

public abstract class Support {
	private Support next;

	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	public final void support(Component compo) {

		if		(resolve(compo)) 	done(compo);
		else if	(next != null)		next.support(compo);
		else 						fall();

	}
	protected abstract boolean	resolve(Component compo);
	protected abstract void		done(Component compo);

	protected  void fall() {
		System.out.println("ラベルとボタンはサブクラスなし");
	}
}
