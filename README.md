# 物流项目
这里是个人开发的物流项目

#### 项目介绍
	物流项目后台管理系统

#### 组织结构
![](https://i.imgur.com/JqRucaH.jpg)

#### 技术选型

###### 后台技术
| 技术              | 版本      | 说明 |
| :--------------: | :-------:| :-----: |
| Struts 2 | 2.3.24      | 表现层 MVC 框架 |
| Hibernate        | 5.0.7   | 数据层持久化框架 |
| Spring、SpringDataJPA | 4.2.4、1.10.4 | 业务管理 IOC 和 AOP 框架 |
| POI | 3.11 | Office 文档读写组件 |
| CXF | 3.0.1 | WebService 远程调用 |
| Redis | 2.4.5 | 缓存 |
| Apache Shiro | 1.2.2 | 权限管理框架 |
| HighCharts | 4.0.4 | JS 报表框架 |
| EhCache | 2.6.6 | 缓存技术 |
| OCUpload | 1.1.2 | 上传插件 |

###### 前端技术
| 技术 | 版本 | 说明 |
| :---: | :---: | :---: |
| jQuery | 1.8.3 | JS 框架 |
| Easy UI | 1.3.2 | JS 前端 UI 框架 |
| Ztree | 3.5 | JS 树形菜单插件 |

#### 开发环境

- Oracle10g:数据库
- Tomcat:应用服务器
- Git:版本控制
- Intellij IDEA:开发IDE
- DataGrip:数据库客户端

#### 启动准备（后台）

1. 【短信服务】修改 bos_fore 项目 com.yapengren.bos.action.CustomerAction.java => sendCheckCode() 搜索测试，将发短信功能打开
2. 【cxf配置】bos_fore 项目和 bos_management 项目配置了cxf 客户端，需要修改ip地址
3. 【地址配置】bos_fore 项目 CustomerAction.java => regist 发送激活邮件存放着激活路径
4. 【】bos_management项目端口为8080 crm项目端口为9090 bos_fore项目端口随意
5. 【Oracle数据库】 bos 项目使用 Oracle 数据库，使用用户 bos_yapengren
6. 【Mysql数据库】 crm 项目使用 Mysql 数据库
  
#### 常见问题

1. 项目中使用 Hibernate 会遇到`LazyInitializationException`。
	这是因为 controller 和 model 层将通过JPA的一些启用了延迟加载功能的领域（如用 getRefrence() 方法或者在关联关系中采用 fetch=FetchType.LAZY ）返回给view层的时候，由于加载领域对象的 JPA Session 已经关闭，导致这些延迟加载的数据访问异常。
	这时就可以使用 OpenEntityManagerInViewFilter 来将一个 JPAsession 与一次完整的请求过程对应的线程相绑定如果没使用 OpenEntityManagerInViewFilter，session 会在 service.find() 方法后就被关闭，用了以后 session 在整个 view 层结束后才关闭。