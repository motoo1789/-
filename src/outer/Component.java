package outer;

import javax.swing.JPanel;

public abstract class Component extends CreateFrame{
	protected CreateFrame createframe;
	protected JPanel panel;
	public abstract void Bounds(int x, int y, int width, int height);

	protected Component(CreateFrame frame) {
		this.createframe = frame;
		panel = frame.getPanel();
	}
}
