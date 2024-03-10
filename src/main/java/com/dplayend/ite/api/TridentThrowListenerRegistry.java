package com.dplayend.ite.api;

import com.dplayend.ite.impl.TridentThrowListenerRegistryImpl;

import java.util.List;

public interface TridentThrowListenerRegistry {
    TridentThrowListenerRegistry INSTANCE  = new TridentThrowListenerRegistryImpl();

    void registerListener(TridentThrowListener listener);
    List<TridentThrowListener> getListeners();
}
