package Duotai;

import java.util.*;

public class ColaEmployee {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String string=in.next();
		boolean flag=true;
		for(int i=0;i<string.length();i++){
		if(string.charAt(i)<'0'||string.charAt(i)>'9'){
		flag=false;
		}
		}
		if(flag){
		System.out.println("能转化为数字");
		}else{
		System.out.println("不能转化为数字");
		}
	}

}
