package com.androidmkab.floatingactionbutton;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {

    FloatingActionMenu materialDesignFAM;
    FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3, floatingActionButton4, floatingActionButton5, floatingActionButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.social_floating_menu);
        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.floating_facebook);
        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.floating_twitter);
        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.floating_linkdin);
        floatingActionButton4 = (FloatingActionButton) findViewById(R.id.floating_google_plus);
        floatingActionButton5 = (FloatingActionButton) findViewById(R.id.floating_instagram);
        floatingActionButton6 = (FloatingActionButton) findViewById(R.id.floating_youtube);

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                Intent facebookIntent = getOpenFacebookIntent(MainActivity.this);
                startActivity(facebookIntent);

            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu second item clicked
                Intent twitterIntent = getOpenTwitterIntent(MainActivity.this);
                startActivity(twitterIntent);

            }
        });
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu third item clicked
                Intent linkdinIntent = getOpenLinkdinIntent(MainActivity.this);
                startActivity(linkdinIntent);
            }
        });

        floatingActionButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                Intent googleplusIntent = getOpenGPlusIntent(MainActivity.this);
                startActivity(googleplusIntent);
            }
        });
        floatingActionButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu second item clicked
                Intent instagramIntent = getOpenInstagramIntent(MainActivity.this);
                startActivity(instagramIntent);
            }
        });

    }

    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0); //Checks if FB is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://page/376227335860239")); //Trys to make intent with FB's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/karthikofficialpage")); //catches and opens a url to the desired page
        }
    }

    public static Intent getOpenTwitterIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.twitter.android", 0); //Checks if Twitter is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/drkarthiik")); //Trys to make intent with Twitter's's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/drkarthiik")); //catches and opens a url to the desired page
        }
    }

    public static Intent getOpenLinkdinIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.linkedin.android", 0); //Checks if Linkdin is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com/in/karthikm128")); //Trys to make intent with Linkdin's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com/in/karthikm128")); //catches and opens a url to the desired page
        }
    }

    public static Intent getOpenGPlusIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.google.android.apps.plus", 0); //Checks if G+ is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://plus.google.com/u/0/+KarthikM128")); //Trys to make intent with G+'s URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://plus.google.com/u/0/+KarthikM128")); //catches and opens a url to the desired page
        }
    }

    public static Intent getOpenInstagramIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.instagram.android", 0); //Checks if Instagram is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/accounts/login/")); //Trys to make intent with Instagram's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/accounts/login/")); //catches and opens a url to the desired page
        }
    }

    public static Intent getOpenYouTubeIntent(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.google.android.youtube", 0); //Checks if YT is even installed.
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/karthikm128")); //Trys to make intent with YT's URI
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/karthikm128")); //catches and opens a url to the desired page
        }
    }




}
