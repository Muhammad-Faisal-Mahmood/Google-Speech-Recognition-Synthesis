/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.net;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.text.Normalizer;
import java.util.Locale;

public class NetStringUtil {
    private static String convertToUnicode(ByteBuffer object, String string) {
        try {
            object = Charset.forName(string).newDecoder().decode((ByteBuffer)object).toString();
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String convertToUnicodeAndNormalize(ByteBuffer object, String string) {
        if ((object = NetStringUtil.convertToUnicode((ByteBuffer)object, string)) == null) {
            return null;
        }
        return Normalizer.normalize((CharSequence)object, Normalizer.Form.NFC);
    }

    private static String convertToUnicodeWithSubstitutions(ByteBuffer object, String object2) {
        try {
            object2 = Charset.forName((String)object2).newDecoder();
            ((CharsetDecoder)object2).onMalformedInput(CodingErrorAction.REPLACE);
            ((CharsetDecoder)object2).onUnmappableCharacter(CodingErrorAction.REPLACE);
            ((CharsetDecoder)object2).replaceWith("\ufffd");
            object = ((CharsetDecoder)object2).decode((ByteBuffer)object).toString();
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static String toUpperCase(String string) {
        try {
            string = string.toUpperCase(Locale.getDefault());
            return string;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

