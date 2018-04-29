package com.medical.utils;

import java.security.MessageDigest;

public class JblogUtil {
		public JblogUtil() {
		}
		private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D",
				"E", "F" };
		/**
		 * 转换字节数组为16进制字串
		 * 
		 * @param b
		 *            字节数组
		 * @return 16进制字串
		 */

		private static String byteArrayToHexString(byte[] b) {
			StringBuffer resultSb = new StringBuffer();
			for (int i = 0; i < b.length; i++) {
				// 若使用本函数转换则可得到加密结果的16进制表示，即数字字母混合的形式
				resultSb.append(byteToHexString(b[i]));
			}
			return resultSb.toString();
		}

		/**
		 * byte 类型转换成16进制字符串
		 * 
		 * @param b
		 * @return
		 */
		private static String byteToHexString(byte b) {
			int n = b;
			if (n < 0)
				n = 256 + n;
			int d1 = n / 16;
			int d2 = n % 16;
			return hexDigits[d1] + hexDigits[d2];
		}

		/**
		 * 只加密密码方法
		 * 
		 * @param password
		 *            用户输入的密码
		 * @return resultString 将密码加密后的密文
		 */
		public static String EncryptPassword(String password) {
			String resultString = null;
			try {
				resultString = new String(password);
				MessageDigest md = MessageDigest.getInstance("MD5");
				resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
			} catch (Exception ex) {

			}
			return resultString;
		}

		/**
		 * 将（用户名+密码）同时加密，做为一个密文串存于数据库中
		 * 
		 * @param user
		 *            用户输入的用户名
		 * @param password
		 *            用户输入的密码
		 * @return resultString 将（用户名+密码）加密后的密文
		 */
		public static String EncryptUserAndPassword(String user, String password) {
			String origin = user + password;
			String resultString = null;
			try {
				resultString = new String(origin);
				MessageDigest md = MessageDigest.getInstance("MD5");
				resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
			} catch (Exception ex) {

			}
			return resultString;
		}

		/**
		 * 验证登录用户所输入的用户名与密码是否正确， 此方法需要首先查询出该用户在数据库中所存储的密文
		 * 
		 * @param user
		 *            用户输入的用户名
		 * @param password
		 *            用户输入的密码
		 * @param encryptPassword
		 *            由数据库中查询到的用户加密后的密码串
		 * @return boolean 验证通过返回true;否则返回false;
		 */
		public static boolean CheckEncryptUserAndPassword(String user, String password, String encryptPassword) {
			String origin = user + password;
			String resultString = null;
			try {
				resultString = new String(origin);
				MessageDigest md = MessageDigest.getInstance("MD5");
				resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
			} catch (Exception ex) {

			}
			if (resultString != null && resultString.equals(encryptPassword)) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * 验证登录用户所输入的密码是否正确， 此方法需要首先查询出该用户在数据库中所存储的密文
		 * 
		 * @param password
		 *            用户输入的密码
		 * @param encryptPassword
		 *            由数据库中查询到的用户加密后的密码串
		 * @return boolean 验证通过返回true;否则返回false;
		 */
		public static boolean CheckEncryptPassword(String password, String encryptPassword) {
			String resultString = null;
			try {
				resultString = new String(password);
				MessageDigest md = MessageDigest.getInstance("MD5");
				resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
			} catch (Exception ex) {

			}
			if (resultString != null && resultString.equals(encryptPassword)) {
				return true;
			} else {
				return false;
			}
		}

		public static void main(String[] args) {
			// 用户名
			String user = "tom123456";
			// 密码
			String password = "abc123";

			// 密码（password）的密文
			String encryptPassword = "E10ADC3949BA59ABBE56E057F20F883E";
			// （用户+密码）（userpassword）的密文
			String encryptUserAndPassword = "E10ADC3949BA59ABBE56E057F20F883E";
		}

}
