package com.auth.user.management.util;

import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Algorithm {

	static Logger logger = LoggerFactory.getLogger(Algorithm.class);
	private static final String ALGO = "AES";
	
	/** Encrypt a string with AES Algo **/
	public static String encrypt(String data,String keyValue) throws Exception{
		logger.debug("Entry into encrypt data using AES Algo");
		Key key = generateKey(keyValue);
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.ENCRYPT_MODE,key);
		byte[] encryptVal = c.doFinal(data.getBytes());
		logger.debug("Exit from encrypt data using AES Algo");
		return new String(Base64.getEncoder().encode(encryptVal));
	}
	
	/** decrypt a string with AES Algo **/
	public static String decrypt(String encryptdata,String keyValue) throws Exception{
		logger.debug("Entry into decrypt data using AES Algo");
		Key key = generateKey(keyValue);
		Cipher c = Cipher.getInstance(ALGO);
		c.init(Cipher.DECRYPT_MODE,key);
		byte[] decodeVal = Base64.getDecoder().decode(encryptdata);
		byte[] decVal = c.doFinal(decodeVal);
		logger.debug("Exit from decrypt data using AES Algo");
		return new String(decVal);
	}

	/** Generate a new encryption key **/
	private static Key generateKey(String keyValue) {
		logger.debug("Entry into generate Key");
		byte[] key = keyValue.getBytes();
		logger.debug("Exit from generate Key");
		return new SecretKeySpec(key,ALGO);
	}
}
