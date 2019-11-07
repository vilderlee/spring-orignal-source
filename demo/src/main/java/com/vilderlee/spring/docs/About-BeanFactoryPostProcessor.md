####    BeanFactoryPostProcessor接口的子接口以及执行顺序


    1. 子接口：BeanDefinitionRegistryPostProcessor
    
    2. 执行顺序：
        （1）BeanDefinitionRegistryPostProcessor#postProcessBeanDefinitionRegistry()
        （2）BeanFactoryPostProcessor#postProcessBeanFactory()
        
        
        
#####   经典实现
    1. ConfigurationClassPostProcessor 类
        postProcessBeanDefinitionRegistry()方法
        该类用于解析@Configuration标注的类，并去解析上面可能存在的@PropertySources、@ComponentScans、
        @Import、@ImportResource、@Bean注解。
        
        
    2. PropertySourcesPlaceholderConfigurer 类 父类实现了BeanFactoryPostProcessor接口
        postProcessBeanFactory（）
        加载properties文件就是通过该类去解析并去处理${}配置项的