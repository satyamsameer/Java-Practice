public class TestTV
{
	public static void main(String[] args)
	{
		TV tv1=new TV();
		tv1.turnON();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		TV  tv2=new TV();
		tv2.turnON();
		tv2.channelUP();
		tv2.channelUP();
		tv2.volumeUP();
		System.out.println("tv1 channel is "+tv1.channel+" and volume level is "+tv1.vlevel);
		System.out.println("tv2 channel is "+tv2.channel+" and volume level is "+tv2.vlevel);
	}
}