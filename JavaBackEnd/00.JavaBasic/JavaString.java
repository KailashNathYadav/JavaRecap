public class JavaString {
    public static void main(String[] args) {
		//length(), substring(), + , charAt() , toUC, toLC, trim, empty, indexOf, split, startsWith()
        String s = " I am string ";
		String t = " I am another string";
        System.out.printf("%s\n%s\n",s,t);

		System.out.printf("Length of s: %d\n",s.length());
		System.out.printf("SubString of s: %s\n",s.substring(3));
		System.out.printf("SubString of s: %s\n",s.substring(1,3));//startIndex , endIndex
		System.out.printf("Lowercase: %s\n",s.toLowerCase());
		System.out.printf("Char at index 3: %s\n",s.charAt(3));
		System.out.printf("Concatenation: %s\n",s + t);
		System.out.printf("Trim: %s\n",s.trim());
		System.out.printf("isEmpty: %b\n",s.isEmpty());
		System.out.printf("isBlank: %b\n",s.isBlank());
		System.out.printf("IndexOf: %d\n",s.indexOf('s'));
		System.out.printf("lastIndexOf: %d\n",t.lastIndexOf('a'));
		System.out.printf("equals: %b\n",s.equals(t));
		System.out.printf("compareTo: %s\n",s.compareTo(t));
		System.out.printf("toCharArray: %s\n",s.toCharArray());
		System.out.printf("Replace: %s\n",s.replace("I am", "I`m"));
		System.out.printf("startsWith: %s\n",t.startsWith(" I"));
		System.out.printf("endsWith: %s\n",t.endsWith("tring"));
		System.out.printf("contains: %s\n",t.contains("another"));   
    }     
}
