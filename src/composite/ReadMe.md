组合模式
---
把部分和整体的关系用属性结构表示,从而使客户端用统一的方式处理部分和整体关系.
包含三种元素:
- 抽象构件:定义叶子和容器共同点
- 叶子构件:无子节点
- 容器构件:有容器特征,可以包含子节点
应用场景:
- 操作系统的资源管理器
- GUI中容器层次图
- XML文件解析
- OA系统中,组织结构的处理
- Junit单元测试框架
    - TestCase(叶子节点),TestUnit(容器),Test接口(抽象)