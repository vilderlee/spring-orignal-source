#### BeanPostProcessor 接口
    这个接口一般称为Bean后置处理器，主要用于在Bean初始化前后对Bean进行修饰。
    
    BeanPostProcessor 有两个方法：
        postProcessBeforeInitialization(Object bean, String beanName)
        postProcessAfterInitialization(Object bean, String beanName)
    第一个参数为初始化的对象，第二个参数为bean名称
    
##### InstantiationAwareBeanPostProcessor 接口
    
    在Bean的实例化前后对Bean进行处理
    
        Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName);
        该方法是最先执行的方法，它在目标对象实例化之前调用，该方法的返回值类型是Object，我们可以返回任何类型的值。由于这个时候目标对象还未实例化，所以这个返回值可以用来代替原本该生成的目标对象的实例(比如代理对象)
        --------------------------------------------------------
        boolean postProcessAfterInstantiation(Class<?> beanClass, String beanName);
        该方法在对象实例化之后，但是在属性值还没有设置之前执行，如果返回true则属性值应该被设置，返回false则属性值被跳过
        
        PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName)
        PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName)
        这两个方法会在postProcessAfterInstantiation返回true时被调用，下面这个方法已经废弃；其方法都是在属性设置的时候对其进行修改

##### SmartInstantiationAwareBeanPostProcessor 接口

        Class<?> predictBeanType(Class<?> beanClass, String beanName)
        该方法用于推测Bean类型，如果是这个类型，返回Class，如果不是返回null
        ---------------------------------------------------------
        Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName)
        在实例化Bean的时候可以通过选取构造器去进行实例化。
        返回值是个构造器数组，如果返回null，会执行下一个PostProcessor的determineCandidateConstructors方法；否则选取该PostProcessor选择的构造器
        ---------------------------------------------------------
        Object getEarlyBeanReference(Object bean, String beanName)
        获取指定bean的早期访问引用，通常用于解析循环引用

        
        
##### MergedBeanDefinitionPostProcessor 接口
    见文知意，合并BeanDefinition的后置处理器
    
    //合并BeanDefinition
    //经典实现:
    //1.CommonAnnotationBeanPostProcessor（父类InitDestroyAnnotationBeanPostProcessor）中将@PostConstruct、@PreDestroy、@Resource三个注解识别，并加载到了BeanDefinition中
    //2.AutowiredAnnotationBeanPostProcessor的postProcessMergedBeanDefinition方法做了同样的事情，将@Autowired注解识别并加载到了BeanDefinition中
    //3.ApplicationListenerDetector中将其放入缓存内，为下一步做准备。
    postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName)

    