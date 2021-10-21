package com.java.core.garbagecollection;

public class GCdemo {
    int objId;
    GCdemo(int id)
    {
        this.objId=id;
        System.out.println(this+" created: "+objId);
    }
    public static void main(String[] args) {
        new GCdemo(1);
        new GCdemo(2);
        for(int i=0;i<500;i++)
            System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this+" finalized: "+objId);
    }
}
