package common;

import java.io.UnsupportedEncodingException;

public class ChinaUnit
{
    public static String getChina(String value)
    {
        try {
            return new String(value.getBytes("8859_1"),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return value;
    }
    
    public static String getJnFormat(String value[],String mark) {
    	if (value==null) {
			return null;
		}
    	String v=" ";
    	for (int i = 0; i < value.length; i++) {
			v=v+value[i]+mark;
		}
    	if (v.length()!=0) {
			v=v.substring(0,v.length()-1);
		}
		return v;
	}
}
