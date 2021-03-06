/**
 *  BOJ 11286번 Java 소스 코드
 *  작성자 : 동동매니저 (DDManager)
 *
 *  ※ 실행 결과
 *  사용 메모리 : 95,712 KB / 540,672 KB
 *  소요 시간 : 984 ms / 2,000 ms
 *
 *  Copyright 2020. DDManager all rights reserved.
 */

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		PriorityQueue<DInt> queue=new PriorityQueue<>();
		int N=sc.nextInt();
		for(int i=0;i<N;i++){
			int cmd=sc.nextInt();
			if(cmd==0) System.out.println(queue.isEmpty()?0:queue.poll().getInt());
			else queue.add(new DInt(cmd));
		}
		sc.close();
	}
}

class DInt implements Comparable<DInt>{
	private int data;
	
	public DInt(int data){
		this.data=data;
	}
	
	protected int getInt(){
		return data;
	}
	
	@Override
	public int compareTo(DInt x){
		int rX=x.getInt();
		int rY=this.getInt();
		int aX=(rX<0)?-rX:rX;
		int aY=(rY<0)?-rY:rY;
		return (aX==aY)?((rX<rY)?1:-1):((aX<aY)?1:-1);
	}
}