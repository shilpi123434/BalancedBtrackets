package com.balancedbrackets.main;

import java.util.Stack;

public class Balancedbrackets {

	public boolean areBracketsBalanced(String exp) {
		
		// creating new object for stack class 
		Stack<Character>stack = new Stack <Character>();
		
		// iterating through the  input string 
		
		
		for ( int i =0; i< exp.length();i++) {
			
			// storing character per iteration
			
			char ele= exp.charAt(i);
			
			// checking for opening brackets and push into stack
			
			if(ele=='(' || ele=='{' || ele=='[')
				stack.push (ele);
			if(stack.isEmpty()) {
				
				return false;
				
				
				}

				// initialising char variable for storing char at top of the stack
				
				char check;
				
				// checking char at top of stack for every  closing brackets 
				
				switch (ele) {
				
				case')':
					check = stack .pop();
					if( check !='(')
						//returning  false status  if  a different type of opening is there
						
						return false;
					break;
				case'}':
					check = stack .pop();
					
					if( check !='{')
						
						return false;
					break;
					
				case'[':
					check = stack .pop();
					
					if( check !=']')
						
						return false;
					break;
					
					
						
						
					
						
						
				
			}
		}
		return stack.isEmpty();
		
		
		
		
		// TODO Auto-generated method stub
		

	}
}
