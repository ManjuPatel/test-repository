/**
 * 
 */
package com.technical.test;

/**
 * @author Manju
 *
 */
public class TechnicalTest {

	public static void main(String args[]) {

		// Below are the different values by using which we can test output of
		// this program
		// String originalStr ="manju patel";
		// String originalStr ="manjupatel";
		// String originalStr ="ma@n#jupa^te&l";
		// String originalStr ="manju 84 patel";
		String originalStr = "my name is manju patel";
		// String originalStr ="mynameismanjupatel";

		TechnicalTest technicalTestObj = new TechnicalTest();
		String result = technicalTestObj.encode(1, originalStr);
		System.out.println("Result for Offset 1 is: " + result);
		result = technicalTestObj.encode(-1, originalStr);
		System.out.println("Result for Offset -1 is: " + result);

	}

	// Below method is written to encode input to the desired output
	public String encode(int offset, String originalStr) {
		StringBuffer strBuffer = new StringBuffer();
		String[] splitString = originalStr.split("");
		for (int i = 0; i < splitString.length; i++) {
			strBuffer.append(convert(offset, splitString[i]));
		}
		return strBuffer.toString();
	}

	/**
	 * Below method is used to give result after converting original string on
	 * the basis of the passed positive or negative offset and original string
	 * 
	 * @param offset
	 * @param strOriginal
	 * @return
	 */
	private static String convert(int offset, String strOriginal) {
		String resultStr = "";
		if (offset == 1)
			resultStr = conversionOffsetPositive(strOriginal);

		if (offset == -1)
			resultStr = conversionOffsetNegative(strOriginal);

		return resultStr;
	}

	/**
	 * Below method is to create a result for positive offset value
	 * 
	 * @param strOriginal
	 * @return
	 */
	private static String conversionOffsetPositive(String strOriginal) {
		String convertedStr = "";
		if (strOriginal.contains("a") || "a".equals(strOriginal)) {
			convertedStr = strOriginal.replace("a", "b");
		} else if (strOriginal.contains("b") || "b".equals(strOriginal)) {
			convertedStr = strOriginal.replace("b", "c");
		} else if (strOriginal.contains("c") || "c".equals(strOriginal)) {
			convertedStr = strOriginal.replace("c", "d");
		} else if (strOriginal.contains("d") || "d".equals(strOriginal)) {
			convertedStr = strOriginal.replace("d", "e");
		} else if (strOriginal.contains("e") || "e".equals(strOriginal)) {
			convertedStr = strOriginal.replace("e", "f");
		} else if (strOriginal.contains("f") || "f".equals(strOriginal)) {
			convertedStr = strOriginal.replace("f", "g");
		} else if (strOriginal.contains("g") || "g".equals(strOriginal)) {
			convertedStr = strOriginal.replace("g", "h");
		} else if (strOriginal.contains("h") || "h".equals(strOriginal)) {
			convertedStr = strOriginal.replace("h", "i");
		} else if (strOriginal.contains("i") || "i".equals(strOriginal)) {
			convertedStr = strOriginal.replace("i", "j");
		} else if (strOriginal.contains("j") || "j".equals(strOriginal)) {
			convertedStr = strOriginal.replace("j", "k");
		} else if (strOriginal.contains("k") || "k".equals(strOriginal)) {
			convertedStr = strOriginal.replace("k", "l");
		} else if (strOriginal.contains("l") || "l".equals(strOriginal)) {
			convertedStr = strOriginal.replace("l", "m");
		} else if (strOriginal.contains("m") || "m".equals(strOriginal)) {
			convertedStr = strOriginal.replace("m", "n");
		} else if (strOriginal.contains("n") || "n".equals(strOriginal)) {
			convertedStr = strOriginal.replace("n", "o");
		} else if (strOriginal.contains("o") || "o".equals(strOriginal)) {
			convertedStr = strOriginal.replace("o", "p");
		} else if (strOriginal.contains("p") || "p".equals(strOriginal)) {
			convertedStr = strOriginal.replace("p", "q");
		} else if (strOriginal.contains("q") || "q".equals(strOriginal)) {
			convertedStr = strOriginal.replace("q", "r");
		} else if (strOriginal.contains("r") || "r".equals(strOriginal)) {
			convertedStr = strOriginal.replace("r", "s");
		} else if (strOriginal.contains("s") || "s".equals(strOriginal)) {
			convertedStr = strOriginal.replace("s", "t");
		} else if (strOriginal.contains("t") || "t".equals(strOriginal)) {
			convertedStr = strOriginal.replace("t", "u");
		} else if (strOriginal.contains("u") || "u".equals(strOriginal)) {
			convertedStr = strOriginal.replace("u", "v");
		} else if (strOriginal.contains("v") || "v".equals(strOriginal)) {
			convertedStr = strOriginal.replace("v", "w");
		} else if (strOriginal.contains("w") || "w".equals(strOriginal)) {
			convertedStr = strOriginal.replace("w", "x");
		} else if (strOriginal.contains("x") || "x".equals(strOriginal)) {
			convertedStr = strOriginal.replace("x", "y");
		} else if (strOriginal.contains("y") || "y".equals(strOriginal)) {
			convertedStr = strOriginal.replace("y", "z");
		} else {
			convertedStr = strOriginal;
		}
		return convertedStr;
	}

	/**
	 * Below method is to create a result for negative offset value
	 * 
	 * @param strOriginal
	 * @return
	 */
	private static String conversionOffsetNegative(String strOriginal) {
		String convertedStr = "";
		if (strOriginal.contains("a") || "a".equals(strOriginal)) {
			convertedStr = strOriginal.replace("a", "z");
		} else if (strOriginal.contains("b") || "b".equals(strOriginal)) {
			convertedStr = strOriginal.replace("b", "a");
		} else if (strOriginal.contains("c") || "c".equals(strOriginal)) {
			convertedStr = strOriginal.replace("c", "b");
		} else if (strOriginal.contains("d") || "d".equals(strOriginal)) {
			convertedStr = strOriginal.replace("d", "c");
		} else if (strOriginal.contains("e") || "e".equals(strOriginal)) {
			convertedStr = strOriginal.replace("e", "d");
		} else if (strOriginal.contains("f") || "f".equals(strOriginal)) {
			convertedStr = strOriginal.replace("f", "e");
		} else if (strOriginal.contains("g") || "g".equals(strOriginal)) {
			convertedStr = strOriginal.replace("g", "f");
		} else if (strOriginal.contains("h") || "h".equals(strOriginal)) {
			convertedStr = strOriginal.replace("h", "g");
		} else if (strOriginal.contains("i") || "i".equals(strOriginal)) {
			convertedStr = strOriginal.replace("i", "h");
		} else if (strOriginal.contains("j") || "j".equals(strOriginal)) {
			convertedStr = strOriginal.replace("j", "i");
		} else if (strOriginal.contains("k") || "k".equals(strOriginal)) {
			convertedStr = strOriginal.replace("k", "j");
		} else if (strOriginal.contains("l") || "l".equals(strOriginal)) {
			convertedStr = strOriginal.replace("l", "k");
		} else if (strOriginal.contains("m") || "m".equals(strOriginal)) {
			convertedStr = strOriginal.replace("m", "l");
		} else if (strOriginal.contains("n") || "n".equals(strOriginal)) {
			convertedStr = strOriginal.replace("n", "m");
		} else if (strOriginal.contains("o") || "o".equals(strOriginal)) {
			convertedStr = strOriginal.replace("o", "n");
		} else if (strOriginal.contains("p") || "p".equals(strOriginal)) {
			convertedStr = strOriginal.replace("p", "o");
		} else if (strOriginal.contains("q") || "q".equals(strOriginal)) {
			convertedStr = strOriginal.replace("q", "p");
		} else if (strOriginal.contains("r") || "r".equals(strOriginal)) {
			convertedStr = strOriginal.replace("r", "q");
		} else if (strOriginal.contains("s") || "s".equals(strOriginal)) {
			convertedStr = strOriginal.replace("s", "r");
		} else if (strOriginal.contains("t") || "t".equals(strOriginal)) {
			convertedStr = strOriginal.replace("t", "s");
		} else if (strOriginal.contains("u") || "u".equals(strOriginal)) {
			convertedStr = strOriginal.replace("u", "t");
		} else if (strOriginal.contains("v") || "v".equals(strOriginal)) {
			convertedStr = strOriginal.replace("v", "u");
		} else if (strOriginal.contains("w") || "w".equals(strOriginal)) {
			convertedStr = strOriginal.replace("w", "v");
		} else if (strOriginal.contains("x") || "x".equals(strOriginal)) {
			convertedStr = strOriginal.replace("x", "w");
		} else if (strOriginal.contains("y") || "y".equals(strOriginal)) {
			convertedStr = strOriginal.replace("y", "x");
		} else {
			convertedStr = strOriginal;
		}
		return convertedStr;
	}
}
