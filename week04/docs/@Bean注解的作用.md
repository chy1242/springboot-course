## 🤖 Assistant

`@Bean` 是 Spring 生态里非常核心的注解，最主要的作用是**「把方法返回的对象实例，交给 Spring IoC 容器管理」**，让 Spring 帮你负责对象的创建、生命周期维护、依赖注入，你不需要自己手动 new 对象。

---
### 1. 最基础的用法
通常我们会把`@Bean`写在`@Configuration`（配置类）里面，比如你想自定义一个第三方工具类的实例交给 Spring 管理：
```java
// 首先这是一个配置类
@Configuration
public class AppConfig {

    // 把这个方法返回的 OkHttpClient 对象注册到容器里
    @Bean
    public OkHttpClient okHttpClient() {
        // 你可以自定义对象的初始化逻辑，比如设置超时时间、拦截器
        return new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
    }
}
```
注册之后，你在其他类里就可以直接通过`@Autowired`注入使用这个实例了，不需要自己重复创建：
```java
@Service
public class HttpService {
    // 直接注入上面定义的OkHttpClient实例
    @Autowired
    private OkHttpClient okHttpClient;
}
```

---
### 2. 和`@Component`等注解的区别
同样是把对象交给 Spring 管理，`@Bean` 和`@Controller/@Service/@Component`的核心差异是：
| 特性                | `@Bean`                                  | `@Component`/`@Service`等注解          |
|---------------------|------------------------------------------|-----------------------------------------|
| 适用场景            | 管**你无法修改的类**（比如第三方库的类） | 管**你自己写的类**，直接加在类上即可    |
| 自定义能力          | 强，可以自由控制对象的初始化、参数配置   | 弱，只能通过类的构造/`@PostConstruct`初始化 |
| 注册逻辑            | 基于方法的返回值注册，一个类可以注册多个实例 | 基于类注册，默认一个类对应一个单例实例 |

举个例子：`OkHttpClient`是第三方包的类，你没法修改它的源码给它加`@Component`，这时候就只能用`@Bean`来注册它的实例。

而且`@Bean`还支持同一个类注册多个不同的实例：
```java
@Configuration
public class OkHttpConfig {
    // 第一个实例：超时时间短的客户端，名称是shortTimeoutClient
    @Bean
    public OkHttpClient shortTimeoutClient() {
        return new OkHttpClient.Builder().connectTimeout(3, TimeUnit.SECONDS).build();
    }

    // 第二个实例：超时时间长的客户端，名称是longTimeoutClient
    @Bean
    public OkHttpClient longTimeoutClient() {
        return new OkHttpClient.Builder().connectTimeout(30, TimeUnit.SECONDS).build();
    }
}
```
注入的时候指定名称就能拿到对应的实例：
```java
// 注入短超时的实例
@Autowired
@Qualifier("shortTimeoutClient")
private OkHttpClient shortClient;
```

---
### 3. 常用的进阶属性
#### ① 自定义Bean的名称
默认`@Bean`的名称就是方法名，你也可以手动指定：
```java
// 这个Bean的名称就变成了"okHttp"，而不是"okHttpClient"
@Bean("okHttp")
public OkHttpClient okHttpClient() {
    return new OkHttpClient();
}
```

#### ② 控制Bean的初始化和销毁方法
如果你的对象需要在创建后、销毁前做一些自定义逻辑，可以指定回调方法：
```java
@Bean(initMethod = "init", destroyMethod = "close")
public SomeClient someClient() {
    return new SomeClient();
}
```
等价于对象创建后自动调用`someClient.init()`，Spring 容器关闭前自动调用`someClient.close()`。

#### ③ 控制Bean的作用域
默认`@Bean`是单例（整个容器只有一个实例），你可以通过`@Scope`修改作用域：
```java
// 每次获取Bean都会创建一个新的实例
@Bean
@Scope("prototype")
public SomePrototypeBean prototypeBean() {
    return new SomePrototypeBean();
}
```
其他常用作用域还有：`request`（一次HTTP请求一个实例）、`session`（一个会话一个实例）等。
