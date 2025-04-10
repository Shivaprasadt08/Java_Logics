class RevStringInArr{
	public static void main(String[] args){
	String str = "Shiva";
	char[] ch = str.toCharArray();
	int i = 0 , j = ch.length-1;
	while(i < j){
	char temp = ch[i];
	 ch[i] = ch[j];
	 ch [j]= temp;
	 i++;
	 j--;
	}
	System.out.println(ch+"\n");
}
}