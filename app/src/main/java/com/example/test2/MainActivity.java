package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView signInAs;
    ImageButton buyerSignIn, supplierSignIn;
    Button supplierSignUp, buyerSignUp;
    ImageView appProffer, supplier, buyer;
    EditText a1, a2, a3, a4, a5, a6, b1, b2, b3;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //EditText
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);
        a6 = findViewById(R.id.a6);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);


        signInAs = findViewById(R.id.signInAs);
        supplierSignIn = (ImageButton)findViewById(R.id.signInSupplier);
        buyerSignIn = (ImageButton)findViewById(R.id.signInBuyer);
        supplierSignUp = findViewById(R.id.supplierSignUp);
        buyerSignUp = findViewById(R.id.buyerSignUp);
        appProffer = findViewById(R.id.app_proffer);
        supplier = findViewById(R.id.supplier);
        buyer = findViewById(R.id.buyer);

        supplierSignUp.setOnClickListener(this);
        buyerSignUp.setOnClickListener(this);

        supplierSignUp.setEnabled(false);
        buyerSignUp.setEnabled(false);

        startingScreen();

        //code to get the ImageButtons working
        supplierSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                supplier();
            }
        });


        buyerSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buyer();
            }
        });

        //all requirements should be filled before the sign in button works
        a1.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                suppliercheckRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        a2.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                suppliercheckRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        a3.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                suppliercheckRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        a4.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                suppliercheckRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        a5.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                suppliercheckRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        a6.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                suppliercheckRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        b1.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                buyercheckRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        b2.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                buyercheckRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        b3.addTextChangedListener (new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2){
                buyercheckRequiredFields();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        //

    }

    private void suppliercheckRequiredFields() {
        if (!a1.getText().toString().isEmpty() && !a2.getText().toString().isEmpty() && !a3.getText().toString().isEmpty() && !a4.getText().toString().isEmpty() && !a5.getText().toString().isEmpty() && !a6.getText().toString().isEmpty()) {
            supplierSignUp.setEnabled(true);
        }else {
            supplierSignUp.setEnabled(false);
        }
    }

    private void buyercheckRequiredFields () {
        if (!b1.getText().toString().isEmpty() && !b2.getText().toString().isEmpty() && !b3.getText().toString().isEmpty()) {
            buyerSignUp.setEnabled(true);
        }else {
            buyerSignUp.setEnabled(false);
        }
    }

    public void startingScreen() {
        appProffer.setVisibility(View.VISIBLE);
        supplierSignIn.setVisibility(View.VISIBLE);
        buyerSignIn.setVisibility(View.VISIBLE);
        signInAs.setVisibility(View.VISIBLE);
        supplier.setVisibility(View.GONE);
        buyer.setVisibility(View.GONE);
        supplierSignUp.setVisibility(View.GONE);
        buyerSignUp.setVisibility(View.GONE);
        a1.setVisibility(View.GONE);
        a2.setVisibility(View.GONE);
        a3.setVisibility(View.GONE);
        a4.setVisibility(View.GONE);
        a5.setVisibility(View.GONE);
        a6.setVisibility(View.GONE);
        b1.setVisibility(View.GONE);
        b2.setVisibility(View.GONE);
        b3.setVisibility(View.GONE);
    }

    public void supplier() {
        appProffer.setVisibility(View.VISIBLE);
        supplierSignIn.setVisibility(View.GONE);
        buyerSignIn.setVisibility(View.GONE);
        signInAs.setVisibility(View.GONE);
        supplier.setVisibility(View.VISIBLE);
        buyer.setVisibility(View.GONE);
        supplierSignUp.setVisibility(View.VISIBLE);
        buyerSignUp.setVisibility(View.GONE);
        a1.setVisibility(View.VISIBLE);
        a2.setVisibility(View.VISIBLE);
        a3.setVisibility(View.VISIBLE);
        a4.setVisibility(View.VISIBLE);
        a5.setVisibility(View.VISIBLE);
        a6.setVisibility(View.VISIBLE);
        b1.setVisibility(View.GONE);
        b2.setVisibility(View.GONE);
        b3.setVisibility(View.GONE);
    }

    public void buyer() {
        appProffer.setVisibility(View.VISIBLE);
        supplierSignIn.setVisibility(View.GONE);
        buyerSignIn.setVisibility(View.GONE);
        signInAs.setVisibility(View.GONE);
        supplier.setVisibility(View.GONE);
        buyer.setVisibility(View.VISIBLE);
        supplierSignUp.setVisibility(View.GONE);
        buyerSignUp.setVisibility(View.VISIBLE);
        a1.setVisibility(View.GONE);
        a2.setVisibility(View.GONE);
        a3.setVisibility(View.GONE);
        a4.setVisibility(View.GONE);
        a5.setVisibility(View.GONE);
        a6.setVisibility(View.GONE);
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.supplierSignUp:
            case R.id.buyerSignUp:
                startActivity(new Intent(MainActivity.this, AppLayout.class));
                break;
        }
    }
}