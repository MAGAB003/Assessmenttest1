public class Burrow {

protected double lat;
    protected double lng;

    public Burrow(double lat, double lng) {
    this.lat=lat;
    this.lng=lng;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
