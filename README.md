# Three-level-linkage
#### 省市县三级联动Demo

##### 1.简单的三级联动前后台实现
**后台技术**： SpringBoot+Mybatis+MySQL+Druid </br>
**前台技术**：html+Jquery+Ajax</br>
 
##### 2.思路
**数据库表**</br>
![](https://github.com/zqnh/Three-level-linkage/blob/master/img/t1.jpg)
region_type是等级，1（直辖市及省会城市及特别行政区），2（地级市），3（区、县）</br>
联动思路：先查出省，然后根据省的regionId当作regionParentId来查市，查出来市的regionId当作regionParentId来查县。</br>

##### 3.效果</br>
![](https://github.com/zqnh/Three-level-linkage/tree/master/img/t2.jpg)
