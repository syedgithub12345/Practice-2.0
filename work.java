// //kadane algorithm
// public class work {
//     public static int maxSubarraySum(int[] arr, int n) {
//         int maxsum=0;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[i];
//             }
//             if(sum>maxsum){
//                 maxsum=sum;
//             }
//         }return maxsum;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 3, 4, 5,-1 };
//         int n = arr.length;
//         System.out.println(maxSubarraySum(arr, n));
//     }
// }

//kadane algo optimized

// public class work{
//     public static int maxsubarraysum(int[] arr,int n){
//         int maxsum=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[i];
//             }
//             if(sum>maxsum){
//                 maxsum=sum;
//             }
//         }
//         return maxsum;
//     }
//     public static void main(String[] args) {
//         int[] arr = { 3, 4, 5,-1 };
//         int n=arr.length;
//         System.out.println(maxsubarraysum(arr,n));
//     }
// }


// //bfs
// import java.util.*;
// public class work{
//     public static ArrayList<>() bfsofgraph(int V, ArrayList<ArrayList<Integer>> adj){
//         ArrayList<Integer> bfs=new ArrayList<>();
//         boolean visited[]=new boolean[V];
//         Queue<Integer> q=new LinkedList<>();

//         q.add(0);
//         visited[0]=true;

//         while(!q.isEmpty()){
//             int node=q.poll();
//             bfs.add(node);

//             for(Integer it:adj.get(node)){
//                 if(visited[it]==false){
//                     visited[it]=true;
//                     q.add(it);
//                 }
//             }
//         }
//         return bfs;
//     }
// }

// import java.util.*;
// public class work{
//     public ArrayList<Integer> dfsgraph(int V, ArrayList<ArrayList<Integer>> adj){
//         ArrayList<Integer> dfs=new ArrayList<>();
//         boolean visited[]=new boolean[V];
//         for(int i=0;i<V;i++){
//             if(!visited[i]){
//                 dfs(i,adj,visited,dfs);
//             }
//         }
//         return dfs;
//     }
//     private void dfs(int node,ArrayList<Integer>, boolean[] visited,ArrayList<Integer> dfs){
//     visited[node]=true;
//     dfs.add(node);
//     for(int neighbor:adj.get(node)){
//         if(!visited[neighbor]){
//             dfsgraph(neighbor, null)
//         }
//     }
//     }
// }

// import java.util.*;
// public class work{
//     public static int firstpositive(int[] nums){
//         Arrays.sort(nums);
//         int missingno=1;
//         for(int num:nums){
//             if(num>0){
//                 if(num==missingno){
//                     missingno++;
//                 }
//                 else if(num>missingno){
//                     break;
//                 }
//             }}
//             return missingno;
//     }
//     public static void main(String[] args) {
//         int[] nums={3,43,1,2,3,4,5};
//         System.out.println(firstpositive(nums));
//     }
// }


// public class LL{
//     Node head;
//     class Node{
//         String data;
//         Node next;
//         Node(String data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     void addfirst(String data){
//         Node newnode=new Node(data);
//         if(head==null){
//             head=newnode;
//             return;
//         }
//         head.next=head;
//         head=newnode;
//     }

//     void addlast(String data){
//         Node newnode=new Node(data);
//         if(head==null){
//             head=newnode;
//             return;
//         }
//         Node curNode=head;
//         while(curNode.next!=null){
//             curNode=curNode.next;
//         }
//         curNode.next=newnode;
//     }
//     void print(){
//         if(head==null){
//             return;
//         }
//         Node curNode=head;
//         while(curNode!=null){
//             System.out.print(curNode.data+" ->");
//             curNode=curNode.next;
//         }
//         System.out.println("Null");
//     }
//     void reverse(){
//         if(head==null || head.next==null){
//             return;
//         }
//         Node prevnode=head;
//         Node currNode=head.next;
//         while (currNode!=null){
//             Node nexNode=currNode.next;
//             currNode.next=prevnode;

//             prevnode=currNode;
//             currNode=nexNode;
//         }
//         head.next=null;
//         head=prevnode;
//     }
    
// }


// import java.util.*;
// public class work{
//     public static boolean valid(String s)
//     Stack<Character> stack=new Stack<>();

//     for(char c:s.toCharArray()){
//         if(c=='('|| c=='{'|| c=='['){
//             stack.push(c);
//         }
//         else if(c==')'|| c=='}'|| c==']'){
//             if(stack.isEmpty()){
//                 return false;
//             }
//             char top=stack.pop();
//             if(c==')'&& top!='(' && c=='}'&& top!='{'|| c==']'&& top!='['){
//                 return false;
//             }
//         }
//     }
//     return stack.isEmpty();
// }