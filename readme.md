### 系统功能（期望）
- 本系统分为学生端与教师端。
- 教师端可以登录、注册、创建课程、修改课程信息、上传课程资源、对课程增删查改（尚未完成）。
- 学生端可以登录、注册、选课（尚未完成）、查询已选课表（尚未完成）。
---
### MySQL数据库
- src/main/resources/jdbc.properties 为数据库信息，包括数据库用户名密码与数据库名
- 需要在本地创建5个表，sql文件已放在resources下。
- **数据表解释：**
  - t_user为教师账户表
  - stu_user为学生账户表
  - lessons为课程表，课程名称与教师名称共同唯一决定一门课程，即如果两门课程名称以及所有教师相同，则它们有相同的id
  - lesson_info为课程的上课时间地点表，一条记录代表一个id为id的课程在第week周的星期day第num节课在building的room间上课。
  - lesson_choo为学生选课情况表
---
### 系统采用jetty插件运行，运行后在浏览器输入：

#### http://localhost:8080/teacher/index 即可进入教师端主页
#### http://localhost:8080/student/index 即可进入学生端主页
---
#### editLesson 暂时无法使用，因为未传给课程id，不传给课程id的原因是未使用ajax制作一个listLesson的下拉选单选择课程提交，目前只能在创建课程后的result页面点击editLesson进行进一步编辑。


