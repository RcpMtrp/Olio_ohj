public class Customer {
    private static int previousAssignedId = 0;
    private int id;
    private long startTime;
    private long endTime;



    public Customer() {
        this.id = ++previousAssignedId;
    }
    public int getId() {
        return id;
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getTimeTotal() {
        return endTime - startTime;
    }
}
