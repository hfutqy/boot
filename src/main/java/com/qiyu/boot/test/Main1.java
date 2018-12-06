package com.qiyu.boot.test;

/**
 * @author qiyu
 * @date 2018/11/24
 */
public class Main1 {
	public static void main(String[] args) {


	}

	class InnerClass{
		public InnerClass() {
		}
	}

	static class StaticInnerClass{
		public StaticInnerClass() {
		}
	}
}

class B{
	public static void main(String[] args) {
		Main1 main1 = new Main1();
		Main1.InnerClass innerClass = main1.new InnerClass();


		Main1.StaticInnerClass staticInnerClass = new Main1.StaticInnerClass();
	}

}
