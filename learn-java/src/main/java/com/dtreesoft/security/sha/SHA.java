package com.dtreesoft.security.sha;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SHA {

    public String hash(String plainText) throws Exception {
        byte[] hashValue = null;

        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

        hashValue = messageDigest.digest(plainText.getBytes());
//        hashValue = messageDigest.digest(plainText.getBytes("UTF-8")); // UTF-8 인코딩을 사용할 경우

        // 레인보우테이블 공격을 방지하기 위해 솔트(난수) 값을 이용하여 해시값 생성
        // 레인보우테이블 = 미리 계산된 해시값 테이블을 이용하여 원래의 평문을 찾아내는 공격

        // 안전한 솔트(난수) 값 생성을 위한 랜덤 함수(SecureRandom) 객체 생성
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[32];

        // 32바이트 길이의 솔트(난수) 값 생성
        secureRandom.nextBytes(salt);

        // 해시 대상 입력 문자열에 솔트값 추가
        messageDigest.update(salt);

        // 입력 문자열(plainText + salt) 를 해시 값으로 반환
        hashValue = messageDigest.digest(plainText.getBytes());

        return new BigInteger(1, hashValue).toString(16);
    }
}
