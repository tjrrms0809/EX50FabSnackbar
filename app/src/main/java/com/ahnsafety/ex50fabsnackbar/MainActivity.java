package com.ahnsafety.ex50fabsnackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFab(View view) {
        Snackbar snackbar= Snackbar.make(view, "Thais is SnackBar", Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("Submit", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "click submit", Toast.LENGTH_SHORT).show();
            }
        });

        snackbar.show();
    }

    public void clickBtn(View view) {
        //스낵바가 나타나는 위치를 지정해보기
        CoordinatorLayout layout= findViewById(R.id.layout_snackbar_container);

        Snackbar snackbar= Snackbar.make(layout, "This is Snackbar", Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        snackbar.show();
    }
}
