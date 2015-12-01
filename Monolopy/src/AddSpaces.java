import java.util.ArrayList;

public class AddSpaces extends Spaces
	{
	public static void addSpaces()
		{
		ArrayList <Object> spaces = new ArrayList<Object>();
		spaces.add("go");
		spaces.add(new Brown("Mediterranean Avenue", 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("Community chest");
		spaces.add(new Brown("Baltic Avenue", 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("income tax");
		spaces.add("reading railroad");
		spaces.add(new LightBlue("Oriental Avenue", 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("chance");
		spaces.add(new LightBlue("Vermont Avenue", 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add(new LightBlue("Conntecticut Avenue", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("in jail / just visiting");
		spaces.add(new Pink("St. Charles Place", 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 ));
		spaces.add("electric company");
		spaces.add(new Pink("States Avenue", 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add(new Pink("Virginia Avenue", 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("pennsylvania railroad");
		spaces.add(new Orange("St. James Place", 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("community chest");
		spaces.add(new Orange("Tennessee Avenue", 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add(new Orange("New York Avenue", 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("free parking");
		spaces.add(new Red("Kentucky Avenue", 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("chance");
		spaces.add(new Red("Indiana Avenue", 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add(new Red("Illinois Avenue", 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("B&O railroad");
		spaces.add(new Yellow("Atlantic Avenue", 27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add(new Yellow("Ventnor Avenue", 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("water works");
		spaces.add(new Yellow("Marvin Avenue", 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("go to jail");
		spaces.add(new Green("Pacific Avenue", 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add(new Green("North Carolina Avenue", 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("community chest");
		spaces.add(new Green("Pennsylvania Avenue", 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("short line");
		spaces.add("chance");
		spaces.add(new DarkBlue("Park Place", 38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		spaces.add("luxury tax");
		spaces.add(new DarkBlue("Boardwalk", 40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		
		int yourLocation = 0;
		for (int i = 0 ; i>0; i++)
			{
			int dieRoll = (int)(Math.random()*11)+2;
			if (yourLocation >= 40)
				{
				yourLocation = yourLocation - 40;
				}
			System.out.println("You rolled a " + dieRoll + ". You are now on " + spaces.get(yourLocation).getName() + ".");
			}
		}
	}
