package com.medical.utils;

public class StringUtils {
public static boolean isNotBlank(String str){
	boolean b = false;
	if(str!=null&&str.length()>0){
		b=true;
	}
	return b;
}


public static boolean isBlank(String str){
	boolean b = !isNotBlank(str)?false:true;
	return b;
}
}
