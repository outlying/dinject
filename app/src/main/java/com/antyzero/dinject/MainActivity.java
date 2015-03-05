package com.antyzero.dinject;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.antyzero.dinject.alpha.Alpha;
import com.antyzero.dinject.alpha.Dagger_AlphaComponent;
import com.antyzero.dinject.beta.Beta;
import com.antyzero.dinject.beta.Dagger_BetaComponent;

import javax.inject.Inject;


public class MainActivity extends ActionBarActivity {

    @Inject
    Alpha alpha;

    @Inject
    Beta beta;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );

        Dagger_AlphaComponent.create().inject( this );

        Dagger_BetaComponent.create().inject( this );
    }
}
