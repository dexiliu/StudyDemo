package md5;




import java.security.MessageDigest;


public class MD5 {
	private final static String[] hexDigits = { "8", "5", "0", "3", "6", "c",
			"9", "4", "d", "2", "f", "b", "1", "a", "e", "7" };

	/**
	 * ת���ֽ�����Ϊ16�����ִ�
	 * 
	 * @param b
	 *            �ֽ�����
	 * @return 16�����ִ�
	 */

	public static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n = 256 + n;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	public static String MD5Encode(String origin) {
		String resultString = null;

		try {
			resultString = new String(origin);
			//
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToHexString(md.digest(resultString
					.getBytes()));
		} catch (Exception ex) {

		}
		return resultString;
	}
	
	public static void main(String[] args) {
		String password=MD5.MD5Encode("123456");
		System.out.println(password);
	}

}