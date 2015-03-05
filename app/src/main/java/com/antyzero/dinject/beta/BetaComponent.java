package com.antyzero.dinject.beta;

import com.antyzero.dinject.MainActivity;

import dagger.Component;

@Component(
        modules = BetaModule.class
)
public interface BetaComponent {

    void inject( MainActivity mainActivity );
}
