package com.mrathena.tutorial.spring4.chapter3.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration // 组合@Configuration元注解
@ComponentScan // 组合@ComponentScan元注解 自动扫描对应value（package路径）值下面的所有bean
public @interface Mrathena {

	String[] value() default {};// 覆盖value参数
	// 就是覆盖@ComponentScan注解中的value参数----必须要写，否则组合注解中放入value值时会报错

	/*
	 * @Target 作用：用于描述注解的使用范围（即：被描述的注解可以用在什么地方） 取值(ElementType)有：
	 * 1.CONSTRUCTOR:用于描述构造器 2.FIELD:用于描述域 3.LOCAL_VARIABLE:用于描述局部变量
	 * 4.METHOD:用于描述方法 5.PACKAGE:用于描述包 6.PARAMETER:用于描述参数
	 * 7.TYPE:用于描述类、接口(包括注解类型)或enum声明
	 * 
	 * @Retention 作用：表示需要在什么级别保存该注释信息，用于描述注解的生命周期（即：被描述的注解在什么范围内有效）
	 * 取值（RetentionPoicy）有： 1.SOURCE:在源文件中有效（即源文件保留，而被编译器丢弃）
	 * 2.CLASS:在class文件中有效（即class保留，被虚拟机忽略） 3.RUNTIME:在运行时有效（即运行时保留）
	 * 
	 * @Documented
	 * 作用：用于描述其它类型的annotation应该被作为被标注的程序成员的公共API，因此可以被例如javadoc此类的工具文档化。
	 * @Documented是一个标记注解，没有成员
	 * 
	 * @Inherited 作用：阐述了某个被标注的类型是可以被子类继承的。
	 * 如果一个使用了@Inherited修饰的annotation类型被用于一个class，则这个annotation将被用于该class的子类。
	 * @Inherited也是一个标记注解。
	 */

}