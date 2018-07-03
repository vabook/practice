package top.vabook.singleton;
/**
* @author vabook@hotmail.com
* @version 2018年7月3日 下午9:16:50
*
*/
//双重校验锁,加volatile修饰符
public class Singleton07 {
	private volatile static Singleton07 instance ;
	
	private Singleton07(){}
	
	public static synchronized Singleton07 GetInstance(){
		if (instance == null) {
			
			synchronized (Singleton07.class) {
				if (instance == null) {
					instance = new Singleton07();
				}
			}
		}
		return instance ;
	}
}
