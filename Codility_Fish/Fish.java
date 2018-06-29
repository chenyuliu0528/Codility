// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//100/100/100
import java.util.Stack;

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int fish_num = 0;
        Stack st = new Stack();
        
        for (int i = 0; i < A.length; i++) {


            while (B[i] == 0 && !st.isEmpty()){
                System.out.println("Fish: "+(i+1)+" run upstream meet "+((int)st.peek()+1)) ;
                int stack_fish = (int)st.pop();
                if (A[stack_fish] > A[i]){
                    System.out.println((i+1)+" has been eaten") ;
                    st.push(stack_fish);
                    break;
                } 
                System.out.println((i+1) +"won") ;
            }
            if (B[i] == 0 && st.isEmpty()) {
                fish_num++;
                System.out.println("Fish: "+(i+1)+" run away -> upstream");
            }
            if (B[i] == 1) {
                st.push(i);
                System.out.println("Fish: "+(i+1)+" flowing -> downstream in stack");
            }
        }
        return fish_num + st.size();
    }
}


// //V1

// // you can also use imports, for example:
// // import java.util.*;

// // you can write to stdout for debugging purposes, e.g.
// // System.out.println("this is a debug message");
// import java.util.Stack;

// class Solution {
//     public int solution(int[] A, int[] B) {
//         // write your code in Java SE 8
//         int fish_num = 0;
//         Stack st = new Stack();
//         for (int i = 0; i < A.length; i++) {
//             if (B[i] == 1) {
//                 st.push(i);
//             }
//             if (B[i] == 0 && st.isEmpty()) {
//                 fish_num++;
//             }
//             while (B[i] == 0 && !st.isEmpty()){
//                 int stack_fish = (int)st.pop();
//                 if (A[stack_fish] > A[i]){
//                     st.push(stack_fish);
//                     break;
//                 } 
//                 fish_num ++;
//             }
//         }
//         return fish_num + st.size();
//     }
// }

/****Internet */
// // you can also use imports, for example:
// import java.util.*;

// // you can use System.out.println for debugging purposes, e.g.
// // System.out.println("this is a debug message");

// class Fish {
//     public static void main(String Args[]){
//         int[] A = {1,2,3,4,5,7,6,9,8,10};
//         int[] B = {0,0,1,0,1,0,0,0,1,0};
//         System.out.println(solution(A,B));
//         System.out.println("------------------------------");
//         System.out.println(solution2(A,B));
//     }

// 	public static int solution(int[] A, int[] B) {

// 		int count = 0;
// 		Stack < Integer > previousFishes = new Stack < Integer > ();

// 		for (int i = 0; i < A.length; i++) {
// 			int currentFish = A[i];
// 			int currentFlow = B[i];
// 			if (currentFlow == 1) {
//                 System.out.println(currentFish+"向下游流動");
// 				previousFishes.push(currentFish);
// 			}
// 			if (!previousFishes.empty() && currentFlow == 0) {
// 				while (!previousFishes.empty() && currentFish > previousFishes.peek()) {
//                     System.out.println(currentFish+"向上游流動吃了"+previousFishes.peek());
// 					previousFishes.pop();
// 				}
// 			}
// 			if (previousFishes.empty() && currentFlow == 0) {
//                 count++;
//                 System.out.println(currentFish+"向上游，沒有魚往下，游走");
// 			}
// 		}
// 		return count + previousFishes.size();
//     }
    
//     public static int solution2(int[] A, int[] B) {

// 		int count = 0;
// 		Stack < Integer > previousFishes = new Stack < Integer > ();

// 		for (int i = 0; i < A.length; i++) {
// 			int currentFish = A[i];
// 			int currentFlow = B[i];
// 			if (currentFlow == 0) {
//                 System.out.println(currentFish+"fish flowing upstream");
// 				previousFishes.push(currentFish);
// 			}
// 			if (!previousFishes.empty() && currentFlow == 1) {
// 				while (!previousFishes.empty() && currentFish > previousFishes.peek()) {
//                     System.out.println(currentFish+"fish flowing downstream ate"+previousFishes.peek());
//                     previousFishes.pop();
                    
// 				}
// 			}
// 			if (previousFishes.empty() && currentFlow == 1) {
//                 count++;
//                 System.out.println(currentFish+"run away");
// 			}

// 		}
// 		return count + previousFishes.size();
// 	}
// }