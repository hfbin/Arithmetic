package cn.hfbin.array;

/**
 * Created by: HuangFuBin
 * Date: 2018/7/20
 * Time: 21:54
 * Such description:
 */
public class Main {

    public static void main(String[] args) {

        ArrayGenericity<Student> arr = new ArrayGenericity<>();
        arr.addLast(new Student("Alice", 100));
        arr.addLast(new Student("Bob", 66));
        arr.addLast(new Student("Charlie", 88));
        System.out.println(arr);
    }
}
