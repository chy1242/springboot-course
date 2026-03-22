# Spring Boot 课程学习仓库 
 
 > 基于"规格文档 → AI 生成代码 → 运行验证"学习模式的 Spring Boot 实战课程 
 
 ## 项目简介 
 
 本仓库是 Spring Boot 课程的学习项目记录，采用大模型辅助编程的新颖学习方法。通过编写规格文档，利用 AI 工具生成代码，再通过运行验证的方式进行学习，培养现代软件开发能力。 
 
 ## 课程特色 
 
 - **文档驱动开发**：先写规格文档，再让 AI 生成代码 
 - **大模型辅助**：充分利用 AI 工具提升开发效率 
 - **实战导向**：通过真实项目案例学习 Spring Boot 
 - **循序渐进**：从基础 Hello 接口到完整应用开发 
 
 ## 课程内容 
 
 ### Week 01 - 入门基础 
 
 **学习目标：** 
 
 - 开发环境搭建与工具准备 
 - Spring Boot 项目创建与运行 
 - 接口规格文档编写 
 - AI 辅助代码生成实践 
 
 **内容包括：** 
 
 | 类型 | 文件                                          | 说明                     | 
 | ---- | --------------------------------------------- | ------------------------ | 
 | PPT  | PPT-week01-01-课程介绍与大模型编程思想.md     | 课程 overview 与学习理念 | 
 | PPT  | PPT-week01-02-SpringBoot核心认知与项目结构.md | Spring Boot 基础知识     | 
 | PPT  | PPT-week01-03-规格文档模板与AI代码生成.md     | 文档规范与 AI 使用技巧   | 
 | PPT  | PPT-week01-04-任务实践.md                     | 实践指导                 | 
 | LAB  | LAB-week01-01-课程导入与工具准备-实验任务单.md | 环境搭建实验             | 
 | LAB  | LAB-week01-02-SpringBoot项目创建与运行-实验任务单.md | 项目创建实验             | 
 | LAB  | LAB-week01-03-Hello接口规格文档与AI生成-实验任务单.md | 接口开发实验             | 
 | LAB  | LAB-week01-04-任务实践与提交规范-实验任务单.md | 综合实践与提交           | 
 | DOC  | DOC-week01-Env-开发环境与账号准备.md          | 环境准备详细文档         | 
 
 **实践任务：** 
 
 - 基础版：完成 `GET /api/hello` 接口 
 - 挑战版：完成用户 CRUD 接口套装 
 
 ### Week 02 - 进阶实践 
 
 **学习目标：** 
 
 - 深入理解 Spring Boot 核心概念 
 - 掌握更复杂的接口设计与实现 
 - 学习数据模型设计与业务逻辑处理 
 - 提升 AI 辅助编程的实践能力 
 
 **内容包括：** 
 
 | 类型 | 文件                                          | 说明                     | 
 | ---- | --------------------------------------------- | ------------------------ | 
 | 代码 | springboot-week02/                            | Week 02 代码实现         | 
 
 **实践任务：** 
 
 - 完成学生信息管理系统的接口开发 
 - 实现学生与联系电话的关联数据模型 
 - 掌握复杂数据结构的接口设计 
 
 ## 项目结构 
 
 ``` 
 springboot-course/ 
 ├── week01/                    # 第一周学习内容 
 │   ├── PPT-*.md              # 课程讲义 
 │   ├── LAB-*.md              # 实验任务单 
 │   ├── DOC-*.md              # 配置与文档 
 │   ├── docs/                 # 生成的文档 
 │   │   ├── health-system-spec.md 
 │   │   └── hello-spec.md 
 │   ├── screenshot/           # 实践截图 
 │   └── springboot-hello/     # 代码实现 
 ├── week02/                    # 第二周学习内容 
 │   └── springboot-week02/    # 代码实现 
 ├── .gitignore                # Git 忽略配置 
 └── README.md                 # 项目说明 
 ``` 
 
 ## 学习路径 
 
 1. **阅读 PPT**：了解课程目标和理论知识 
 2. **阅读 DOC**：完成环境准备 
 3. **完成 LAB**：按实验任务单动手实践 
 4. **编写规格文档**：清晰描述接口需求 
 5. **AI 生成代码**：使用 Claude/GPT 生成实现代码 
 6. **运行验证**：测试接口功能 
 7. **截图记录**：保存实践过程截图 
 8. **提交作业**：按规范提交学习成果 
 
 ## 技术栈 
 
 - **框架**：Spring Boot 3.x 
 - **构建工具**：Maven / Gradle 
 - **JDK**：Java 17+ 
 - **AI 工具**：Claude Code、ChatGPT、GitHub Copilot 
 
 ## 开发环境要求 
 
 - JDK 17 或更高版本 
 - Maven 3.6+ 或 Gradle 7+ 
 - IDE：IntelliJ IDEA（推荐）或 Eclipse 
 - Git 
 - AI 工具账号（Claude/GPT/Copilot） 
 
 ## 提交规范 
 
 每周学习成果应包含： 
 
 1. **规格文档**：清晰的接口设计文档 
 2. **代码实现**：完整可运行的 Spring Boot 项目 
 3. **运行截图**：接口测试结果截图 
 4. **学习笔记**：可选，记录学习心得 
 
 ## 学习资源 
 
 - [Spring Boot 官方网站](https://spring.io/projects/spring-boot) 
 - [Spring 官方指南](https://spring.io/guides) 
 - [Claude Code 工具](https://github.com/anthropics/claude-code) 
 
 ## 课程进度 
 
 - [x] Week 01 - 入门基础 
 - [x] Week 02 - 进阶实践 
 - [ ] Week 03 - （待更新） 
 - [ ] Week 04 - （待更新） 
 - [ ] Week 05 - （待更新） 
 - [ ] Week 06 - （待更新） 
 
 ## 许可证 
 
 本项目仅用于学习目的。 
 
 --- 
 
 **学习愉快！有问题欢迎提 Issue 🎓**