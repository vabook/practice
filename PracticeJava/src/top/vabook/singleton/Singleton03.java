package top.vabook.singleton;
/**
* @author vabook@hotmail.com
* @version 2018年7月3日 下午9:16:50
*
*/
//饿汗式,加final修饰
public class Singleton03 {
	private final static Singleton03 instance  = new Singleton03();
	private Singleton03(){}
	
	public static Singleton03 GetInstance(){
		return instance ;
	}
}
