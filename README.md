# 算法学习笔记代码
#### 1、自定义数组（强大的数组）

整型数组 --> 泛型数组 --> 动态数组  

（代码：https://github.com/hfbin/Arithmetic/tree/master/src/cn/hfbin/array）

复杂度：

增、删  ： O（n）

改、查  ： 未知索引 O（n），已知索引O（1） 

#### 2、利用动态数组来构建栈

栈也是一种线性结构。相比数组，栈对应的操作是数组子集。只能从一端添加/取出元素，这一端称为栈顶。

栈是一种先进先出（LIFO）的数据结构。在计算机里，栈拥有着不可思议的作用。

栈应用：1）撤销  2）程序调用系统栈 3）括号匹配（常见的面试算法题）

括号匹配Demo:https://github.com/hfbin/Arithmetic/blob/master/src/cn/hfbin/stack/ParenthesisMatching.java

（代码：https://github.com/hfbin/Arithmetic/tree/master/src/cn/hfbin/stack）

复杂度ArrayStack<E>：
push(E)、pop()、peek()、getSize()、isEmpty()   都为O（1）
#### 3、利用动态数组来构建队列