import java.io.*;
import java.awt.*;
import java.util.Arrays;
import java.util.*;


public class DataAct {
	public static void main(String[] args)throws IOException {
    Scanner sc = new Scanner(System.in);
	boolean loop1 = true;
	while(loop1==true){
    
	System.out.println("A. Hello: Ask the name of the user");
	System.out.println("B. Array: Input Elements and search for a specified key and prints a message.");
	System.out.println("C. MagicSquare: Display [7][7] magic square. ");
	System.out.println("D. BubbleSort: Alphabetically sorts 20 employees using bubble sort. ");
	System.out.println("E. SelectionSort: Alphabetically sorts 20 employees using Selection sort. ");
	System.out.println("F. InsertionSort: Alphabetically sorts 20 employees using Insertion sort. ");
	System.out.println("G. Performs the merge sort of a two class data base.");
	System.out.println("H. Stack_1 Perform reversal of String." );
	System.out.println("I. Stack_2 Perform Infix notation or PostFix notation.");
	System.out.println("J. LinkedList: ..");
	System.out.println("K. Queue:...");	
    System.out.println("L. TREE ORDER : PostOrder, PreOrder and InOrder");
    System.out.println("M. Recursion : Triangle");
    System.out.println("N. Exit");
    String Iuser = sc.nextLine();
	if(Iuser.equalsIgnoreCase("A")){
    System.out.println("Hello Program!");
    System.out.print("Please Enter Your Name : ");
    Scanner sd = new Scanner(System.in);
    String name = sd.nextLine();
    System.out.println("Hello" + name +"! This is my first Java Program" );
	}
	if(Iuser.equalsIgnoreCase("B")){
	 	Scanner sdc = new Scanner(System.in);
		int numb;
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int ew = 10;
		
		
		for(int j = 0;j<ew;j++)
		System.out.print(arr[j]+" ");
		System.out.println(" ");
			
		System.out.println("Enter For Search Number number " );
		numb = sdc.nextInt();
		
		
		for(int j=0;j<ew;j++){
		
		
		if(arr[j]==numb)
			break;
		if(j==arr.length){
		
		System.out.println("Can't Found " + numb);}
		else{
		
		System.out.println("Found " +numb);}
		System.out.println("Enter Number to be deleted");
		int numb1 = sdc.nextInt();
		for(j=0;j<ew;j++)
		
		if(numb1==arr[j])
		break;
		for(int y=j;y<ew-1;y++)
		
		arr[y] = arr[y+1];
		ew--;
		
		
		for( j=0;j<ew;j++)
		
		System.out.print(arr[j]+ " ");
		System.out.println();				
		
	}	

	
	
	}
if(Iuser.equalsIgnoreCase("C")){ 
int cc = 7;
if (cc % 2 == 0) throw new RuntimeException("n must be odd");

int[][] magic = new int[cc][cc];

int row = cc-1;
int col = cc/2;
magic[row][col] = 1;

for (int i = 2; i <= cc*cc; i++) {
if (magic[(row + 1) % cc][(col + 1) % cc] == 0) {
row = (row + 1) % cc;
col = (col + 1) % cc;
}
else {
row = (row - 1 + cc) % cc;

}
magic[row][col] = i;
}


for (int i = 0; i < cc; i++) {
for (int j = 0; j < cc; j++) {
if (magic[i][j] < 10) System.out.print(" ");
if (magic[i][j] < 100) System.out.print(" "); 
System.out.print(magic[i][j] + " ");
}
System.out.println();
}



}
if(Iuser.equalsIgnoreCase("D")){
String temp;
String [] emp = {"Suma","Gorg","Mira","Ary","Gina","Curso","clap","fool","Virgo","Exclmur","Jurger","truue","reyth","retytb","Uyre","Goufe","Ghasol","efera","rtyuwei","opdwa"};
System.out.println("NOT SORTED!");
for(int i = 0 ; i<emp.length;i++){

System.out.print(emp[i] + " ");
System.out.println();
}
for(int x = 0;x<emp.length;x++){
for(int j = 0;j<emp.length-1;j++){
if(emp[j].compareTo(emp[j+1]) > 0){

temp = emp[j];
emp[j] = emp [j+1];
emp[j+1] = temp; }
}
}
System.out.println("SORTED!");
for(int x = 0 ; x<emp.length;x++){
System.out.print(emp[x]+ " ");
System.out.println();
}

}
if(Iuser.equalsIgnoreCase("E")){
String arr [] ={"Suma","Gorg","Mira","Ary","Gina","Curso","clap","fool","Virgo","Exclmur","Jurger","truue","reyth","retytb","Uyre","Goufe","Ghasol","efera","rtyuwei","opdwa"};	
System.out.println("Unsorted Array");
for(int o = 0; o<arr.length;o++){
System.out.println(arr[o]+" ");
}

    
        sort(arr);
        System.out.println("Sorted array");
        printArray(arr);
}
if(Iuser.equalsIgnoreCase("F")){
String [] a = {"Suma","Gorg","Mira","Ary","Gina","Curso","clap","fool","Virgo","Exclmur","Jurger","truue","reyth","retytb","Uyre","Goufe","Ghasol","efera","rtyuwei","opdwa"};	
System.out.println("NOT SORTED");
	for(int j=0;j<a.length;j++)
		System.out.print(a[j]+" ");
	for(int i=1;i<a.length;i++){
		  String temp = a[i];
		  int j = i-1;			
		
		while(j>=0 && a[j].compareTo(temp)>0){
			a[j+1] = a[j];
			j--; 
		}
		a[j+1] = temp;}
	System.out.println(" ");
	System.out.println("SORTED");
		for(int j=0;j<a.length;j++)
		System.out.print(a[j]+" ");
}
if(Iuser.equalsIgnoreCase("G")){
	Scanner v = new Scanner(System.in);
        int length_of_array;
		Scanner in=new Scanner(System.in);
		System.out.print("How many numbers do you want to sort ? ");
		length_of_array=in.nextInt();
		int A []=new int[length_of_array],i;
		for(i=0;i<length_of_array;++i)
		{
			A[i]=(int)(Math.random()*100);
			System.out.print(A[i]+" ");
		}
		A=MergeSort(A);
		System.out.println();
		for(i=0;i<length_of_array;++i)
		{
			System.out.print(A[i]+" ");
			
		}
		System.out.println(" ");
}
if(Iuser.equalsIgnoreCase("H")){
	        Scanner vr = new Scanner(System.in);
	        System.out.println("Enter the word that you want to shuffle");
	        String an = vr.nextLine();
	        anag(an," ");
}
if(Iuser.equalsIgnoreCase("I")){
  Scanner st = new Scanner(System.in);
  System.out.print("EXPRESSION : ");
  String expression = st.nextLine();
  PostfixEval ert = new PostfixEval(expression);
}
if(Iuser.equalsIgnoreCase("L")){
	System.out.println("The Variables Are : 10 , 20 , 30 , 40 , 50 , 60"); 
	System.out.println("Post Order!");

		TreeNode rootNode=createBinaryTree();
		System.out.println("Using PostOrder solution:");
 
		postOrder(rootNode);
 
		System.out.println();	
	System.out.println("InOrder!");

		NodeRoot rootNodes=createBinaryTrees();
		System.out.println("Using Inorder:");
 
		inOrder(rootNodes);
 
		System.out.println();
		
		TreeNodes rootNodess=createBinaryTreess();
		System.out.println("Using PreOrder: ");
 
		preorder(rootNodess);
     	System.out.println();
}
if(Iuser.equalsIgnoreCase("J")){
boolean loop2=true;
   Scanner st = new Scanner(System.in);
		LinkedList<String> li = new LinkedList<String>();
	li.add("Reynan");
	li.add("Mitsu");
	li.add("PAPAS");
	li.add("Ketchup");
	li.add("Tomato");
	li.add("SALAD");

	do{
 	
 
	System.out.println("[A]Add ");
	System.out.println("[B]Removed");
	System.out.println("[C]Search");
	System.out.println("[D]Display");
	System.out.println("[E]EXIT");
	String b = st.nextLine();
	if(b.equalsIgnoreCase("A")){
	System.out.println("Enter The name that will be add.");
	Scanner sr = new Scanner(System.in);
	String atys = sr.nextLine();
	li.add(6,atys);
	}
	else if(b.equalsIgnoreCase("B")){
			Scanner se = new Scanner(System.in);
	System.out.println("Enter the name that will be removed");
 
	String removing = se.nextLine();
	int ba = li.indexOf(removing);
	li.remove(removing);
	}
	else if(b.equalsIgnoreCase("C")){
			Scanner sd = new Scanner(System.in);
	System.out.println("Enter the Name that will be search");
	String search = sd.nextLine();
	boolean contains = li.contains(search);
	if(contains){
		System.out.println("Found at index " + li.indexOf(search));
	}
	else {
		System.out.println("can't Find");
	}
	}
	else if(b.equalsIgnoreCase("D")){
	System.out.println(li);
	}
	else if(b.equalsIgnoreCase("E")){
		loop2 = false;

	}
	else{
	}
	}while(loop2==true);
	
}
if(Iuser.equalsIgnoreCase("K")){
 QueAr theQueue = new QueAr(5); 
      theQueue.insert(10);            
      theQueue.insert(20);
      theQueue.insert(30);
      theQueue.insert(40);
      theQueue.remove();           
      theQueue.remove();              
      theQueue.remove();
      theQueue.insert(50);           
      theQueue.insert(60);            
      theQueue.insert(70);
      theQueue.insert(80);
      while( !theQueue.isEmpty() )   
         {                           
         long n = theQueue.remove();  // (40, 50, 60, 70, 80)
         System.out.print(n);
         System.out.print(" ");
         }
      System.out.println("");
}
	
if(Iuser.equalsIgnoreCase("N")){
	System.exit(0);
}
if(Iuser.equalsIgnoreCase("M")){
	TriangleApp ble = new TriangleApp();
	Scanner st = new Scanner(System.in);
		System.out.print("Enter a number: ");
				int theNumber = st.nextInt();
				int theAnswer = ble.triangle(theNumber);
				System.out.println("Triangle=" + theAnswer);
}


	}
	}//end of main
		public static int[] MergeSort(int [] A)
	{
		if(A.length==1)
		return A;
		else
		{
			int n=(int) Math.floor(A.length/2);
			int B []=new int [n];
			int C []=new int [A.length-n];
			int i;
			for(i=0;i<A.length;++i)
			{
				if(i<n)
					B[i]=A[i];
				else
					C[i-n]=A[i];
			}
			B=MergeSort(B);
			C=MergeSort(C);
			A=Merge(B,C);
			return A;
		}
	}
	public static int [] Merge(int [] A,int [] B)
	{
		int C []=new int [A.length+B.length];
		int i,a=0,b=0;
		for(i=0;i<A.length+B.length;++i)
		{
			if(a==A.length)
			{
				C[i]=B[b];
				++b;
			}
			else 
			if(b==B.length)
			{
				C[i]=A[a];
				++a;
			}
			else 
			if(A[a]>B[b])
			{
				C[i]=B[b];
				++b;
			}
			else
			{
				C[i]=A[a];
				++a;
			}
		}
		return C;		
	}
		    public static void anag(String s1, String s2)  {
	        if(s1.length() == 0)    {
	            System.out.println(s2);
	        }
	        for(int i = 0; i < s1.length(); i++) {
	            anag(s1.substring(0, i) + s1.substring(i+1, s1.length()), s1.charAt(i) + s2);
	        }
    }
    public static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data)
		{
			this.data=data;
		}
	}
   public static void postOrder(TreeNode root) {
		if(root !=  null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.printf("%d ",root.data);
		}
	}
	public static TreeNode createBinaryTree()
	{
 
		TreeNode rootNode =new TreeNode(40);
		TreeNode node20=new TreeNode(20);
		TreeNode node10=new TreeNode(10);
		TreeNode node30=new TreeNode(30);
		TreeNode node60=new TreeNode(60);
		TreeNode node50=new TreeNode(50);
		TreeNode node70=new TreeNode(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
	}
	public static class NodeRoot
	{
		int data;
		NodeRoot left;
		NodeRoot right;
		NodeRoot(int data)
		{
			this.data=data;
		}
	}
	public static void inOrder(NodeRoot root) {
		if (root != null) {
			inOrder(root.left);
			System.out.printf("%d ",root.data);
			inOrder(root.right);
		}
	}
	
	public static NodeRoot createBinaryTrees()
	{
 
		NodeRoot rootNode =new NodeRoot(40);
		NodeRoot node20=new NodeRoot(20);
		NodeRoot node10=new NodeRoot(10);
		NodeRoot node30=new NodeRoot(30);
		NodeRoot node60=new NodeRoot(60);
		NodeRoot node50=new NodeRoot(50);
		NodeRoot node70=new NodeRoot(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
	}
	static	void sort(String arr[])
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {

            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].compareTo(arr[min_idx])>0)
                    min_idx = j;
 
    
            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
static	void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static TreeNodes createBinaryTreess()
	{
 
		TreeNodes rootNode =new TreeNodes(40);
		TreeNodes node20=new TreeNodes(20);
		TreeNodes node10=new TreeNodes(10);
		TreeNodes node30=new TreeNodes(30);
		TreeNodes node60=new TreeNodes(60);
		TreeNodes node50=new TreeNodes(50);
		TreeNodes node70=new TreeNodes(70);
 
		rootNode.left=node20;
		rootNode.right=node60;
 
		node20.left=node10;
		node20.right=node30;
 
		node60.left=node50;
		node60.right=node70;
 
		return rootNode;
	}
		public static void preorder(TreeNodes root) {
		if(root !=  null) {
			System.out.printf("%d ",root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	public static class TreeNodes
	{
		int data;
		TreeNodes left;
		TreeNodes right;
		TreeNodes(int data)
		{
			this.data=data;
		}
	}
  
	}
     




