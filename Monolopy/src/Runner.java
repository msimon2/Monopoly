
public class Runner
	{
	public static void main(String[] args)
		{
		Spaces MediterraneanAve = new Brown("Mediterranean Avenue", 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces BalticAve = new Brown("Baltic Avenue", 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces OrientalAve = new LightBlue("Oriental Avenue", 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces VermontAve = new LightBlue("Vermont Avenue", 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces ConnecticutAve = new LightBlue("Conntecticut Avenue", 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces StCharlesPlace = new Pink("St. Charles Place", 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 );
		Spaces StatesAve = new Pink("States Avenue", 14, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces StJamesPlace = new Orange("St. James Place", 17, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces TennesseeAve = new Orange("Tennessee Avenue", 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces NewYorkAve = new Orange("New York Avenue", 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces KentuckyAve = new Red("Kentucky Avenue", 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces IndianaAve = new Red("Indiana Avenue", 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces IllinoisAve = new Red("Illinois Avenue", 25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces AtlanticAve = new Yellow("Atlantic Avenue", 27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces VentnorAve = new Yellow("Ventnor Avenue", 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces MarvinAve = new Yellow("Marvin Avenue", 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces PacificAve = new Green("Pacific Avenue", 32, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces NorthCarolinaAve = new Green("North Carolina Avenue", 33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces PennsylaniaAve = new Green("Pennsylvania Avenue", 35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces ParkPlace = new DarkBlue("Park Place", 38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
		Spaces BoardWalk = new DarkBlue("Park Place", 38, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

		
		}
	public String returnName()
		{
			int random = (int)(Math.random()*13)+2;
			for (int i = 0; i<0; i++)
				{	
				int location = 0 + random;
				if (location == random)
					{
					return name;
					}
				}
		}
	}
