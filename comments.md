### 完成度：
* 功能全部完成，但是存在bug

__Details:__
- UserController.java:25 Bug，当User不存在的时候，应该抛异常404
- EducationController.java:28 Bug，如果用户不存在，不应该返回空List，而应该抛异常404
- EducationController.java:27 Bug，给不存在的用户添加 education 也能成功

### 知识点：
* 对Java8 Stream有不错的使用
* 使用了三层架构
* 资源按层次组织获取，user是education的父级，如果没有user的概念，单独的education是没有意义的
* 使用了Lombok

__Details:__
- EducationService.java:11 EducationRepository应该使用构造器注入，而非直接new

### 工程实践：
* 包结构较为合理
* 有进行小步提交

__Details:__
- UserRepository.java:33 - ++i或i++操作不是线程安全的，可以了解下AtomicInteger

### 综合：
* 会对细节进行自己的思考，挺不错的，继续保持


