package top.vabook.singleton;
/**
* @author vabook@hotmail.com
* @version 2018年7月3日 下午9:16:50
*
*/
//饿汗式,不加final修饰,改成静态代码块
public class Singleton04 {
	private static Singleton04 instance  = null;
	private Singleton04(){}
	static{
		instance = new Singleton04();
	}
	public static Singleton04 GetInstance(){
		return instance ;
	}
}
