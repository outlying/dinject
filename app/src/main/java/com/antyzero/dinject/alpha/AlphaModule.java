package com.antyzero.dinject.alpha;

import dagger.Module;
import dagger.Provides;

@Module
public class AlphaModule {

    @Provides
    public Alpha provideAlpha(){
        return new Alpha();
    }
}
