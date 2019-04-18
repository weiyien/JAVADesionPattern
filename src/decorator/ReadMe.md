装饰模式
---
动态的为一个对象增加新的功能
用于替代继承,无需通过继承增加子类就可以扩展对象的新功能.
对象关联代替继承关系,避免类型体系的快速膨胀
应用场景:
- IO中输入流输出流的设计
- Swing包中图形界面构建工具
- Servlet API中的HttpServletRequestWrapper(request休想的装饰器设计模式默认实现类)
  增强request对象的功能
- Struts2中request,response,session对象处理