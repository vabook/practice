package top.vabook.singleton;
/**
* @author vabook@hotmail.com
* @version 2018年7月3日 下午9:16:50
*
*/
//懒汉式,静态内部类,私有,终态修饰
public class Singleton05 {
	private final static class SingletonBuilder{
		public static final Singleton05 instance = new Singleton05();
	}
	private Singleton05(){
		
	}
	public static Singleton05 getInstance(){
		return SingletonBuilder.instance ;
	}
}
