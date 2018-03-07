package application.entity;

/**
 * class used for passing arguments
 */
public class Args {
    private String dateStart;
    private String dateEnd;
    private String month;
    private String cloudCoverage;
    private String platformName;

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCloudCoverage() {
        return cloudCoverage;
    }

    public void setCloudCoverage(String cloudCoverage) {
        this.cloudCoverage = cloudCoverage;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
}
