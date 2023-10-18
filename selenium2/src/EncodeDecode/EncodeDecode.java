package EncodeDecode;

import org.apache.commons.codec.binary.Base64;

public class EncodeDecode {

	public static void main(String[] args) 
	{
		//For encoding
		String str="123456789";
		
		byte[] Newstring = Base64.encodeBase64(str.getBytes());
		System.out.println(Newstring);
		
		//For decoding
		byte[] decoded = Base64.decodeBase64(Newstring);
		System.out.println(new String(decoded));
    
       
	}

}
