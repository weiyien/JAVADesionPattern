package chain;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 14:19
 * @description:
 */
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getTime() < 7) {
            System.out.println(this.name + "部长审批:" + leaveRequest.toString());
        } else {
            if (this.nextLeader == null) {
                System.out.println("审批被驳回.");
            } else {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
