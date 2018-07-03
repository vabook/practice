package top.vabook.singleton;
/**
* @author vabook@hotmail.com
* @version 2018年7月3日 下午9:16:50
*
*/
//懒汉式 ,加锁
public class Singleton02 {
	private static Singleton02 instance ;
	private Singleton02(){}
	
	public static synchronized Singleton02 GetInstance(){
		if (instance == null) {
			instance = new Singleton02();
		}
		return instance ;
	}
}
