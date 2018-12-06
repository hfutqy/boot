package com.qiyu.boot.test;

/**
 * @author qiyu
 * @date 2018/11/27
 */
public class Test3 {
	public static void main(String[] args) {
		getAllSubstrings("abcd");
	}

	static void getAllSubstrings(String str) {

		if (str.length() != 0) {
			for (int i = 0; i < str.length(); i++) {
				for (int j = i+1; j < str.length(); j++) {
					String out = str.substring(i, j);
					out = out+" ";
					System.out.println(out);
				}
			}
		}
	}
}
