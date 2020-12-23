# Datasource-Tools

## 背景

根据[screw](https://github.com/pingfangushi/screw) 封装出一个小工具,生成数据库设计文档.


## start generator


1. 根据spring-boot外部化配置特性,修改application.properties即可

```properties

## datasource config
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/db_user_master?characterEncoding=utf-8&&tag=write
spring.datasource.username=root
spring.datasource.password=123456
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.xa.properties.useInformationSchema=true

## screw config
screw.config.description=config
screw.config.output-path=./
screw.config.version=2.0.0
## word html md
screw.config.generator-type=word
```

2. run main function

java -jar datasource-tools.jar