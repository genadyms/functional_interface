package gmail.genadyms.itest;

import gmail.genadyms.itest.classes.DefaultBiard;
import gmail.genadyms.itest.classes.Eagle;
import gmail.genadyms.itest.interfaces.Fly;

public class Launcher
{
	public static void main(String[] args)
	{
		testDefultMethod();
	}

	private static void testDefultMethod()
	{
		Eagle eagle = new Eagle();
		System.out.println("Eagle wing span is: " + eagle.getWingSpan());
		eagle.land();

		DefaultBiard defaultBiard = new DefaultBiard();
		System.out.println("Default biard wing span is: " + defaultBiard.getWingSpan());
		defaultBiard.land();
	}
}
