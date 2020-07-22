import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestHashMd5 {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String s = "azerty";
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hashInBytes = md.digest(s.getBytes(StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        System.out.println(sb.toString());


        System.out.println(DigestUtils.md5Hex(s));

    }


}

