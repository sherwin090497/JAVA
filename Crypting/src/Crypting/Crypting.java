package Crypting;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Crypting {

	 private static SecretKeySpec secretKey;
	    private static byte[] key;

	    public static void setKey(String myKey)
	    {
	        MessageDigest sha = null;
	        try {
	            key = myKey.getBytes("UTF-8");
	            sha = MessageDigest.getInstance("SHA-1");
	            key = sha.digest(key);
	            key = Arrays.copyOf(key, 16);
	            secretKey = new SecretKeySpec(key, "AES");
	        }
	        catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	        catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public static String encrypt(String strToEncrypt, String secret)
	    {
	        try
	        {
	            setKey(secret);
	            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
	            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
	        }
	        catch (Exception e)
	        {
	            System.out.println("Error while encrypting: " + e.toString());
	        }
	        return null;
	    }

	    public static String decrypt(String strToDecrypt, String secret)
	    {
	        try
	        {
	            setKey(secret);
	            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
	            cipher.init(Cipher.DECRYPT_MODE, secretKey);
	            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
	        }
	        catch (Exception e)
	        {
	            System.out.println("Error while decrypting: " + e.toString());
	        }
	        return null;
	    }
	    
	    @SuppressWarnings("resource")
		public static void main(String[] args) {
			Scanner message = new Scanner(System.in);
	        Scanner password = new Scanner(System.in);
	        Scanner ed = new Scanner(System.in);
	        System.out.print("\nEnter Key: ");
	        String secretKey = password.nextLine();
	        for(int i = 1; i != 0; i++) {
	        	System.out.print("\nType \"E\" to Encrypt or \"D\" to Decrypt: ");
	        	String Letter = ed.nextLine();
	        	if (Letter.contentEquals("E")) {
	        		System.out.print("\nType message you want to encrypt: ");
	                String encryptMessage = message.nextLine();
	                String encryptedString = Crypting.encrypt(encryptMessage, secretKey);	
	                System.out.print("\nEncrypted message:  ");
	                System.out.println(encryptedString);
	                
	        	}
	        	else if (Letter.contentEquals("D")) {
	        		System.out.print("\nType message you want to decrypt: ");
		            String decryptMessage = message.nextLine();
		            String decryptedString = Crypting.decrypt(decryptMessage, secretKey);
		            System.out.print("\nDecrypted message:  ");
		            System.out.println(decryptedString);
		    
	        	}
	        	else if (Letter != "E" || Letter != "D") {
	        		System.out.println("\nPlease type \"E\" or \"D\" only");
	        
	        	}
	        	
	        }
	   }
}

