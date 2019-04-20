package chain;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 14:19
 * @description:
 */
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getTime() < 10) {
            System.out.println(this.name + "经理审批:" + leaveRequest.toString());
        } else {
            if (this.nextLeader == null) {
                System.out.println("审批被驳回.");
            } else {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
