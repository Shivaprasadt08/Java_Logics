class Sample1{
	static void PaliString(String str){
		String res="";
		for(int i = str.length() - 1; i >= 0; i--){
			res += str.charAt(i);
		}
		//old_var.equalsIgnoreCase(new_var) inbuilt function use to ingnore the all case sensitives.
		if(str.equalsIgnoreCase(res)){
			System.out.println(str +" is Palindrome");
		}
		else{
			System.out.println(str +" is not Palindrome");
		}
	}
	public static void main(String[] args){
		PaliString("Malayalam");
	}
}