public class TV
{
	int channel=1;
	int vlevel=1;
	boolean on=false;
	public TV(){}
	public void turnON()
	{on=true;}
	public void turnOFF()
	{on=false;}
	public void setChannel(int nc)
	{
		if(on&&nc>=1&&nc<=120)
			channel=nc;
	}
	public void setVolume(int nvl)
	{
		if(on&&nvl>=1&&nvl<=7)
			vlevel=nvl;
	}
	public void channelUP()
	{
		if(on&&channel<120)
			channel++;
	}
	public void channelDOWN()
	{
		if(on&&channel>1)
			channel--;
	}
	public void volumeUP()
	{
		if(on&&vlevel<7)
			vlevel++;
	}
	public void volumeDOWN()
	{
		if(on&&vlevel>1)
			vlevel--;
	}
}