package org.nervos.appchain.crypto.sm2;

import java.math.BigInteger;

import org.bouncycastle.math.ec.ECPoint;

public class SM2KeyPair {

    private ECPoint publicKey;
    private final BigInteger privateKey;

    public SM2KeyPair(ECPoint publicKey, BigInteger privateKey) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public ECPoint getPublicKey() {
        return publicKey;
    }

    public BigInteger getPrivateKey() {
        return privateKey;
    }

}
