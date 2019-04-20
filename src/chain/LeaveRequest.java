package chain;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 14:17
 * @description:
 */
public class LeaveRequest {
    private String name;
    private int time;
    private String reason;

    public LeaveRequest(String name, int time, String reason) {
        this.name = name;
        this.time = time;
        this.reason = reason;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", reason='" + reason + '\'' +
                '}';
    }
}
