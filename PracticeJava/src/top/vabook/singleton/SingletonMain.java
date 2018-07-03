package top.vabook.singleton;
/**
* @author vabook@hotmail.com
* @version 2018年7月3日 下午9:37:18
*
*/
public class SingletonMain {

	public static void main(String[] args) {
		System.out.println(Singleton01.GetInstance() == Singleton01.GetInstance());
		System.out.println(Singleton02.GetInstance() == Singleton02.GetInstance());
		System.out.println(Singleton03.GetInstance() == Singleton03.GetInstance());
		System.out.println(Singleton04.GetInstance() == Singleton04.GetInstance());
		System.out.println(Singleton05.getInstance() == Singleton05.getInstance());
		System.out.println(Singleton06.INSTANCE == Singleton06.INSTANCE);
		System.out.println(Singleton07.GetInstance() == Singleton07.GetInstance());
	}

}
