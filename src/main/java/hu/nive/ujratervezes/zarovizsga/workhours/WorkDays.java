package hu.nive.ujratervezes.zarovizsga.workhours;

public class WorkDays {

    private String workerName;
    private Integer workHours;
    private String workDate;

    public WorkDays(String workerName, int workHours, String workDate) {
        this.workerName = workerName;
        this.workHours = workHours;
        this.workDate = workDate;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    @Override
    public String toString() {
        return "WorkDays{" +
                "workerName='" + workerName + '\'' +
                ", workHours=" + workHours +
                ", workDate='" + workDate + '\'' +
                '}';
    }
}
