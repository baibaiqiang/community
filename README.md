# 码匠社区

## 资料
[Spring 文档](https://spring.io/guides/)  
[Spring Web](https://spring.io/guides/gs/serving-web-content/)  
[Spring Boot](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/)
[elasticsearch社区](https://elasticsearch.cn/explore/)   
[Github develoy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys/)    
[Bootstrap栅格系统](https://v3.bootcss.com/css/#type-headings)  
[OKHttp](https://square.github.io/okhttp/)  
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#using-theach)  
[Mybatis](https://mybatis.org/mybatis-3/zh/configuration.html#properties)  
[SpringMVC](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#mvc-handlermapping-interceptor)
[Mybatis Generator](http://mybatis.org/generator/)  

## 工具
[Git](https://git-scm.com/downloads)  
[Visual Paradigm](https://www.visual-paradigm.com/cn/)  
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)  
[Lombok](https://projectlombok.org/)(需要安装IDEA插件)  
[JQuery](https://jquery.com/)
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
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```