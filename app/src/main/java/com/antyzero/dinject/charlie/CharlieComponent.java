package com.antyzero.dinject.charlie;

import com.antyzero.dinject.MainActivity;
import com.antyzero.dinject.alpha.AlphaComponent;

import dagger.Component;

@Component(

        dependencies = {
                AlphaComponent.class,
                CharlieComponent.class
        }
)
public interface CharlieComponent {

    void inject( MainActivity mainActivity );
}
