package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		/* 각가의 도형을 각각의 리스트로 관리 
		 * 삼각형 삼각형리스트로 관리
		 * 원 원리스트로 관리
		 * */
		
		//삼각형 만들기
		Triangle t01 = new Triangle(5, 5, "빨강", "빨강");
		Triangle t02 = new Triangle(10, 10, "노랑", "노랑");
		Triangle t03 = new Triangle(15, 15, "주황", "주황");
		Triangle t04 = new Triangle(20, 20, "주황", "주황");
		
		
		//원 만들기
		Circle c01 = new Circle(100, "파랑", "파랑");
		Circle c02 = new Circle(90, "파랑", "파랑");
		
		
		
		//삼각형 관리
		ArrayList<Triangle> tList = new ArrayList<Triangle>();
		tList.add(t01);
		tList.add(t02);
		tList.add(t03);
		tList.add(t04);
		
		//tList.add(c01);
		
		//t01.draw();
		//t02.draw();
		
		for(int i=0; i<tList.size()  ; i++) {
			 /*
			 Triangle tmp = tList.get(i);
			 tmp.draw();
			 */
			 
			 tList.get(i).draw();
			 
		}
		//////////////////////////////////////////////////
		
		//원 관리
		ArrayList<Circle> cList = new ArrayList<Circle>();
		
		cList.add(c01);
		cList.add(c02);
		//cList.add(t01);
		
		for(int i=0; i<cList.size(); i++ ) {
			cList.get(i).draw();
		}
		
		
		/**************************************************
		* remove() 오버로딩   확인
		**************************************************/
		//사각형 1개지우기 방번호
		tList.remove(2);
		for(int i=0; i<tList.size(); i++) {
			tList.get(i).draw();
		}
		
		System.out.println("---------------------------");
		
		//사각형 1개지우기 주소값
		tList.remove(t01);
		for(int i=0; i<tList.size(); i++) {
			tList.get(i).draw();
		}

		
	}

}
