package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//
//    private ListView listView;
//    private ArrayAdapter<String> arrayAdapter;
//    private ArrayList <String> list;

    private ArrayList<String> taskList = new ArrayList<>();
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testlayout);

        taskList.add("task1");
        taskList.add("task2");

        arrayAdapter = new ArrayAdapter<String>(this, R.layout.listitem , taskList );

        ListView listView = findViewById(R.id.taskListView);

        listView.setAdapter(arrayAdapter);
//        int textID = R.id.testText;
//        TextView tv = findViewById(textID);
//        tv.setText("khodafezzz");


    }

    public void tabeeBadAzClick(View view){

////        Intent intent = new Intent(this, TasksPageActivity.class);
////        intent.putExtra("LOGIN_INFO", editText.getText().toString());
////        startActivity(intent);
//
        EditText editText = findViewById(R.id.taskNameInput);
        String input = editText.getText().toString();
//        taskList.add(input);
        arrayAdapter.add(input);
//        Log.e("USER INPUT", "user entered a non valid number");
        Log.i("input user", "USER ENTERED: " + input);
        Log.e("input user", "USER ENTERED WRONG INPUT");
        Log.w("input user", "USER DOESNT SOUND GOOD");





        Integer textId = R.id.testText;
        TextView textView = findViewById(textId);
        Integer newNumber = taskList.size();
        textView.setText(newNumber.toString());

//        Integer myNumber = Integer.valueOf( textView.getText().toString() );
//        myNumber ++;
//        textView.setText(myNumber.toString());
//        Intent intent = new Intent(this, SecondPageActivity.class);
//        startActivity(intent);
    }

    public void onTaskClick(View view){
        TextView tv = (TextView) view;
        String taskName = tv.getText().toString();

//        tv.setTextColor( Color.BLUE );
//        tv.setBackgroundColor(getResources().getColor(R.color.banafsheNili));


        Intent intent = new Intent(this, SecondPageActivity.class);

        intent.putExtra("Key", taskName);

//        intent.putExtra("taskName", tv.getText().toString());
        startActivity(intent);
    }

    public void onButtonClicked(View view){
        Button button = new Button(this);
        LinearLayout linearLayout = findViewById(R.id.LinLayout);
        linearLayout.addView(button);

//        LinearLayout ll = findViewById(R.id.LinearLayout);
//        ll.setBackground(getResources().getDrawable(R.drawable.ic_launcher_background));
//        ll.addView(button);
//        Intent intent = new Intent(this, SecondPageActivity.class);
//        intent.putExtra   ("taskName", tv.getText().toString());
//        startActivity(intent);
    }









//        list = new ArrayList<>();
//        list.add("hiiiiiiiii");
//        list.add("asdasdasdasd");
//        listView = findViewById(R.id.showList);
//        arrayAdapter = new ArrayAdapter<String>(this, R.layout.listitem , list );
//        listView.setAdapter(arrayAdapter);
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//    }
//
//    public void onTaskSubmit(View view){
//
//        EditText editText = findViewById(R.id.taskTextInput);
//        arrayAdapter.add( editText.getText().toString() );
//        Log.i("ONCLICK", "Size: " + list.size());
//
////        Intent intent = new Intent(this, TasksPageActivity.class);
////        intent.putExtra("LOGIN_INFO", editText.getText().toString());
////        startActivity(intent);
//    }
//
//    public void onTaskClick(View view){
//        view.setBackgroundColor(Color.BLUE);
//    }
//
//    public void onTextClick(View view){
//        Log.i("HIIIIIIII", "Size: " + list.size());
//        EditText editText = (EditText) view;
//        editText.setText("");
//    }
}
