package prototype.deepclone;

import java.io.*;

/**
 * @author 35147
 */
public class DeepProtoType implements Serializable,Cloneable {

    public String name;

    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {
    }

    /**
     * 深拷贝 - 方式1使用clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 这里完成对基本数据类型（属性）和String的克隆
        deep = super.clone();
        // 对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }


    /**
     * 深拷贝 - 方式2通过对象的序列化实现（推荐）
     * @return
     */
    public Object deepClone(){
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try{
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 当前这个对象以对象流的方式输出
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream((bis));
            DeepProtoType copyObject = (DeepProtoType) ois.readObject();
            return copyObject;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            // 关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
