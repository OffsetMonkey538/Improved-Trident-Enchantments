package com.dplayend.ite.impl;

import com.dplayend.ite.api.TridentThrowListener;
import com.dplayend.ite.api.TridentThrowListenerRegistry;

import java.util.ArrayList;
import java.util.List;

public class TridentThrowListenerRegistryImpl implements TridentThrowListenerRegistry {
    public final List<TridentThrowListener> listeners = new ArrayList<>();

    @Override
    public void registerListener(TridentThrowListener listener) {
        listeners.add(listener);
    }

    @Override
    public List<TridentThrowListener> getListeners() {
        return listeners;
    }
}
