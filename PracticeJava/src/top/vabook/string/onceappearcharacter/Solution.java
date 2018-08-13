package top.vabook.string.onceappearcharacter;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author vabook@163.com
 * @version 2018年8月13日 下午11:15:10
 * 在字符串中找出只出现一次的字符
 * 遍历,第一次循环有点像mapreduce的wordcount,但不同的是用LinkedHashMap
 * 
 */
public class Solution {
	public static void onceAppeaerChar(String string) {
		if (string == null) {
			System.out.println("空字符串!");
		}
		char[] arr = string.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		for(char a : arr) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			}else {
				map.put(a, 1);
			}
		}
		 Set<Map.Entry<Character, Integer>> eSet= map.entrySet();
		 for(Map.Entry<Character, Integer> entry : eSet) {
			 if(entry.getValue() == 1) {
				 System.out.println("第一个出现的字符是 :" + entry.getKey());
				 break;
			 }else {
				continue;
			}
		 }
		
	}
	public static void main(String[] args) {
		String string = "google";
		onceAppeaerChar(string);
	}
}
