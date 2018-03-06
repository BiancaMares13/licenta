package application.entity;

/**
 * class used for passing arguments
 */
public class Args {
    private String date;
    private String month;
    private String cloudCoverage;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
}
