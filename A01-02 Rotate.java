public class RotateStringDemo {
	
	/**
	 * Returns true if one string is rotation of another, nulls are not * considered rotation of each other
	 */
	public static boolean string2Check(String string1, String string2) {

	 	boolean check = false; // set initially to false

	 	if (string1 != null && string2 != null) {
		 	if (string1.length() == string2.length()) {
	 			String newString = string1 + string1;
	 			check = newString.contains(string2);
	 		}
	 		else {
	 			check = false;
	 		}
	 	}
	 	else {
	 		check = false;
	 	}
 		return check;
 	}

}