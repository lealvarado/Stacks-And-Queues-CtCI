
public class ProblemNumberOne {
	
	//QUESTION: Describe how you could use a single array to implement three stacks
	
	//ANSWER: A stack is Last In First Out. To simualate a stack using a single array: 
	//		- You would need to check that your array has room to grow
	//		- Every new element would be array[0] and all the other elements would be changed to array[i + 1]
	//      - You would need to save the next variable in the list
	//  	something similar to :
	//			current = array[0]
	//			for(int i = 0; i < array.size; i++){
	//					
	//					next = array[i + 1];
	//					if(i = 0){
	//						array[i] = inpuy;
	//						array[i + 1] = current;
	//					} else{
	//						array[i + 1] = current;
	//						current = next;
	// 					}
	//      - Copy of 

}
