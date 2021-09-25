package responsibilitychain;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println(String.format("请求编号id = %s 被 %s 处理", purchaseRequest.getId(), name));
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
