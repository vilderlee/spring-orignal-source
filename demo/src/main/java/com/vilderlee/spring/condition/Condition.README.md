##### com.vilderlee.spring.condition
    该模块代码主要用于@Condition注解的测试以及源码追踪使用
 
##### 基本原理
    ConditionEvaluator类是处理@Conditional注解的具体实现类
    
    将@Component注解（包含其扩展的子类@Controller、@Configuration等）的类在真正封装为BeanDefine之前，
    判断当前类是否为@Condition（包含扩展的子类）注解的类，如果包含就去调用@Condition的value()指定的那个Condition类，
    Condition类必须实现Condition接口的match方法
    