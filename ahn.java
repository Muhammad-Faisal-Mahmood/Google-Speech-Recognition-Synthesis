/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

public final class ahn
extends agl {
    private final byte[] a;
    private final DatagramPacket b;
    private Uri c;
    private DatagramSocket d;
    private MulticastSocket e;
    private InetAddress f;
    private boolean g;
    private int h;

    public ahn() {
        super(true);
        byte[] byArray = new byte[2000];
        this.a = byArray;
        this.b = new DatagramPacket(byArray, 0, 2000);
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        int n4;
        if (n3 == 0) {
            return 0;
        }
        if (this.h == 0) {
            try {
                DatagramSocket datagramSocket = this.d;
                abr.i(datagramSocket);
                datagramSocket.receive(this.b);
                this.h = n4 = this.b.getLength();
                this.g(n4);
            }
            catch (IOException iOException) {
                throw new ahm(iOException, 2001);
            }
            catch (SocketTimeoutException socketTimeoutException) {
                throw new ahm(socketTimeoutException, 2002);
            }
        }
        n4 = this.b.getLength();
        int n5 = this.h;
        n3 = Math.min(n5, n3);
        System.arraycopy(this.a, n4 - n5, byArray, n2, n3);
        this.h -= n3;
        return n3;
    }

    @Override
    public final long b(agt agt2) {
        Object object;
        this.c = object = agt2.a;
        object = object.getHost();
        abr.i(object);
        int n2 = this.c.getPort();
        this.j();
        try {
            this.f = InetAddress.getByName((String)object);
            object = new InetSocketAddress(this.f, n2);
            if (this.f.isMulticastAddress()) {
                MulticastSocket multicastSocket;
                this.e = multicastSocket = new MulticastSocket((SocketAddress)object);
                multicastSocket.joinGroup(this.f);
                this.d = this.e;
            } else {
                DatagramSocket datagramSocket;
                this.d = datagramSocket = new DatagramSocket((SocketAddress)object);
            }
            this.d.setSoTimeout(8000);
            this.g = true;
        }
        catch (IOException iOException) {
            throw new ahm(iOException, 2001);
        }
        catch (SecurityException securityException) {
            throw new ahm(securityException, 2006);
        }
        this.i(agt2);
        return -1L;
    }

    @Override
    public final Uri c() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d() {
        Object object;
        this.c = null;
        MulticastSocket multicastSocket = this.e;
        if (multicastSocket != null) {
            try {
                object = this.f;
                abr.i(object);
                multicastSocket.leaveGroup((InetAddress)object);
            }
            catch (IOException iOException) {}
            this.e = null;
        }
        if ((object = this.d) != null) {
            ((DatagramSocket)object).close();
            this.d = null;
        }
        this.f = null;
        this.h = 0;
        if (this.g) {
            this.g = false;
            this.h();
        }
    }
}

