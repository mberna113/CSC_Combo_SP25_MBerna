package version1;

/// For starters I will just use the fields:
///(mag, place, time, updated, url, title, geoType, latitude, longitude, depth)
///

public class Event {  //Keep this in order from the geojson file
	private double mag;
	private String place;
	private double time;
	private double updated;
	private String tz; 
	private String url;
	private String detail;
	private String felt;
	private String cdi;
	private String mmi;
	private String alert;
	private String status;
	private String tsunami;
	private String sig;
	private String net;
	private String code;
	private String ids;
	private String sources;
	private String types;
	private String nst;
	private String dmin;
	private String rms;
	private String gap;
	private String magtype;
	private String type;
	private String title;
	
	private String geoType;
	private double latitude;
	private double longitude;
	private double depth;
	private String id;
	
	
	
	//default constructor
////	public Event(double mag, String place, double time, double updated, String tz, String url, String detail,
//			String felt, String cdi, String mmi, String alert, String status, String tsunami, String sig, String net,
//			String code, String ids, String sources, String types, String nst, String dmin, String rms, String gap,
//			String magtype, String type, String title, String geoType, double latitude, double longitude, double depth, String id) {
//		super();
//		this.mag = mag;
//		this.place = place;
//		this.time = time;
//		this.updated = updated;
//		this.tz = tz;
//		this.url = url;
//		this.detail = detail;
//		this.felt = felt;
//		this.cdi = cdi;
//		this.mmi = mmi;
//		this.alert = alert;
//		this.status = status;
//		this.tsunami = tsunami;
//		this.sig = sig;
//		this.net = net;
//		this.code = code;
//		this.ids = ids;
//		this.sources = sources;
//		this.types = types;
//		this.nst = nst;
//		this.dmin = dmin;
//		this.rms = rms;
//		this.gap = gap;
//		this.magtype = magtype;
//		this.type = type;
//		this.title = title;
//		this.geoType = geoType;
//		this.latitude = latitude;
//		this.longitude = longitude;
//		this.depth = depth;
//		this.id = id;
//	}
//
//
//

	//Smaller constructor
	public Event(double mag, String place, double time, double updated, String url, String title, String geoType,
			double latitude, double longitude, double depth) {
		super();
		this.mag = mag;
		this.place = place;
		this.time = time;
		this.updated = updated;
		this.url = url;
		this.title = title;
		this.geoType = geoType;
		this.latitude = latitude;
		this.longitude = longitude;
		this.depth = depth;
	}
	
	
	//getters and setters
	public double getMag() {
		return mag;
	}
	public void setMag(double mag) {
		this.mag = mag;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public double getUpdated() {
		return updated;
	}
	public void setUpdated(double updated) {
		this.updated = updated;
	}
	public String getTz() {
		return tz;
	}
	public void setTz(String tz) {
		this.tz = tz;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getFelt() {
		return felt;
	}
	public void setFelt(String felt) {
		this.felt = felt;
	}
	public String getCdi() {
		return cdi;
	}
	public void setCdi(String cdi) {
		this.cdi = cdi;
	}
	public String getMmi() {
		return mmi;
	}
	public void setMmi(String mmi) {
		this.mmi = mmi;
	}
	public String getAlert() {
		return alert;
	}
	public void setAlert(String alert) {
		this.alert = alert;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getTsunami() {
		return tsunami;
	}
	public void setTsunami(String tsunami) {
		this.tsunami = tsunami;
	}
	public String getSig() {
		return sig;
	}
	public void setSig(String sig) {
		this.sig = sig;
	}
	public String getNet() {
		return net;
	}
	public void setNet(String net) {
		this.net = net;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getSources() {
		return sources;
	}
	public void setSources(String sources) {
		this.sources = sources;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getNst() {
		return nst;
	}
	public void setNst(String nst) {
		this.nst = nst;
	}
	public String getDmin() {
		return dmin;
	}
	public void setDmin(String dmin) {
		this.dmin = dmin;
	}
	public String getRms() {
		return rms;
	}
	public void setRms(String rms) {
		this.rms = rms;
	}
	public String getGap() {
		return gap;
	}
	public void setGap(String gap) {
		this.gap = gap;
	}
	public String getMagtype() {
		return magtype;
	}
	public void setMagtype(String magtype) {
		this.magtype = magtype;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGeoType() {
		return geoType;
	}
	public void setGeoType(String geoType) {
		this.geoType = geoType;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

	
	
	
}
