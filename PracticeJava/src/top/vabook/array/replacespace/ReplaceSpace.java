package top.vabook.array;

/**
 * @author vabook@hotmail.com
 * @version 2018年7月5日 下午10:43:33
 *
 */
public class ReplaceSpace {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("how are you");
		System.out.println(replacespace(s));
		StringBuilder s1 = new StringBuilder("");
		System.out.println(replacespace(s1));
		StringBuilder s2 = new StringBuilder();
		System.out.println(replacespace(s2));
	}

	private static StringBuilder replacespace(StringBuilder s) {
		if(s == null || s.length() < 1){
			return new StringBuilder("数组无效");
		}
		char[] cc = s.toString().toCharArray();
		StringBuilder ss = new StringBuilder();
		for(char c : cc){
			if (c == ' ') {
				ss.append("%20");
			}else{
				ss.append(c);
			}
		}
		return ss ;
	}
}