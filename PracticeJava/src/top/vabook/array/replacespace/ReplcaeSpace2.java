package top.vabook.array.replacespace;
/**
* @author vabook@hotmail.com
* @version 2018年7月5日 下午10:57:38
*
*/
public class ReplcaeSpace2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("how are you");
		System.out.println(replcaespace2(sb));
		StringBuffer sb2 = new StringBuffer("");
		System.out.println(replcaespace2(sb2));
		StringBuffer sb3 = new StringBuffer();
		System.out.println(replcaespace2(sb3));
	}

	private static String replcaespace2(StringBuffer sb) {
		if (sb == null || sb.length() < 1) {
			return new String("数组无效");
		}
		String string = sb.toString() ;
		String string2 = string.replace(" ", "%20");
		return string2 ;
	}

}
