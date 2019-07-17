package gmail.genadyms.itest.classes;

import gmail.genadyms.itest.interfaces.Fly;

public class Eagle implements Fly
{
	public int getWingSpan()
	{
		return 15;
	}

	public void land()
	{
		double speed = Fly.calculateSpeed(100, 1);
		System.out.println("Eagle is diving fast with speed " + speed);
	}
}
