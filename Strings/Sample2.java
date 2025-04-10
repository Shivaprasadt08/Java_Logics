class Sample2{
	static void revVowels(String str){
	String res = "";
	str = str.replaceAll("[^ aeiouAEIOU]","");
	for(int i = str.length()-1; i>=0; i--){
		res += str.charAt(i);
	}
	System.out.println(res);
	}
	public static void main(String[] args){
	revVowels("MethodOverloading");
	}
}