package bikeproject;

public interface RoadParts {
	//constant declaration
	public final String TERRAIN = "track_racing";

	//required methods after implementation
	public int getTyreWidth();
	public void setTyreWidth(String newValue);
	public int getPostHeight();
	public void setPostHeight(int newValue);
}//end interface RoadParts

