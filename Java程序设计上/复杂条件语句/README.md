# Java程序设计/简单条件语句

#### 介绍
雨落倾城的Java程序设计库
本Git开源库由雨落倾城编写 部署在Gitee（码云）仓库
此数据库包含一些标准的Java语法写出来的程序
由雨落倾城于 2021/11/4 创建的java程序库
基于MulanPSL-2.0 开源许可证

#### 仓库架构
仓库框架由Java语言打造
编写与管理由 Visual Studio Code 与Git插件管理


#### 使用说明

1.  本仓库为开源仓库 所有访问者均可直接Git下载
2.  本仓库所有上传文件最终解释权归雨落倾城所有
3.  本开源库任何操作信息 请访问下方的操作日志
4.	特别注意所有源码均可在线浏览也可以下载查看
5.	为方便区分，所有文件名均采用中文，注意运行时修改文件名
6.	直接提交时注意检查 引用名是否为Main
7.	特别注意，运行时注意逻辑顺序关系



#### 推荐的插件（基于Visual Studio Code）

1.  Chinese (Simplified) (简体中文) Language Pack
2.  Debugger for Java  v0.36.0
3.  Extension Pack for Java v0.18.6
4.  Jupyter v2021.9.1101343141
5.  Jupyter Keymap v1.0.0
7.  Language Support for Java(TM) by Red Hat  v1.0.0
8.  Maven for Java v0.34.1
9.  Project Manager for Java v0.18.8
10.  Pylance v2021.10.3
11.  Python v2021.10.1365161279

#### 本文件夹目录树

1.  谁最大.java
2.  什么颜色.java
3.  是第几象限？.java
4.  是闰年吗？.java
5.  是三角形吗？.java
6.  选择题.txt

#### 作业/选择1
1. 有一个整型变量age，下面哪个选项中的表达式用于判断年龄在25岁到35岁之间（含25和35） (2分)
 A. 25 < age < 35
 B. 25 <= age <= 35
 C. 25 <= age && age <= 35 
 D. 25 < age && age < 35

2. 有一个整型变量age，下面哪个表达式可以表示年龄小于18或大于60？ (2分)
 A. age < 18 && age > 60 
 B. age < 18 || age > 60
 C. age < 60 && age > 18
 D. age < 60 || age > 18

3. 有一个整型变量score用以表示分数，下面哪个表达式可以用于判断成绩是否及格且合法？（60分以上合格，0-100之间的成绩合法） (2分)
 A. score > 60 || score < 100
 B. score > 0 && score < 100 
 C. score >= 60 || score <= 100
 D. score >= 60 && score <= 100

4. 有两个变量genre和age，分别用来表示性别和年龄，下面哪个表达式可以判断出是否是年龄18岁以上（含18）的男性？男性用字符M表示，女性用字符F表示。 (2分)
 A. age >= 18 && genre == 'M'
 B. age >= 18 || genre = 'M' 
 C. age > 18 && genre == 'F'
 D. age >= 18 || genre = 'F'

5. 有一个变量year表示年份，下面哪个表达式能判断这个年份是否能被4整除且能被100整除，或者能被400整除？ (2分)
 A. year % 4 == 0 || year % 400 == 0 && year % 100 == 0 
 B. (year % 4 == 0 && year % 100 == 0) || (year % 400 == 0)
 C. (year % 100 == 0 || year % 4 == 0) && (year % 400 == 0)
 D. year % 400 == 0 || year % 4 == 0 || year % 100 == 0

 参考答案：CABBA