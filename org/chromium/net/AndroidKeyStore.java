/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package org.chromium.net;

import android.util.Log;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public class AndroidKeyStore {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] encryptWithPrivateKey(PrivateKey serializable, String string, byte[] object) {
        void var0_3;
        block5: {
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(string);
            }
            catch (NoSuchPaddingException noSuchPaddingException) {
                break block5;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                // empty catch block
                break block5;
            }
            try {
                cipher.init(1, (Key)serializable);
                return cipher.doFinal((byte[])object);
            }
            catch (Exception exception) {
                object = serializable.getAlgorithm();
                String string2 = serializable.getClass().getName();
                serializable = new StringBuilder("Exception while encrypting input with ");
                ((StringBuilder)serializable).append(string);
                ((StringBuilder)serializable).append(" and ");
                ((StringBuilder)serializable).append((String)object);
                ((StringBuilder)serializable).append(" private key (");
                ((StringBuilder)serializable).append(string2);
                ((StringBuilder)serializable).append("): ");
                ((StringBuilder)serializable).append(exception);
                Log.e((String)"cr_AndroidKeyStore", (String)((StringBuilder)serializable).toString());
                return null;
            }
        }
        object = new StringBuilder("Cipher ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" not supported: ");
        ((StringBuilder)object).append(var0_3);
        Log.e((String)"cr_AndroidKeyStore", (String)((StringBuilder)object).toString());
        return null;
    }

    private static String getPrivateKeyClassName(PrivateKey privateKey) {
        return privateKey.getClass().getName();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean privateKeySupportsCipher(PrivateKey privateKey, String string) {
        try {
            Cipher.getInstance(string).init(1, privateKey);
            return true;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("Exception while checking support for ");
            stringBuilder.append(string);
            stringBuilder.append(": ");
            stringBuilder.append(exception);
            Log.e((String)"cr_AndroidKeyStore", (String)stringBuilder.toString());
            return false;
        }
        catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException generalSecurityException) {
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean privateKeySupportsSignature(PrivateKey privateKey, String string) {
        try {
            Signature.getInstance(string).initSign(privateKey);
            return true;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("Exception while checking support for ");
            stringBuilder.append(string);
            stringBuilder.append(": ");
            stringBuilder.append(exception);
            Log.e((String)"cr_AndroidKeyStore", (String)stringBuilder.toString());
            return false;
        }
        catch (InvalidKeyException | NoSuchAlgorithmException generalSecurityException) {
            return false;
        }
    }

    private static byte[] signWithPrivateKey(PrivateKey object, String string, byte[] object2) {
        Object object3;
        try {
            object3 = Signature.getInstance(string);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            object2 = new StringBuilder("Signature algorithm ");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(" not supported: ");
            ((StringBuilder)object2).append(noSuchAlgorithmException);
            Log.e((String)"cr_AndroidKeyStore", (String)((StringBuilder)object2).toString());
            return null;
        }
        try {
            ((Signature)object3).initSign((PrivateKey)object);
            ((Signature)object3).update((byte[])object2);
            object2 = ((Signature)object3).sign();
            return object2;
        }
        catch (Exception exception) {
            object3 = object.getAlgorithm();
            object = object.getClass().getName();
            StringBuilder stringBuilder = new StringBuilder("Exception while signing message with ");
            stringBuilder.append(string);
            stringBuilder.append(" and ");
            stringBuilder.append((String)object3);
            stringBuilder.append(" private key (");
            stringBuilder.append((String)object);
            stringBuilder.append("): ");
            stringBuilder.append(exception);
            Log.e((String)"cr_AndroidKeyStore", (String)stringBuilder.toString());
            return null;
        }
    }
}

