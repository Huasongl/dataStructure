# int和Integer的区别是什么？谈谈Integer的值缓存范围。

- Integer是int的包装类，缓存值是-128~127，int是整形数字，（primitive types，boolean、char、byte、short、int、long、float、double）
- Integer封装了许多常用的操作
- 符合Java一切皆对象的思想

## 优缺点

- 原始数据类型
  - 数据小，节省内存
  - 不能和泛型搭配使用
  - 线程安全问题
  

## 知识扩展

- 理解自动装箱拆箱
  - Java平台为我们做了一些转换，保证不同写法在运行时候等价，即是编译的字节码相等。
    
- 关于valueOf，缓存机制器起的作用
  - 使用到valueOf时，程序会判断是否有缓存，有直接返回缓存。
     
- Java对象在内存的存在方式
  - 对象分为三部分，对象头储存在栈区，实体储存在堆区，数据对其区。
  
- 线程安全计数器的两种实现
  - [使用对象](CompactCounter.java)
  - [使用原始数据类型](Counter.java)