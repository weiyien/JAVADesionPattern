模板方法模式(方法回调,钩子方法)
--
定义了一个操作中的算法股价,将某些步骤延迟到子类中实现,新的子类可以在不改变算法
结构的前提下重新定义该算法的某些特定步骤.

实现一个算法时,整体步骤固定,某些部分易变,易变部分可以抽象出来供子类学习

场景:
- 数据库访问的封装
- Junit单元测试
- servlet关于doGet/doPost方法调用
- Hibernate中模板程序
- Spring中JDBCTemplate,HibernateTemplate