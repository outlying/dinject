package com.antyzero.dinject.alpha;

import com.antyzero.dinject.MainActivity;

import dagger.Component;

@Component(
        modules = AlphaModule.class
)
public interface AlphaComponent {

    void inject( MainActivity mainActivity );
}
