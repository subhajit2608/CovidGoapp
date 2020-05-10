package com.example.covid19app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HealthExpertActivity extends AppCompatActivity {

    private static final int REQUEST_CALL=1;
     private TextView callText,callText1,callText2,callText3,callText4,callText5,callText6,callText7,callText8,callText9,callText10,callText11,
                         callText12,callText13,callText14,callText15,callText16,callText17,callText18,callText19,callText20,callText21,callText22,callText23,
                         callText24,callText25,callText26,callText27;
    private Button callBtn,callBtn1,callBtn2,callBtn3,callBtn4,callBtn5,callBtn6,callBtn7,callBtn8,callBtn9,callBtn10,callBtn11,callBtn12,callBtn13,callBtn14,callBtn15,callBtn16,callBtn17,callBtn18,
                         callBtn19,callBtn20,callBtn21,callBtn22,callBtn23,callBtn24,callBtn25,callBtn26,callBtn27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_expert);

        callText=findViewById(R.id.phn1);
        callText1=findViewById(R.id.phn2);
        callText2=findViewById(R.id.phn3);
        callText3=findViewById(R.id.phn4);
        callText4=findViewById(R.id.phn5);
        callText5=findViewById(R.id.phn6);
        callText6=findViewById(R.id.phn7);
        callText7=findViewById(R.id.phn8);
        callText8=findViewById(R.id.phn9);
        callText9=findViewById(R.id.phn10);
        callText10=findViewById(R.id.phn11);
        callText11=findViewById(R.id.phn12);
        callText12=findViewById(R.id.phn13);
        callText13=findViewById(R.id.phn14);
        callText14=findViewById(R.id.phn15);
        callText15=findViewById(R.id.phn16);
        callText16=findViewById(R.id.phn17);
        callText17=findViewById(R.id.phn18);
        callText18=findViewById(R.id.phn19);
        callText19=findViewById(R.id.phn20);
        callText20=findViewById(R.id.phn21);
        callText21=findViewById(R.id.phn22);
        callText22=findViewById(R.id.phn23);
        callText23=findViewById(R.id.phn24);
        callText24=findViewById(R.id.phn25);
        callText25=findViewById(R.id.phn26);
        callText26=findViewById(R.id.phn27);
        callText27=findViewById(R.id.phn28);



        callBtn=findViewById(R.id.expert1);
        callBtn1=findViewById(R.id.expert2);
        callBtn2=findViewById(R.id.expert3);
        callBtn3=findViewById(R.id.expert4);
        callBtn4=findViewById(R.id.expert5);
        callBtn5=findViewById(R.id.expert6);
        callBtn6=findViewById(R.id.expert7);
        callBtn7=findViewById(R.id.expert8);
        callBtn8=findViewById(R.id.expert9);
        callBtn9=findViewById(R.id.expert10);
        callBtn10=findViewById(R.id.expert11);
        callBtn11=findViewById(R.id.expert12);
        callBtn12=findViewById(R.id.expert13);
        callBtn13=findViewById(R.id.expert14);
        callBtn14=findViewById(R.id.expert15);
        callBtn15=findViewById(R.id.expert16);
        callBtn16=findViewById(R.id.expert17);
        callBtn17=findViewById(R.id.expert18);
        callBtn18=findViewById(R.id.expert19);
        callBtn19=findViewById(R.id.expert20);
        callBtn20=findViewById(R.id.expert21);
        callBtn21=findViewById(R.id.expert22);
        callBtn22=findViewById(R.id.expert23);
        callBtn23=findViewById(R.id.expert24);
        callBtn24=findViewById(R.id.expert25);
        callBtn25=findViewById(R.id.expert26);
        callBtn26=findViewById(R.id.expert27);
        callBtn27=findViewById(R.id.expert28);




        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton();
            }
        });

        callBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton1();
            }
        });

        callBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton2();
            }
        });

        callBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton3();
            }
        });

        callBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton4();
            }
        });

        callBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton5();
            }
        });

        callBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton6();
            }
        });

        callBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton7();
            }
        });

        callBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton8();
            }
        });

        callBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton9();
            }
        });

        callBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton10();
            }
        });

        callBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton11();
            }
        });

        callBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton12();
            }
        });

        callBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton13();
            }
        });

        callBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton14();
            }
        });

        callBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton15();
            }
        });

        callBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton16();
            }
        });

        callBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton17();
            }
        });

        callBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton18();
            }
        });

        callBtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton19();
            }
        });

        callBtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton20();
            }
        });

        callBtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton21();
            }
        });

        callBtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton22();
            }
        });

        callBtn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton23();
            }
        });

        callBtn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton24();
            }
        });

        callBtn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton25();
            }
        });

        callBtn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton26();
            }
        });

        callBtn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CallButton27();
            }
        });

    }

    private void CallButton(){
        String number=callText.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton1(){
        String number=callText1.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton2(){
        String number=callText2.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton3(){
        String number=callText3.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton4(){
        String number=callText4.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton5(){
        String number=callText5.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton6(){
        String number=callText6.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton7(){
        String number=callText7.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton8(){
        String number=callText8.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton9(){
        String number=callText9.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton10(){
        String number=callText10.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton11(){
        String number=callText11.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton12(){
        String number=callText12.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton13(){
        String number=callText13.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton14(){
        String number=callText14.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton15(){
        String number=callText15.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton16(){
        String number=callText16.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton17(){
        String number=callText17.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton18(){
        String number=callText18.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton19(){
        String number=callText19.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton20(){
        String number=callText20.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton21(){
        String number=callText21.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }



    private void CallButton22(){
        String number=callText22.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton23(){
        String number=callText23.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton24(){
        String number=callText24.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton25(){
        String number=callText25.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton26(){
        String number=callText26.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    private void CallButton27(){
        String number=callText27.getText().toString();
        if (number.trim().length()>0){
            if (ContextCompat.checkSelfPermission(HealthExpertActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(HealthExpertActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            }
            else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }




    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode==REQUEST_CALL){
            if (grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED) {
                CallButton();
                CallButton1();
                CallButton2();
                CallButton3();
                CallButton4();
                CallButton5();
                CallButton6();
                CallButton7();
                CallButton8();
                CallButton9();
                CallButton10();
                CallButton11();
                CallButton12();
                CallButton13();
                CallButton14();
                CallButton15();
                CallButton16();
                CallButton17();
                CallButton18();
                CallButton19();
                CallButton20();
                CallButton21();
                CallButton22();
                CallButton23();
                CallButton24();
                CallButton25();
                CallButton26();
                CallButton27();

            }
            else
            {
                Toast.makeText(this,"Permission Denied",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
