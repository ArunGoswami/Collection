package day17;

public class Address {
	private int roadNumber;
	private String cityName;
	private String districtName;
	public Address(int roadNumber, String cityName, String districtName) {
		super();
		this.roadNumber = roadNumber;
		this.cityName = cityName;
		this.districtName = districtName;
	}
	/**
	 * @return the roadNumber
	 */
	public int getRoadNumber() {
		return roadNumber;
	}
	/**
	 * @param roadNumber the roadNumber to set
	 */
	public void setRoadNumber(int roadNumber) {
		this.roadNumber = roadNumber;
	}
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}
	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	@Override
	public String toString() {
		return "Road [roadNumber=" + roadNumber + ", cityName=" + cityName + ", districtName=" + districtName + "]";
	}
	
}
