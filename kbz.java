/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

final class kbz
extends kax {
    public static final kbz a = new kbz();
    private static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final WeakHashMap c = new WeakHashMap();

    private kbz() {
    }

    @Override
    public final jrk a(Class clazz) {
        Object object;
        ReentrantReadWriteLock.ReadLock readLock;
        block10: {
            jrk jrk2;
            int n2;
            int n3;
            Serializable serializable;
            block11: {
                serializable = b;
                readLock = ((ReentrantReadWriteLock)serializable).readLock();
                readLock.lock();
                object = (jrk)c.get(clazz);
                if (object != null) break block10;
                readLock = ((ReentrantReadWriteLock)serializable).readLock();
                n3 = ((ReentrantReadWriteLock)serializable).getWriteHoldCount();
                int n4 = 0;
                int n5 = 0;
                int n6 = 0;
                n3 = n3 == 0 ? ((ReentrantReadWriteLock)serializable).getReadHoldCount() : 0;
                for (n2 = 0; n2 < n3; ++n2) {
                    readLock.unlock();
                }
                serializable = ((ReentrantReadWriteLock)serializable).writeLock();
                ((ReentrantReadWriteLock.WriteLock)serializable).lock();
                object = c;
                jrk2 = (jrk)((WeakHashMap)object).get(clazz);
                if (jrk2 == null) break block11;
                for (n2 = n6; n2 < n3; ++n2) {
                    readLock.lock();
                }
                ((ReentrantReadWriteLock.WriteLock)serializable).unlock();
                return jrk2;
            }
            try {
                jrk2 = kbd.b(clazz);
                object.put(clazz, jrk2);
            }
            catch (Throwable throwable) {
                for (n2 = n5; n2 < n3; ++n2) {
                    readLock.lock();
                }
                ((ReentrantReadWriteLock.WriteLock)serializable).unlock();
                throw throwable;
            }
            for (n2 = n4; n2 < n3; ++n2) {
                readLock.lock();
            }
            ((ReentrantReadWriteLock.WriteLock)serializable).unlock();
            return jrk2;
        }
        return object;
        finally {
            readLock.unlock();
        }
    }
}

