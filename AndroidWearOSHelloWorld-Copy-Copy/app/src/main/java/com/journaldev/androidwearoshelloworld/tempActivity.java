//package com.journaldev.androidwearoshelloworld;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.wear.widget.BoxInsetLayout;
//import android.support.wearable.activity.WearableActivity;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.support.wear.widget.WearableRecyclerView;
//import android.support.wear.widget.WearableLinearLayoutManager;
//
//public class SecondActivity extends MainActivity {
//
//    private static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
//    private WearableRecyclerView wearableRecyclerView;
//    private BoxInsetLayout boxInsetLayout;
//    private TextView textView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second);
//
//        boxInsetLayout = findViewById(R.id.second_activity);
//
//        // Enables Always-on
//        setAmbientEnabled();
//    }
//
//    public void sendMessage (View view) {
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }
//
//}
