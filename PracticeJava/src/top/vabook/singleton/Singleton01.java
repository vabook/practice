package top.vabook.singleton;
/**
* @author vabook@hotmail.com
* @version 2018年7月3日 下午9:16:50
*
*/
//懒汉式
public class Singleton01 {
	private static Singleton01 instance ;
	private Singleton01(){}
	
	public static Singleton01 GetInstance(){
		if (instance == null) {
			instance = new Singleton01();
		}
		return instance ;
	}
}
