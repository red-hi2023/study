package com.javaex.ex05;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		//모두담을수 있는 리스트 만들기
		ArrayList<Drawable> dList = new ArrayList<Drawable>();
		
		//삼각형, 원, 사각형, 점,  1개씩 만들기
		Drawable t01 = new Triangle(10, 10, "빨강", "빨강");
		Drawable c01 = new Circle(100, "노랑", "노랑");
		Drawable r01 = new Rectangle(50, 50, "파랑", "파랑");
		Drawable p01 = new Point(1,1);
		
		//리스트에 담기
		dList.add(t01);
		dList.add(c01);
		dList.add(r01);
		dList.add(p01);
		
		//처음부터 끝까지 돌면서 모두 그리기
		for(int i=0; i<dList.size(); i++) {
			dList.get(i).draw();
		}

		
		//면적구하기
		for(int i=0; i<dList.size(); i++) {
			if(dList.get(i) instanceof Shape) { //shape의 자식이면
				System.out.println(((Shape)dList.get(i)).area());
			}
		}

	}

}
