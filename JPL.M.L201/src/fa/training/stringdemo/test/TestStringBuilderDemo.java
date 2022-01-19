/**
* 
*	author: Nguyễn Đức Phú
*	date   Jan 20, 2022
*	Lab 802
*
*/
package fa.training.stringdemo.test;

import fa.training.stringbufferdemo.StringBufferExample;
import fa.training.stringbuilderdemo.StringBuilderExample;

public class TestStringBuilderDemo {
	public static void main(String[] args) {
		StringBuilderExample stringBuilder = new StringBuilderExample();
		StringBufferExample stringBuffer = new StringBufferExample();
		stringBuilder.demonstrateStringBuilder();
		stringBuffer.demonstrateStringBuffer();
	}
}
