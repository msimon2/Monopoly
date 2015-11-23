
public class Stations extends Spaces
	{
	public Stations(String n, int bl, int c, int r, int s2r, int s3r, int s4r)
		{
		name = n;
		boardLocation = bl;
		cost = c;
		rent = r;
		station2Rent = s2r;
		station3Rent = s3r;
		station4Rent = s4r;
		}
	protected int cost;
	protected int rent;
	protected int station2Rent;
	protected int station3Rent;
	protected int station4Rent;
	}
