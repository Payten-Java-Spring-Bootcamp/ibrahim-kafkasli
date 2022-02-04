package com.ibrahim.homework4;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Homework4Application {

	public static Boolean findDoubleR(int i, char[] array){
		if(array[i] == 'R' && array[i+1] == 'R'){
			return true;
		}
		return false;
	}

	public static Boolean findDoubleL(int i, char[] array){
		if(array[i] == 'L' && array[i+1] == 'L'){
			return true;
		}
		return false;
	}

	public static Boolean findR(int i, char[] array){
		if(array[i] == 'R' ){
			return true;
		}
		return false;
	}

	public static Boolean findL(int i, char[] array){
		if(array[i] == 'L'){
			return true;
		}
		return false;
	}

	public static Boolean isLength(int i, char[] array){
		if(i<=array.length-1){
			return true;
		}
		return false;
	}


	public static void main(String[] args) {
		//SpringApplication.run(Homework4Application.class, args);
		String G = "LRRLRLRLRLRLRLLLLR";
		int counter = 0;
		char[] array =G.toCharArray();
		for(int i=0; i<array.length; i++){
			if (findR(i, array)) {
				i++;
				if (findL(i, array)){
					counter++;
					continue;
				}
				else{
					i++;
					if (findDoubleL(i,array)){
						i++;
						counter++;
						continue;
					}
				}
			}
			else{
				i++;
				if(findR(i,array)){
					counter++;
					continue;
				}
				else{
					i++;
					if(findDoubleR(i,array)){
						i++;
						counter++;
						continue;
					}
				}
			}
		}
		System.out.println(counter);
	}

}
