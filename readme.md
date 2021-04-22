#### http://localhost:8080/teacher/index
- 教师端index url
- sign in 按钮转发至/teacher/sin
- sign up 按钮转发至/teacher/sup
- 以上三个不会被拦截，其他功能需要先登录，否则将被拦截重定向到/teacher/sin
---
###待添加：
- 管理端对数据库的操作，包括：
    - 学生账户的批量导入、重置密码
    - 创建课程，create database
- 学生端登录，数据库，拦截
    - 学生提交参加课程信息
    - 学生端查询功能queryLesson
    - 可视化课表
  
