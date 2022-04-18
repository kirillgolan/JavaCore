package Lesson8.forecast;


public class Dayweather {
    private String iconphrase;
    private boolean hasprecipitation;

    public Dayweather() {
    }

    public Dayweather(String iconPhrase, boolean hasPrecipitation) {
        this.iconphrase = iconPhrase;
        this.hasprecipitation = hasPrecipitation;
    }

    @Override
    public String toString() {
        if (hasprecipitation) {
            return "there will be precipitation: " + iconphrase;
        } else {
            return "precipitation is not expected: " + iconphrase;
        }
    }

    public String getIconphrase() {
        return iconphrase;
    }

    public void setIconphrase(String iconphrase) {
        this.iconphrase = iconphrase;
    }

    public boolean isHasprecipitation() {
        return hasprecipitation;
    }

    public void setHasprecipitation(boolean hasprecipitation) {
        this.hasprecipitation = hasprecipitation;
    }
}