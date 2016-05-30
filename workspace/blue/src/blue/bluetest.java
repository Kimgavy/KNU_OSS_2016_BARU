package blue;

public class bluetest {
	private static String URL;
	public static void main(String[] args) {
		Bluetooth aaa = new Bluetooth();
		aaa.deviceSearch();
		URL = aaa.getURL();
		aaa.connectToDevice(URL);
		//aaa.disconnectDevice();
		//aaa.connectToDevice();
	}

}
