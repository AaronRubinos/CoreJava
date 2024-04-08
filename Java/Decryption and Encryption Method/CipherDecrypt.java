import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import javax.crypto.Cipher;
import java.util.Scanner;

public class CipherDecrypt {
   public static void main(String args[]) throws Exception{

      Scanner sc = new Scanner(System.in);

	   //Creating KeyPair generator object
      KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
      
      //Initializing the key pair generator
      keyPairGen.initialize(2048);
      
      //Generate the pair of keys
      KeyPair pair = keyPairGen.generateKeyPair();   
      
      //Getting the public key from the key pair
      PublicKey publicKey = pair.getPublic();  

      //Creating a Cipher object
      Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

      //Initializing a Cipher object
      cipher.init(Cipher.ENCRYPT_MODE, publicKey);
	  
      //Accept user input to add data for the cipher
      System.out.print("Enter the text you want to encrypt: ");
      String user = sc.nextLine();
      System.out.println();

      //Encrypting the data
      byte[] input = user.getBytes();	  
      cipher.update(input);
      byte[] cipherText = cipher.doFinal();	
	  
      //Displaying the data
      System.out.println("Encrypted Text:"); 
      System.out.println( new String(cipherText, "UTF8"));
      System.out.println();

      //Initializing the same cipher for decryption
      cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
      
      //Decrypting the text
      byte[] decipheredText = cipher.doFinal(cipherText);
      System.out.println("Decrypted Text:");
      System.out.println(new String(decipheredText));

      sc.close();
   }
}
