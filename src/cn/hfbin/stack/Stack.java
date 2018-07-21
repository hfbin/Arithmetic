package cn.hfbin.stack;
/**
 * Created by: HuangFuBin
 * Date: 2018/7/21
 * Time: 23:03
 * Such description:
 */
public interface Stack<E> {

    /*
    * 总长度
    * */
    int getSize();
    /*
    * Stack 是否为空
    * */
    boolean isEmpty();
    /*
    * 往Stack添加数据
    * */
    void push(E e);
    /*
    * 移除栈顶元素
    * */
    E pop();
    /*
    * 获取栈顶元素
    * */
    E peek();
}
