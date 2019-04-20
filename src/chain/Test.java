package chain;

/**
 * @author: 魏薏恩
 * @date: 2019/4/20 14:22
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("经理");
        Director director = new Director("部长");
        Grouper grouper = new Grouper("组长");
        grouper.setNextLeader(director);
        director.setNextLeader(manager);
        LeaveRequest leaveRequest = new LeaveRequest("小王", 1, "相亲");
        LeaveRequest leaveRequest1 = new LeaveRequest("小王", 8, "相亲");
        LeaveRequest leaveRequest2 = new LeaveRequest("小王", 9, "相亲");
        LeaveRequest leaveRequest3 = new LeaveRequest("小王", 11, "相亲");
        grouper.handleRequest(leaveRequest);
        grouper.handleRequest(leaveRequest1);
        grouper.handleRequest(leaveRequest2);
        grouper.handleRequest(leaveRequest3);
    }
}
