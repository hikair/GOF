package responsibilitychain;

public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() > 10000 && purchaseRequest.getPrice() <= 30000) {
            System.out.println(String.format("请求编号id = %s 被 %s 处理", purchaseRequest.getId(), name));
        } else {
            approver.processRequest(purchaseRequest);
        }
    }
}
