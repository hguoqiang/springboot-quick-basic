# springboot 快速开发脚手架
这是一个快速开发脚手架项目，当我们在创建新的项目时，可以直接再次基础上进行开发。
## 脚手架应该包含哪些功能
- Swagger在线接口文档：前后端联调
- JWT token：对接口的访问安全进行校验
- 代码生成器：减轻开发中POJO类、CRUD工作量，加快开发速度
- 统一返回格式封装对象：基础返回数据格式和分页返回数据格式
- 通用的分页对象：分页请求对象和分页响应对象
- 常用工具类：基本的常用工具类
- 全局异常配置：将错误信息返回给用户时便于理解。具体应包含：错误枚举和自定义异常
- 错误码：系统对外提供的错误码统一封装
- 日志配置:出现问题时便于查找。具体应包含：日志文件名按日期创建、统一打印接口出入参等。
- 多环境配置文件: dev、test、prod等
- Maven多环境配置：
- JenkinsFile：集成Jenkins
