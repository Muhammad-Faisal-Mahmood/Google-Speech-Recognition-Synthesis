/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

public class AudioAttributesImplBase
implements AudioAttributesImpl {
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = -1;

    @Override
    public final Object a() {
        return null;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public final boolean equals(Object object) {
        if (!(object instanceof AudioAttributesImplBase)) {
            return false;
        }
        object = (AudioAttributesImplBase)object;
        if (this.b == ((AudioAttributesImplBase)object).b) {
            int n2;
            int n3 = this.c;
            int n4 = ((AudioAttributesImplBase)object).c;
            int n5 = n2 = ((AudioAttributesImplBase)object).d;
            if (n2 == -1) {
                n5 = ((AudioAttributesImplBase)object).a;
                n2 = AudioAttributesCompat.b;
                if ((n4 & 1) == 1) {
                    n5 = 7;
                } else if ((n4 & 4) == 4) {
                    n5 = 6;
                } else {
                    int n6 = Integer.MIN_VALUE;
                    block10: do {
                        switch (n6 == Integer.MIN_VALUE ? n5 : n6) {
                            default: {
                                n6 = 0;
                                continue block10;
                            }
                            case 13: {
                                n5 = 1;
                                break;
                            }
                            case 11: {
                                n5 = 10;
                                break;
                            }
                            case 6: {
                                n5 = 2;
                                break;
                            }
                            case 5: 
                            case 7: 
                            case 8: 
                            case 9: 
                            case 10: {
                                n5 = 5;
                                break;
                            }
                            case 4: {
                                n5 = 4;
                                break;
                            }
                            case 3: {
                                n5 = 8;
                                break;
                            }
                            case 2: {
                                n5 = 0;
                                break;
                            }
                            case 0: 
                            case 1: 
                            case 12: 
                            case 14: 
                            case 16: {
                                n5 = 3;
                            }
                        }
                        break;
                    } while (true);
                }
            }
            if (n5 == 6) {
                n2 = n4 | 4;
            } else {
                n2 = n4;
                if (n5 == 7) {
                    n2 = n4 | 1;
                }
            }
            if (n3 == (n2 & 0x111) && this.a == ((AudioAttributesImplBase)object).a && this.d == ((AudioAttributesImplBase)object).d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a, this.d});
    }

    public final String toString() {
        CharSequence charSequence;
        StringBuilder stringBuilder = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            stringBuilder.append(" stream=");
            stringBuilder.append(this.d);
            stringBuilder.append(" derived");
        }
        stringBuilder.append(" usage=");
        int n2 = this.a;
        int n3 = AudioAttributesCompat.b;
        switch (n2) {
            default: {
                charSequence = new StringBuilder("unknown usage ");
                ((StringBuilder)charSequence).append(n2);
                charSequence = ((StringBuilder)charSequence).toString();
                break;
            }
            case 16: {
                charSequence = "USAGE_ASSISTANT";
                break;
            }
            case 14: {
                charSequence = "USAGE_GAME";
                break;
            }
            case 13: {
                charSequence = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            }
            case 12: {
                charSequence = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            }
            case 11: {
                charSequence = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            }
            case 10: {
                charSequence = "USAGE_NOTIFICATION_EVENT";
                break;
            }
            case 9: {
                charSequence = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            }
            case 8: {
                charSequence = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            }
            case 7: {
                charSequence = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            }
            case 6: {
                charSequence = "USAGE_NOTIFICATION_RINGTONE";
                break;
            }
            case 5: {
                charSequence = "USAGE_NOTIFICATION";
                break;
            }
            case 4: {
                charSequence = "USAGE_ALARM";
                break;
            }
            case 3: {
                charSequence = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            }
            case 2: {
                charSequence = "USAGE_VOICE_COMMUNICATION";
                break;
            }
            case 1: {
                charSequence = "USAGE_MEDIA";
                break;
            }
            case 0: {
                charSequence = "USAGE_UNKNOWN";
            }
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(" flags=0x");
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
    }
}

