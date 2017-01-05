package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.JFileChooser;

public class FileEncrypter {

	public static void main(String[] args) {
		FileEncrypter da = new FileEncrypter();
		Scanner scan = new Scanner(System.in);
		String pass = scan.next();
		String pass1 = pass.substring(0, 2);
		String pass2 = pass.substring(2, 4);
		String pass3 = pass.substring(4);  
		System.out.println(pass1);
		System.out.println(pass2);
		System.out.println(pass3);
//		String name = scan.next();
		if (scan.next().equals("en")){
			da.encrypt(new File("d:/school-v2.14.sql"),da.md5s(pass1) + da.md5s(pass2) + da.md5s(pass3));
			System.out.println("������ɣ�");
		}else{
			da.decrypt(new File("d:/school-v2.14.sql"),da.md5s(pass1) + da.md5s(pass2) + da.md5s(pass3));
			System.out.println("������ɣ�");
		}
	}
	 /** 
     * ���ܺ��� ���룺 Ҫ���ܵ��ļ������루��0-F��ɣ���48���ַ�����ʾ3��8λ�����룩�磺 
     * AD67EA2F3BE6E5ADD368DFE03120B5DF92A8FD8FEC2F0746 ���У� AD67EA2F3BE6E5AD 
     * DES����һ D368DFE03120B5DF DES����� 92A8FD8FEC2F0746 DES������ ����� 
     * ��������ļ����ܺ󣬱��浽ͬһ�ļ�����������".tdes"��չ�����ļ��С� 
     */  
    private void encrypt(File fileIn, String sKey) {  
        try {  
            if (sKey.length() == 48) {  
                byte[] bytK1 = getKeyByStr(sKey.substring(0, 16));  
                byte[] bytK2 = getKeyByStr(sKey.substring(16, 32));  
                byte[] bytK3 = getKeyByStr(sKey.substring(32, 48));  
  
                FileInputStream fis = new FileInputStream(fileIn);  
                byte[] bytIn = new byte[(int) fileIn.length()];  
                for (int i = 0; i < fileIn.length(); i++) {  
                    bytIn[i] = (byte) fis.read();  
                }  
                // ����  
                byte[] bytOut = encryptByDES(encryptByDES(encryptByDES(bytIn,  
                        bytK1), bytK2), bytK3);  
                String fileOut = fileIn.getPath();  
                FileOutputStream fos = new FileOutputStream(fileOut);  
                for (int i = 0; i < bytOut.length; i++) {  
                    fos.write((int) bytOut[i]);  
                }  
                fos.close();  
            } else  
                ;  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
    /** 
     * ���ܺ��� ���룺 Ҫ���ܵ��ļ������루��0-F��ɣ���48���ַ�����ʾ3��8λ�����룩�磺 
     * AD67EA2F3BE6E5AD D368DFE03120B5DF 92A8FD8FEC2F0746 ���У� AD67EA2F3BE6E5AD 
     * DES����һ D368DFE03120B5DF DES����� 92A8FD8FEC2F0746 DES������ ����� 
     * ��������ļ����ܺ󣬱��浽�û�ָ�����ļ��С� 
     */  
    private void decrypt(File fileIn, String sKey) {  
        try {  
            if (sKey.length() == 48) {  
                String strPath = fileIn.getPath();  
                strPath = strPath.substring(0, strPath.length() - 5);  
                JFileChooser chooser = new JFileChooser();  
                chooser.setCurrentDirectory(new File("."));  
                chooser.setSelectedFile(new File(strPath));  
                byte[] bytK1 = getKeyByStr(sKey.substring(0, 16));  
                byte[] bytK2 = getKeyByStr(sKey.substring(16, 32));  
                byte[] bytK3 = getKeyByStr(sKey.substring(32, 48));  
  
                FileInputStream fis = new FileInputStream(fileIn);  
                byte[] bytIn = new byte[(int) fileIn.length()];  
                for (int i = 0; i < fileIn.length(); i++) {  
                    bytIn[i] = (byte) fis.read();  
                }  
                // ����  
                byte[] bytOut = decryptByDES(decryptByDES(decryptByDES(bytIn,  
                        bytK3), bytK2), bytK1);  
                File fileOut = chooser.getSelectedFile();  
                fileOut.createNewFile();  
                FileOutputStream fos = new FileOutputStream(fileOut);  
                for (int i = 0; i < bytOut.length; i++) {  
                    fos.write((int) bytOut[i]);  
                }  
                fos.close();  
            }  
        } catch (Exception e) {  
            System.out.println("���ܴ���");  
        }  
    }  
  
    /** 
     * ��DES��������������ֽ� bytKey��Ϊ8�ֽڳ����Ǽ��ܵ����� 
     */  
    private byte[] encryptByDES(byte[] bytP, byte[] bytKey) throws Exception {  
        DESKeySpec desKS = new DESKeySpec(bytKey);  
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");  
        SecretKey sk = skf.generateSecret(desKS);  
        Cipher cip = Cipher.getInstance("DES");  
        cip.init(Cipher.ENCRYPT_MODE, sk);  
        return cip.doFinal(bytP);  
    }  
  
    /** 
     * ��DES��������������ֽ� bytKey��Ϊ8�ֽڳ����ǽ��ܵ����� 
     */  
    private byte[] decryptByDES(byte[] bytE, byte[] bytKey) throws Exception {  
        DESKeySpec desKS = new DESKeySpec(bytKey);  
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");  
        SecretKey sk = skf.generateSecret(desKS);  
        Cipher cip = Cipher.getInstance("DES");  
        cip.init(Cipher.DECRYPT_MODE, sk);  
        return cip.doFinal(bytE);  
    }  
  
    /** 
     * ����������ַ���ʽ�������ֽ�������ʽ�� �������ַ�����AD67EA2F3BE6E5AD 
     * �����ֽ����飺{173,103,234,47,59,230,229,173} 
     */  
    private byte[] getKeyByStr(String str) {  
        byte[] bRet = new byte[str.length() / 2];  
        for (int i = 0; i < str.length() / 2; i++) {  
            Integer itg = new Integer(16 * getChrInt(str.charAt(2 * i))  
                    + getChrInt(str.charAt(2 * i + 1)));  
            bRet[i] = itg.byteValue();  
        }  
        return bRet;  
    }  
  
    /** 
     * ����һ��16�����ַ���10����ֵ ���룺0-F 
     */  
    private int getChrInt(char chr) {  
        int iRet = 0;  
        if (chr == "0".charAt(0))  
            iRet = 0;  
        if (chr == "1".charAt(0))  
            iRet = 1;  
        if (chr == "2".charAt(0))  
            iRet = 2;  
        if (chr == "3".charAt(0))  
            iRet = 3;  
        if (chr == "4".charAt(0))  
            iRet = 4;  
        if (chr == "5".charAt(0))  
            iRet = 5;  
        if (chr == "6".charAt(0))  
            iRet = 6;  
        if (chr == "7".charAt(0))  
            iRet = 7;  
        if (chr == "8".charAt(0))  
            iRet = 8;  
        if (chr == "9".charAt(0))  
            iRet = 9;  
        if (chr == "A".charAt(0))  
            iRet = 10;  
        if (chr == "B".charAt(0))  
            iRet = 11;  
        if (chr == "C".charAt(0))  
            iRet = 12;  
        if (chr == "D".charAt(0))  
            iRet = 13;  
        if (chr == "E".charAt(0))  
            iRet = 14;  
        if (chr == "F".charAt(0))  
            iRet = 15;  
        return iRet;  
    }  
  
    public String md5s(String plainText) {  
        String str = null;  
        try {  
            MessageDigest md = MessageDigest.getInstance("MD5");  
            md.update(plainText.getBytes());  
            byte b[] = md.digest();  
  
            int i;  
  
            StringBuffer buf = new StringBuffer("");  
            for (int offset = 0; offset < b.length; offset++) {  
                i = b[offset];  
                if (i < 0)  
                    i += 256;  
                if (i < 16)  
                    buf.append("0");  
                buf.append(Integer.toHexString(i));  
            }  
            // System.out.println("result: " + buf.toString());// 32λ�ļ���  
            // System.out.println("result: " + buf.toString().substring(8,  
            // 24));// 16λ�ļ���  
            str = buf.toString().substring(8, 24);  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
        }  
        return str;  
    }  
}
