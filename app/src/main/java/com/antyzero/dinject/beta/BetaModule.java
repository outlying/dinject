package com.antyzero.dinject.beta;

import dagger.Module;
import dagger.Provides;

@Module
public class BetaModule {

    @Provides
    public Beta provideBeta(){
        return new Beta();
    }
}
