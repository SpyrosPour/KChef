package com.example.kchef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MyApp";

    private TextView recipe;
    private Observable<String> myObservable;
    private Observer<String> myObserver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String order = intent.getStringExtra("INFO");

        String printme;
        Chef c1 = new Chef();

        if(order.equals("Salad")){
            printme = c1.makeSalad();
        }
        else if(order.equals("Cookies")){
            printme = c1.makeCookies();
        }
        else if(order.equals("Spaghetti")){
            printme = c1.makeSpaghetti();
        }
        else{
            printme = "Wrong input, try again";
        }

        recipe = (TextView)findViewById(R.id.recipeView);
        myObservable = Observable.just(printme);

        myObserver = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.i(TAG," onSubscribe invoked");
            }

            @Override
            public void onNext(String s) {
                Log.i(TAG," onNext invoked");

                recipe.setText(s);
            }

            @Override
            public void onError(Throwable e) {
                Log.i(TAG," onError invoked");
            }

            @Override
            public void onComplete() {
                Log.i(TAG," onComplete invoked");
            }
        };
        myObservable.subscribe(myObserver);
    }
}