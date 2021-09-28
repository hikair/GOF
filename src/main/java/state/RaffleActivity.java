package state;

public class RaffleActivity {

    /**
     * 表示活动当前的状态，是变化的
     */
    private State state;

    /**
     * 奖品数量
     */
    private Integer count;

    /**
     * 四种属性，表示四种状态
     */
    private State noRafflleState = new NoRaffleState(this);
    private State canRaffleState = new CanRaffleState(this);
    private State dispenseState = new DispenseState(this);
    private State dispenseOutState = new DispenseOutState(this);


    /**
     * 初始化当前的状态为noRafflleState即不能抽奖状态
     * @param count
     */
    public RaffleActivity(Integer count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    /**
     * 扣积分
     */
    public void debuctMoney() {
        state.deductMoney();
    }

    /**
     * 抽奖
     */
    public void raffle() {
        if (state.raffle()) {
            // 领取奖品
            state.dispensePrize();
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoRafflleState() {
        return noRafflleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public Integer getCount() {
        int temp = count;
        count--;
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
