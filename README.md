# DesignPattern
《大话设计模式》一书代码练习

第1章 简单工厂模式
		
		package simpleFactory.a 面向过程的计算器程序
		package simpleFactory.b 面向对象之封装：业务和显示分离
		package simpleFactory.c 面向对象之继承和多态：抽象出Operation基类，加减乘除等其他运算类继承于它；再用一个单独的**工厂类**来创建Operation对象，供客户端类调用		

> ![](http://hi.csdn.net/attachment/201006/17/0_1276767125Ok7J.gif)

第2章 策略模式
	
		package strategy.a 不使用任何模式的商场收银程序
		package strategy.b 增加下拉菜单，可设置打折活动
		package strategy.c 简单工厂实现：让打折类和返利类继承于同一个父类；工厂类负责创建对象（不足是，每次维护或扩展收费方式都要改动工厂类）
		
> ![](http://hi.csdn.net/attachment/201006/19/0_1276989870q5S1.gif)
		
		package strategy.d 策略模式的简单Demo
		
> ![](http://hi.csdn.net/attachment/201006/19/0_12769899720BOF.gif)

		package strategy.e 商场收银程序的策略模式实现（不足是，判断用哪一个算法发生在客户端）

> ![](http://hi.csdn.net/attachment/201006/19/0_1276990048DO8H.gif)		
		
		package strategy.f 策略与简单工厂结合

第14章 观察者模式

        package observer.coupled 双向耦合的代码
        package observer.decouple1 解耦实践一（分离出抽象的观察者）
        package observer.decouple2 解耦实践二（增加了抽象的通知者接口）
        
第17章 适配器模式
        
        package adapter.a 一个简单的适配器模式Demo
        package adapter.b NBA：教练给后卫、中锋、前锋分配进攻防守任务，尚未加入翻译适配器
        package adapter.c NBA：篮球翻译适配器（适配器：Translator）
