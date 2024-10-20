/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;

public final class ire
implements jqz {
    private final int a;

    public /* synthetic */ ire(int n2) {
        this.a = n2;
    }

    @Override
    public final Object a() {
        switch (this.a) {
            default: {
                return a.p();
            }
            case 16: {
                try {
                    Object object = Base64.decode((String)"CP///////////wE", (int)3);
                    hwg hwg2 = hwg.a;
                    int n2 = ((byte[])object).length;
                    Object object2 = hwj.a;
                    object2 = hyo.a;
                    object = hwv.o(hwg2, object, 0, n2, hwj.a);
                    hwv.D((hwv)object);
                    object = (hwg)object;
                    return object;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 15: {
                try {
                    Object object = Base64.decode((String)"CjUKMWNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmFjY2Vzc2liaWxpdHkudm9pY2VhY2Nlc3MQAwolCiFjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZXNzYWdpbmcQAg", (int)3);
                    bqs bqs2 = bqs.a;
                    int n3 = ((byte[])object).length;
                    Object object3 = hwj.a;
                    object3 = hyo.a;
                    object = hwv.o(bqs2, object, 0, n3, hwj.a);
                    hwv.D((hwv)object);
                    object = (bqs)object;
                    return object;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 14: {
                try {
                    Object object = Base64.decode((String)"ChNjb20uYW5kcm9pZC52ZW5kaW5nCixjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5hY2Nlc3NpYmlsaXR5LnJldmVhbAoxY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuYWNjZXNzaWJpbGl0eS52b2ljZWFjY2Vzcwo1Y29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuYWNjZXNzaWJpbGl0eS52b2ljZWFjY2Vzcy51aWQKImNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmJvb2tzLm5leHQKG2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbQofY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuZ21tLmRldgokY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuZ21tLmZpc2hmb29kCh5jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0ucXAKIWNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmtpZHMuaG9tZQocY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWFwcwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5nCiZjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5uYnUucGFpc2EudXNlcgoqY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubmJ1LnBhaXNhLnVzZXIuZGV2Ciljb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5uYnUucGFpc2EudXNlci5xYQowY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubmJ1LnBhaXNhLnVzZXIudGVhbWZvb2QyCh9jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5vdmVybGF5CiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5yZWNvcmRlcgohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuc2FmZXR5aHViCkJjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5zZWFyY2guYXNzaXN0YW50LnN1cmZhY2VzLmRpY3RhdGlvbi5kZXZhcHAKLmNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLnNlYXJjaC5sZW5zLnN0YW5kYWxvbmUKNWNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLnNlYXJjaC50cmFuc2NyaXB0aW9uLmVtYmVkZGVkCjdjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5zZWFyY2gudHJhbnNjcmlwdGlvbi5zdGFuZGFsb25lCkljb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5zZWFyY2gudHJhbnNjcmlwdGlvbi50ZXN0aW5nLmludGVudHN0YXJ0ZXIuYmluYXJ5Ch9jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy50YWNoeW9uCiFjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy50cmFuc2xhdGUKJmNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLnRyYW5zbGF0ZWRlYnVnCh9jb20uZ29vZ2xlLmFuZHJvaWQuY2FyYXNzaXN0YW50Chljb20uZ29vZ2xlLmFuZHJvaWQuZGlhbGVyCiljb20uZ29vZ2xlLmFuZHJvaWQuZ2xhc3Nlcy5hcHBzLmFzc2lzdGFudAozY29tLmdvb2dsZS5hbmRyb2lkLmdsYXNzZXMuYXBwcy5kZW1vLm11bHRpbW9kYWwuYXBwCiVjb20uZ29vZ2xlLmFuZHJvaWQuZ2xhc3Nlcy5hcHBzLnNvdW5kCjVjb20uZ29vZ2xlLmFuZHJvaWQuZ2xhc3Nlcy5hcHBzLnN5c3VpLmhvbWUuc3RhbmRhbG9uZQo9Y29tLmdvb2dsZS5hbmRyb2lkLmdsYXNzZXMuYXBwcy5zeXN1aS5ub3RpZmljYXRpb24uc3RhbmRhbG9uZQokY29tLmdvb2dsZS5hbmRyb2lkLmdsYXNzZXMuY29tcGFuaW9uCi5jb20uZ29vZ2xlLmFuZHJvaWQuZ2xhc3Nlcy5lbnRlcnByaXNlY29tcGFuaW9uChZjb20uZ29vZ2xlLmFuZHJvaWQuZ21zCidjb20uZ29vZ2xlLmFuZHJvaWQuZ29vZ2xlcXVpY2tzZWFyY2hib3gKJGNvbS5nb29nbGUuYW5kcm9pZC5pbnB1dG1ldGhvZC5sYXRpbgorY29tLmdvb2dsZS5hbmRyb2lkLmlucHV0bWV0aG9kLmxhdGluLmNhbmFyeQooY29tLmdvb2dsZS5hbmRyb2lkLmlucHV0bWV0aG9kLmxhdGluLmRldgpNY29tLmdvb2dsZS5hbmRyb2lkLmxpYnJhcmllcy5hc3Npc3RhbnQuc29kYS5yZWNvZ25pdGlvbnNlcnZpY2UuZXhhbXBsZXMuYmFzaWMKK2NvbS5nb29nbGUuYW5kcm9pZC5wcm9qZWN0aW9uLmdlYXJoZWFkLnRlc3QKMGNvbS5nb29nbGUuYXNzaXN0YW50LnN1cmZhY2VzLmdsYXNzZXMuYXBwcy5rYWxvcwo7Y29tLmdvb2dsZS5hdWRpby5oZWFyaW5nLnZpc3VhbGl6YXRpb24uYWNjZXNzaWJpbGl0eS5zY3JpYmU", (int)3);
                    iah iah2 = iah.a;
                    int n4 = ((byte[])object).length;
                    Object object4 = hwj.a;
                    object4 = hyo.a;
                    object = hwv.o(iah2, object, 0, n4, hwj.a);
                    hwv.D((hwv)object);
                    object = (iah)object;
                    return object;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 13: {
                try {
                    Object object = Base64.decode((String)"CiVjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5waXhlbC5zdXBwb3J0Ckljb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5zZWFyY2gudHJhbnNjcmlwdGlvbi50ZXN0aW5nLmludGVudHN0YXJ0ZXIuYmluYXJ5Cidjb20uZ29vZ2xlLmFuZHJvaWQuZ29vZ2xlcXVpY2tzZWFyY2hib3gKJGNvbS5nb29nbGUuYW5kcm9pZC5pbnB1dG1ldGhvZC5sYXRpbgorY29tLmdvb2dsZS5hbmRyb2lkLmlucHV0bWV0aG9kLmxhdGluLmNhbmFyeQooY29tLmdvb2dsZS5hbmRyb2lkLmlucHV0bWV0aG9kLmxhdGluLmRldg", (int)3);
                    iah iah3 = iah.a;
                    int n5 = ((byte[])object).length;
                    Object object5 = hwj.a;
                    object5 = hyo.a;
                    object = hwv.o(iah3, object, 0, n5, hwj.a);
                    hwv.D((hwv)object);
                    object = (iah)object;
                    return object;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 12: {
                try {
                    byte[] byArray = Base64.decode((String)"ChNjb20uYW5kcm9pZC52ZW5kaW5nChdjb20uZml0Yml0LkZpdGJpdE1vYmlsZQovY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuYWNjZXNzaWJpbGl0eS5tYWduaWZpZXIKH2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdlbmVzaXMKI2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdlbmVzaXMuZGV2Chtjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nbW0KH2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5kZXYKJGNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdtbS5maXNoZm9vZAoeY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMuZ21tLnFwCh5jb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5waG90b3MKI2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLnBpeGVsLmFnZW50Ckljb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5zZWFyY2gudHJhbnNjcmlwdGlvbi50ZXN0aW5nLmludGVudHN0YXJ0ZXIuYmluYXJ5Chljb20uZ29vZ2xlLmFuZHJvaWQuZGlhbGVyCidjb20uZ29vZ2xlLmFuZHJvaWQuZ29vZ2xlcXVpY2tzZWFyY2hib3gKJGNvbS5nb29nbGUuYW5kcm9pZC5pbnB1dG1ldGhvZC5sYXRpbgorY29tLmdvb2dsZS5hbmRyb2lkLmlucHV0bWV0aG9kLmxhdGluLmNhbmFyeQooY29tLmdvb2dsZS5hbmRyb2lkLmlucHV0bWV0aG9kLmxhdGluLmRldgoqY29tLmdvb2dsZS5pbnRlbGxpZ2VuY2UuYWdlbnQubGFicy5hbWJpZW50", (int)3);
                    hwv hwv2 = iah.a;
                    int n6 = byArray.length;
                    Object object = hwj.a;
                    object = hyo.a;
                    hwv2 = hwv.o(hwv2, byArray, 0, n6, hwj.a);
                    hwv.D(hwv2);
                    return hwv2;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 11: {
                try {
                    byte[] byArray = Base64.decode((String)"CiYKH2NvbS5nb29nbGUuYW5kcm9pZC5hcHBzLmdlbmVzaXMSAwoBAQoqCiNjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5nZW5lc2lzLmRldhIDCgEBClIKSWNvbS5nb29nbGUuYW5kcm9pZC5hcHBzLnNlYXJjaC50cmFuc2NyaXB0aW9uLnRlc3RpbmcuaW50ZW50c3RhcnRlci5iaW5hcnkSBQoDAgEDCiAKGWNvbS5nb29nbGUuYW5kcm9pZC5kaWFsZXISAwoBAg", (int)3);
                    hwv hwv3 = ffa.a;
                    int n7 = byArray.length;
                    Object object = hwj.a;
                    object = hyo.a;
                    hwv3 = hwv.o(hwv3, byArray, 0, n7, hwj.a);
                    hwv.D(hwv3);
                    return hwv3;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 10: {
                try {
                    csq csq2 = csq.a;
                    return csq2;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 9: {
                try {
                    byte[] byArray = Base64.decode((String)"CICjBQ", (int)3);
                    hwv hwv4 = hwg.a;
                    int n8 = byArray.length;
                    Object object = hwj.a;
                    object = hyo.a;
                    hwv4 = hwv.o(hwv4, byArray, 0, n8, hwj.a);
                    hwv.D(hwv4);
                    return hwv4;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 8: {
                try {
                    Object object = Base64.decode((String)"COCoAQ", (int)3);
                    hwg hwg3 = hwg.a;
                    int n9 = ((byte[])object).length;
                    Object object6 = hwj.a;
                    object6 = hyo.a;
                    object = hwv.o(hwg3, object, 0, n9, hwj.a);
                    hwv.D((hwv)object);
                    object = (hwg)object;
                    return object;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 7: {
                try {
                    fam fam2 = fam.a;
                    return fam2;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 6: {
                try {
                    byte[] byArray = Base64.decode((String)"Chthc21kX3ppcGZpbGVfbWVkaXVtX2RlZmF1bHQy8QEKBWVuLVVTEgVlbi1VUxpJaHR0cHM6Ly9kbC5nb29nbGUuY29tL2FuZHJvaWQvdm9pY2Uvc29kYS9lbi1VUy92MzAwNi9zb2RhLWVuLVVTLXYzMDA2LnppcCC+Fyjp2QIyEHNvZGEtZW4tVVMtdjMwMDY4NkBkYkAzODk2RERCNTYzNDZEM0VBQzExQTE5Q0YwNEU1MEQ5NDM2MTcwRDdGRjhBOTk5NTA3QjUwQkI4RDgyMDlFMTdBeAF4AngDeAR4BXgGeAeKASgwNDhBNTFBM0E5MDRGQUQ3RTNBREUxQzdEMUMxNEYyQjI3NDE3NkU2MvEBCgVkZS1ERRIFZGUtREUaSWh0dHBzOi8vZGwuZ29vZ2xlLmNvbS9hbmRyb2lkL3ZvaWNlL3NvZGEvZGUtREUvdjMwMDIvc29kYS1kZS1ERS12MzAwMi56aXAguhcotoAEMhBzb2RhLWRlLURFLXYzMDAyODZAZGJAQUU1ODU5QUI5N0VDRUI0MzI3NzUyM0NFQUUwRTUwRDg5MzFFOUY1RjU2NzE4NDZGNkE4MkNDQ0YzQTJBNjBCMXgBeAJ4A3gEeAV4BngHigEoM0M4OUQzNzFEQTQ1NDM1MTVEMjk5RTJCNDk1QjE0MzJDRUFENERCRTLxAQoFZXMtRVMSBWVzLUVTGklodHRwczovL2RsLmdvb2dsZS5jb20vYW5kcm9pZC92b2ljZS9zb2RhL2VzLUVTL3YzMDAwL3NvZGEtZXMtRVMtdjMwMDAuemlwILgXKLiBAzIQc29kYS1lcy1FUy12MzAwMDg2QGRiQDUwODY0NTBFMzI3RTQ5OEMwQzU3RENFRkQ1MERDMTlDOTgwRkY0MDREM0VCOTgwNDdFMkIxRDZBQzJCRjVDMzl4AXgCeAN4BHgFeAZ4B4oBKDRGNTU0QzUxNDM2MjA1NTI1RDU4NTE5MzI5ODcwRUM5MDI1ODI0REMy8QEKBWZyLUZSEgVmci1GUhpJaHR0cHM6Ly9kbC5nb29nbGUuY29tL2FuZHJvaWQvdm9pY2Uvc29kYS9mci1GUi92MzAwMi9zb2RhLWZyLUZSLXYzMDAyLnppcCC6Fyi3gAQyEHNvZGEtZnItRlItdjMwMDI4NkBkYkA1RDRGODlEMDRGMUMxNTczNTRBRjA0OTVDRkVDOUUwRUIwQTk0QjY3RURCRTgzNEU2OTUxQjdDNDgxQTUxNDVEeAF4AngDeAR4BXgGeAeKAShFNkE3QUIxRTNGQkEyQjlBQ0UwMTFBQzJEQUI4NDA3RUE0MkJCOTU1MvEBCgVpdC1JVBIFaXQtSVQaSWh0dHBzOi8vZGwuZ29vZ2xlLmNvbS9hbmRyb2lkL3ZvaWNlL3NvZGEvaXQtSVQvdjMwMDAvc29kYS1pdC1JVC12MzAwMC56aXAguBcoraUDMhBzb2RhLWl0LUlULXYzMDAwODZAZGJAMzA2MkUyQjlFQTRBMTc5RjIwNzZCRTQ0MEM1QzVENDYzNzAwNjc2RTJDQUNFNTM1NTQ1MzU4QTI2MjhFQzhDMngBeAJ4A3gEeAV4BngHigEoMThEMjVENTYxRkYzMERDREFGQ0NBODdEN0VGN0IwODRDNDAwQjU0RTLxAQoFamEtSlASBWphLUpQGklodHRwczovL2RsLmdvb2dsZS5jb20vYW5kcm9pZC92b2ljZS9zb2RhL2phLUpQL3YzMDAzL3NvZGEtamEtSlAtdjMwMDMuemlwILsXKMyYBjIQc29kYS1qYS1KUC12MzAwMzg2QGRiQDk3RjU3OTBDMEJDRUQzRkMxQjJEMDc3NjEzMDhENkNCMDRBMDRDOTk3OUI3NTM0MEJCODc5M0FGOTMwNENCMjJ4AXgCeAN4BHgFeAZ4B4oBKEIzRTYxMjU4OTEzN0MwQ0JDOTdEQzc3NkFCNjJGNjNBRkYwRTA4QTgy8QEKBWVuLUFVEgVlbi1BVRpJaHR0cHM6Ly9kbC5nb29nbGUuY29tL2FuZHJvaWQvdm9pY2Uvc29kYS9lbi1BVS92MzAwMy9zb2RhLWVuLUFVLXYzMDAzLnppcCC7FyjC1gIyEHNvZGEtZW4tQVUtdjMwMDM4NkBkYkAxMDVDRDgzODVFM0EzMDc3REQ1Qjk5QkM1NzNFRTEwQTQ0MDBGNzRDNjc0OTY1MkYwMkZGOUU4NzkyRThEOTFBeAF4AngDeAR4BXgGeAeKASg5QTZBNTY2N0I2QTJEQTk2MkY1RTczNEI5Q0U1RTMzNEJBOUNCMjNFMvEBCgVlbi1HQhIFZW4tR0IaSWh0dHBzOi8vZGwuZ29vZ2xlLmNvbS9hbmRyb2lkL3ZvaWNlL3NvZGEvZW4tR0IvdjMwMDIvc29kYS1lbi1HQi12MzAwMi56aXAguhco9NYCMhBzb2RhLWVuLUdCLXYzMDAyODZAZGJARkQ4Mjk0QUIyREI5QUFFRUUwMDM5RjJCODI0RjJDMzM4QjFGMEZCQjE1OEM1ODBERjdGOTA3OTU3QUZEQjZDNHgBeAJ4A3gEeAV4BngHigEoOUY2N0Q4MDU1MTUxQzIwMjY2MEREQzI1QjRCNEQ0RjQ0MkNFMTlBQjLxAQoFZW4tSUUSBWVuLUlFGklodHRwczovL2RsLmdvb2dsZS5jb20vYW5kcm9pZC92b2ljZS9zb2RhL2VuLUlFL3YzMDAyL3NvZGEtZW4tSUUtdjMwMDIuemlwILoXKPTWAjIQc29kYS1lbi1JRS12MzAwMjg2QGRiQDgyODY3RDVFRTRGOUIzM0IwOEYyN0NCMkI1OEM4OEM5NDg1RTMzMTFBNzgxRTA3MzYyODYzRkIzRjRFMjQwMTh4AXgCeAN4BHgFeAZ4B4oBKDZBNTMyQzBENURDQzE3Rjk3Rjc0OTkzMzRERjdFRkU1N0RDRjdERkYy8QEKBWVuLVNHEgVlbi1TRxpJaHR0cHM6Ly9kbC5nb29nbGUuY29tL2FuZHJvaWQvdm9pY2Uvc29kYS9lbi1TRy92MzAwMS9zb2RhLWVuLVNHLXYzMDAxLnppcCC5Fyj01gIyEHNvZGEtZW4tU0ctdjMwMDE4NkBkYkA0NEEyRjgwM0ZGMTg0OEZBRTA3N0FDOEIzQjRGQUNFMzkwMUQ5RkY1NDE5ODdFQ0JFQURGQkZGQTkwRDJEOEIxeAF4AngDeAR4BXgGeAeKASg0RTJGODRFNjk2RUVBRTQ4M0QyMDdBMjQ0QkRFOERFMkU1RTQ5MDhB", (int)3);
                    hwv hwv5 = huu.a;
                    int n10 = byArray.length;
                    Object object = hwj.a;
                    object = hyo.a;
                    hwv5 = hwv.o(hwv5, byArray, 0, n10, hwj.a);
                    hwv.D(hwv5);
                    return hwv5;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 5: {
                try {
                    Object object = Base64.decode((String)"CJBOEQAAAAAAAPA/GZqZmZmZmck/ILgI", (int)3);
                    irv irv2 = irv.a;
                    int n11 = ((byte[])object).length;
                    Object object7 = hwj.a;
                    object7 = hyo.a;
                    object = hwv.o(irv2, object, 0, n11, hwj.a);
                    hwv.D((hwv)object);
                    object = (irv)object;
                    return object;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 4: {
                try {
                    byte[] byArray = Base64.decode((String)"CgVzaXRlcwoGc2NyaXB0CgpkYXRhc3R1ZGlvCgRkb2NzCgVmb3JtcwoGc2hlZXRzCgZzbGlkZXM", (int)3);
                    hwv hwv6 = iah.a;
                    int n12 = byArray.length;
                    Object object = hwj.a;
                    object = hyo.a;
                    hwv6 = hwv.o(hwv6, byArray, 0, n12, hwj.a);
                    hwv.D(hwv6);
                    return hwv6;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 3: {
                try {
                    byte[] byArray = Base64.decode((String)"CgNhbXAKBnNjcmlwdAoEZG9jcwoFZm9ybXMKBnNoZWV0cwoFc2l0ZXMKBnNsaWRlcw", (int)3);
                    hwv hwv7 = iah.a;
                    int n13 = byArray.length;
                    Object object = hwj.a;
                    object = hyo.a;
                    hwv7 = hwv.o(hwv7, byArray, 0, n13, hwj.a);
                    hwv.D(hwv7);
                    return hwv7;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 2: {
                return fvc.ab();
            }
            case 1: {
                try {
                    Object object = Base64.decode((String)"CIDpDw", (int)3);
                    hwg hwg4 = hwg.a;
                    int n14 = ((byte[])object).length;
                    Object object8 = hwj.a;
                    object8 = hyo.a;
                    object = hwv.o(hwg4, object, 0, n14, hwj.a);
                    hwv.D((hwv)object);
                    object = (hwg)object;
                    return object;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
                catch (RuntimeException runtimeException) {
                    throw runtimeException;
                }
            }
            case 0: 
        }
        return fvc.ad();
    }
}

