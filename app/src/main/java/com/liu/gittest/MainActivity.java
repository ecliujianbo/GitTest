package com.liu.gittest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast.makeText(this, "edit in home", Toast.LENGTH_SHORT).show();
    }

    public void toCompany(View view) {
        startActivity(new Intent(this, CompanyActivity.class));
    }

    public void toHome(View view){

    }

}
