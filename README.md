# 算法学习笔记代码
#### 1、自定义数组（强大的数组）

整型数组 --> 泛型数组 --> 动态数组  

（代码：https://github.com/hfbin/Arithmetic/tree/master/src/cn/hfbin/array  ）

复杂度：

增、删  ： O（n）

改、查  ： 未知索引 O（n），已知索引O（1） 

##### 1.1  利用动态数组来构建栈

栈也是一种线性结构。相比数组，栈对应的操作是数组子集。只能从一端添加/取出元素，这一端称为栈顶。

栈是一种先进先出（LIFO）的数据结构。在计算机里，栈拥有着不可思议的作用。

栈应用：1）撤销  2）程序调用系统栈 3）括号匹配（常见的面试算法题）

括号匹配Demo:https://github.com/hfbin/Arithmetic/blob/master/src/cn/hfbin/stack/ParenthesisMatching.java

（代码：https://github.com/hfbin/Arithmetic/tree/master/src/cn/hfbin/stack  ）

复杂度ArrayStack<E>：
push(E)、pop()、peek()、getSize()、isEmpty()   都为O（1）

##### 1.2  利用动态数组来构建队列
队列也是一种线性结构。相比数组，队列对应的操作是数组子集。只能从一端（队尾）添加元素，只能从另一端（队首）取出元素。

队列是一种先进先出的数据结构（先到先得FIFO）

复杂度ArrayQueue<E>：
enqueue(E) 均摊、front()、getsize()、isEmpty() 都为O（1）,而 dequeue()为O（n）

(代码：https://github.com/hfbin/Arithmetic/blob/master/src/cn/hfbin/queue/ArrayQueue.java)

循环队列复杂度LoopQueue<E>：
enqueue(E) 均摊、dequeue() 均摊、front()、getsize()、isEmpty() 都为O（1）

(代码：https://github.com/hfbin/Arithmetic/tree/master/src/cn/hfbin/queue/LoopQueue.java)


#### 2、链表
在上面介绍的动态数组、栈、队列底层都是依托静态数据；靠resize解决固定容量问题。链表才是正真的动态数据结构。

数组与链表的对比：

数组最好用于索引有语意的情况。最大优点：支持快速查询。

链表不适合用于索引有语意的情况。最大优点：动态。

链表复杂度分析：

添加操作  O（n）

addLast(e)      O(n)  
addFirst(e)     O(1)     
add(index,e)   O(n/2) O(n)

删除操作  O（n）

removeLast(e)      O(n)  
removeFirst(e)     O(1)     
remove(index,e)   O(n/2) O(n)

修改操作  O（n）

set(index,e)      O(n)  

查找操作  O（n）
get(index)      O(n)  
contains(e)     O(n)   


源码：https://github.com/hfbin/Arithmetic/tree/master/src/cn/hfbin/linkedlist/dummylinkedlist
  

##### 2、1 使用链表构建栈

源码：https://github.com/hfbin/Arithmetic/tree/master/src/cn/hfbin/linkedlist/linkedliststack

##### 2、1 使用链表构建队列

源码：https://github.com/hfbin/Arithmetic/tree/master/src/cn/hfbin/linkedlist/linkedlistqueue

#### 3、二叉树
前中后序遍历

源码：https://github.com/hfbin/Arithmetic/blob/master/src/cn/hfbin/bst/recursion/BST.java



