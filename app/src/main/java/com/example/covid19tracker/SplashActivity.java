package com.example.covid19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_SCREEN_TIMEOUT = 2000;

    private String version;
    private String appUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.navigationBarColor));

//        checkConnection();

//        CheckForUpdate();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN_TIMEOUT);
    }

//    private void CheckForUpdate() {
//        try {
//            version = this.getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
//
//            firebaseDatabase = FirebaseDatabase.getInstance();
//            databaseReference = firebaseDatabase.getReference("Version").child("versionNumber");
//            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
//                @Override
//                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                    String versionName = (String) dataSnapshot.getValue();
//
//                    if (!versionName.equals(version)) {
//                        //Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();
//
//                        AlertDialog alertDialog = new AlertDialog.Builder(SplashActivity.this)
//                                .setTitle("New Version Available!")
//                                .setMessage("Please update your app to the latest version for continuous use.")
//                                .setPositiveButton("UPDATE", new DialogInterface.OnClickListener() {
//                                    @Override
//                                    public void onClick(DialogInterface dialog, int which) {
//                                        DatabaseReference myRef = FirebaseDatabase.getInstance().getReference("Version").child("appUrl");
//                                        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
//                                            @Override
//                                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                                appUrl = dataSnapshot.getValue().toString();
//                                                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(appUrl)));
//                                                finish();
//                                            }
//
//                                            @Override
//                                            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                                            }
//                                        });
//                                    }
//                                })
//                                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
//                                    @Override
//                                    public void onClick(DialogInterface dialog, int which) {
//                                        finish();
//                                    }
//                                })
//                                .create();
//
//                        alertDialog.setCancelable(false);
//                        alertDialog.setCanceledOnTouchOutside(false);
//
//                        alertDialog.show();
//                    } else {
//                        int SPLASH_SCREEN_TIMEOUT = 2000;
//                        new Handler().postDelayed(new Runnable() {
//                            @Override
//                            public void run() {
//
//                                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//                                startActivity(intent);
//                                finish();
//                            }
//                        }, SPLASH_SCREEN_TIMEOUT);
//                    }
//
//                }
//
//                @Override
//                public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                }
//            });
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    public void checkConnection(){
//        ConnectivityManager manager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
//
//        NetworkInfo activeNetwork = manager.getActiveNetworkInfo();
//
//        if(null!=activeNetwork){
//        }
//        if(activeNetwork.getType() == ConnectivityManager.TYPE_WIFI){
//            Toast.makeText(this, "wifi enabled", Toast.LENGTH_SHORT).show();
//        }
//        if(activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE){
//            Toast.makeText(this, "mobile enabled", Toast.LENGTH_SHORT).show();
//        }
//
//        else {
//            Toast.makeText(this, "No internet", Toast.LENGTH_SHORT).show();
//        }
//
//    }

}