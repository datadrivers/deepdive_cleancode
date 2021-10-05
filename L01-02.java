public class RotatedStringChecker {
	
	/**
	 * Returns true if one string is rotation of another, nulls are not * considered rotation of each other
	 */
	public static boolean isRotatedVersion(String original, String potentialRotatedVersion) {
	 	if (original == null || potentialRotatedVersion == null) {
	 		return false;
	 	}
	 	
	 	if (original.length() != potentialRotatedVersion.length()) {
	 		return false;
 		}

		String concatenated = original + original;
		boolean isRotated = concatenated.contains(potentialRotatedVersion); // a rotated Version will always be found in a doubled original
 		return isRotated;
 	}

}