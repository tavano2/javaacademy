package org.Progremers;

public class Sum_Sum {

	 public long solution(int a, int b) {
	      long answer = 0;
	      
	      for (int i =0 ; i < 5 ; i ++){
	          if(a>b) {
	        	  answer = (a+i)-(b+i);
	        	  
	          }else if (a<b) {
	        	  answer = (b+i)-(a+i);
	        	  
	          }else if (a==b) {
	        	  answer = a;
	          } 
	      } 

		return answer;
  }
}
