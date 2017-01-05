package RSA;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Keys {
	public static final String KEY_ALGORITHM = "RSA";//加密算法
	public static final String SIGNATURE_ALGORITHM = "MD5withRSA";//数字签名
	private static final String PUBLIC_KEY = "RSAPublicKey";//公钥
	private static final String PRIVATE_KEY = "RSAPrivateKey";//私钥

	public static void main(String[] args) {
		Map<String, Object> keyMap;
		try {
			keyMap = initKey();
			String publicKey = getPublicKey(keyMap);
			System.out.println("公钥======="+publicKey);
			System.out.println(decryptBASE64(publicKey));
			String privateKey = getPrivateKey(keyMap);
			System.out.println("私钥======="+privateKey);
			System.out.println(decryptBASE64(privateKey));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//获取公钥
	public static String getPublicKey(Map<String, Object> keyMap)
			throws Exception {
		Key key = (Key) keyMap.get(PUBLIC_KEY);
		byte[] publicKey = key.getEncoded();
		return encryptBASE64(publicKey);
	}

	//获取私钥
	public static String getPrivateKey(Map<String, Object> keyMap)
			throws Exception {
		Key key = (Key) keyMap.get(PRIVATE_KEY);
		byte[] privateKey = key.getEncoded();
		return encryptBASE64(privateKey);
	}

	//解密
	public static byte[] decryptBASE64(String key) throws Exception {
		return (new BASE64Decoder()).decodeBuffer(key);
	}

	//加密
	public static String encryptBASE64(byte[] key) throws Exception {
		return (new BASE64Encoder()).encodeBuffer(key);
	}

	public static Map<String, Object> initKey() throws Exception {
		KeyPairGenerator keyPairGen = KeyPairGenerator
				.getInstance(KEY_ALGORITHM);
		keyPairGen.initialize(1024);
		KeyPair keyPair = keyPairGen.generateKeyPair();
		RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
		RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
		Map<String, Object> keyMap = new HashMap<String, Object>(2);
		keyMap.put(PUBLIC_KEY, publicKey);
		keyMap.put(PRIVATE_KEY, privateKey);
//		System.out.println("公钥加密前==="+publicKey.toString()+"\n");
//		System.out.println("私钥加密前==="+privateKey.toString()+"\n");
		return keyMap;
	}
}
