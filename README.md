## 码匠社区

## 资料
[Spring 文档](https://spring.io/guides/)  
[Spring Web](https://spring.io/guides/gs/serving-web-content/)  
[elasticsearch社区](https://elasticsearch.cn/explore/)   
[Github develoy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys/)    
[Bootstrap栅格系统](https://v3.bootcss.com/css/#type-headings)  
[OKHttp](https://square.github.io/okhttp/)  
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#using-theach)  
[Mybatis](https://mybatis.org/mybatis-3/zh/configuration.html#properties) 
## 工具
[Git](https://git-scm.com/downloads)  
[Visual Paradigm](https://www.visual-paradigm.com/cn/)  
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)  
[Lombok](https://projectlombok.org/)(需要安装IDEA插件)  
## 脚本
```sql
CREATE  TABLE USER(
    ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ACCOUNT_ID VARCHAR(100),
    NAME VARCHAR(50),
    TOKEN CHAR(36),
    GMT_CREATE BIGINT,
    GMT_MODIFIED BIGINT
)

```
```bash

mvn flyway:migrate
```