package StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    class startTime {
        long starTime = System.currentTimeMillis();
    }
    public StopWatch(long startTime) {
        this.startTime = startTime;
        endTime = System.currentTimeMillis();
    }
    public double getElapsedTime() {
        long now = System.currentTimeMillis();
        return (now - startTime)/1000;
    }
}
