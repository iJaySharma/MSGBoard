package com.thinking.machines.msgboard.utils;
/*
don't waste time on thinking about encryption/decryption
look for java AES encryption / decryption example
*/
public class EncryptionUtility
{
private EncryptionUtility(){}
public static String getKey()
{
String key;
// write code to generate secret/salt key 
return "abcdefthinkingmachinesabcdef";
}
public static String encrypt(String password,String key)
{
String encryptedPassword;
// write code encryt
encryptedPassword=password;
return encryptedPassword;
}

public static String decrypt(String encryptedPassword,String key)
{
String password;
// write code decrypt password
password=encryptedPassword;
return password;
}
}