package by.it_academy.simpleclass.train;

public class Train {

	private String station;
	private String number;
	private String deptime;

	public Train() {
		station = "";
		number = "";
		deptime = "";
	}

	public Train(String _station, String _number, String _deptime) {
		station = _station;
		number = _number;
		deptime = _deptime;
	}

	public void setStation(String _station) {
		station = _station;
	}

	public String getStation() {
		return station;
	}

	public void setNumber(String _number) {
		number = _number;
	}

	public String getNumber() {
		return number;
	}

	public void setDepTime(String _deptime) {
		deptime = _deptime;
	}

	public String getdepTime() {
		return deptime;
	}

	
}
