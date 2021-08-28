package prototype.deepclone;

/**
 * @author 35147
 */
public class Client {
    public static void main(String[] args) throws Exception{
        DeepProtoType dp = new DeepProtoType();
        dp.name = "bob";
        dp.deepCloneableTarget = new DeepCloneableTarget("tom","tom类");
        // 方式1完成深拷贝
        DeepProtoType dp2 = (DeepProtoType) dp.clone();
        // bob || DeepCloneableTarget{cloneName='tom', cloneClass='tom类'} || 1163157884
        System.out.println(dp.name+" || "+dp.deepCloneableTarget+" || "+dp.deepCloneableTarget.hashCode());
        // bob || DeepCloneableTarget{cloneName='tom', cloneClass='tom类'} || 1956725890
        System.out.println(dp2.name+" || "+dp2.deepCloneableTarget+" || "+dp2.deepCloneableTarget.hashCode());

        // 方式2完成深拷贝
        DeepProtoType dp3 = (DeepProtoType) dp.deepClone();
        // bob || DeepCloneableTarget{cloneName='tom', cloneClass='tom类'} || 1163157884
        System.out.println(dp.name+" || "+dp.deepCloneableTarget+" || "+dp.deepCloneableTarget.hashCode());
        // bob || DeepCloneableTarget{cloneName='tom', cloneClass='tom类'} || 2065951873
        System.out.println(dp3.name+" || "+dp3.deepCloneableTarget+" || "+dp3.deepCloneableTarget.hashCode());
    }
}
