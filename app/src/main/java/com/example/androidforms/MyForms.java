package com.example.androidforms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MyForms extends AppCompatActivity {
    EditText Edit_name, Edit_password, Edit_phNumber;
    RadioButton Radio_1, Radio_2;
    CheckBox CheckBox_1, CheckBox_2, CheckBox_3;
    Spinner spinner;
    Button Button_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_forms);

        Edit_name = (EditText) findViewById(R.id.Edit_name);
        Edit_password = (EditText)findViewById(R.id.Edit_password);
        Edit_phNumber =(EditText) findViewById(R.id.Edit_phNumber);
        Radio_1 =(RadioButton) findViewById(R.id.Radio_1);
        Radio_2 = (RadioButton)findViewById(R.id.Radio_2);
        CheckBox_1 = (CheckBox) findViewById(R.id.CheckBox_1);
        CheckBox_2 =(CheckBox) findViewById(R.id.CheckBox_2);
        CheckBox_3 =(CheckBox) findViewById(R.id.CheckBox_3);
        spinner = (Spinner) findViewById(R.id.spinner);
        Button_1 =(Button) findViewById(R.id.Button_1);


        Button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                // Get value from Edit Text;
                String name = Edit_name.getText().toString();
                String password = Edit_password.getText().toString();
                String PhoneNo = Edit_phNumber.getText().toString();

                // Get value from Radio Button;


                String gender ="";
                if (Radio_1.isChecked())
                {
                    gender = Radio_1.getText().toString();
                }
                if (Radio_2.isChecked())
                {
                    gender = Radio_2.getText().toString();
                }

                // Get Value from CheckBox ;

                String interest =" ";
                if(CheckBox_1.isChecked())
                {
                    interest += CheckBox_1.getText().toString()+"\n";
                }
                if(CheckBox_2.isChecked())
                {
                    interest += CheckBox_2.getText().toString()+"\n";
                }
                if(CheckBox_1.isChecked())
                {
                    interest += CheckBox_2.getText().toString()+"\n";
                }

                // Get value from Spinner ;

                String city = spinner.getSelectedItem().toString();

                // Print all values in Toast;

                String allDetails = name+"\n"+password+"\n"+PhoneNo+"\n"+gender+"\n"+interest+"\n"+city;

                LayoutInflater lf = getLayoutInflater();
                View layout =lf.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_linear));

                Toast t = new Toast(getApplicationContext());
                t.setView(layout);
                t.show();
            }
        });


    }
}