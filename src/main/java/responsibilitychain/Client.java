package responsibilitychain;

public class Client {

    public static void main(String[] args) {
        // 创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000f, 1);

        // 创建相关审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("洞校长");
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        departmentApprover.processRequest(purchaseRequest);
    }

}
