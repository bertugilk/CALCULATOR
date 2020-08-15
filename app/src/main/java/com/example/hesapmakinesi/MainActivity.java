package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button9,button8,button7,button6,button5,button4,button3,button2,button1,button0,
            buttonTopla,buttonCikart,buttonCarp,buttonBol,buttonEsittir,buttonNokta,
            buttonCE,buttonDel;

    TextView screen;
    private Boolean islem=false;
    private Double num1;
    private int number2Index=0;
    private char islemSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        screen=findViewById(R.id.screen);
        button9=findViewById(R.id.btn9);
        button8=findViewById(R.id.btn8);
        button7=findViewById(R.id.btn7);
        button6=findViewById(R.id.btn6);
        button5=findViewById(R.id.btn5);
        button4=findViewById(R.id.btn4);
        button3=findViewById(R.id.btn3);
        button2=findViewById(R.id.btn2);
        button1=findViewById(R.id.btn1);
        button0=findViewById(R.id.btn0);

        buttonTopla=findViewById(R.id.btnTopla);
        buttonCikart=findViewById(R.id.btnCikar);
        buttonCarp=findViewById(R.id.btnCarp);
        buttonBol=findViewById(R.id.btnBol);
        buttonEsittir=findViewById(R.id.btnEsittir);
        buttonNokta=findViewById(R.id.btnNokta);
        buttonDel=findViewById(R.id.btnDEL);
        buttonCE=findViewById(R.id.btnCE);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("9");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("8");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("7");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("6");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("5");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("4");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("3");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("3");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("2");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("1");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append("0");
            }
        });

        buttonTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ekranVerisi=screen.getText().toString();
                number2Index=ekranVerisi.length()+1;
                num1=Double.parseDouble(ekranVerisi);
                screen.append("+");
                islem=true;
                islemSec='+';
            }
        });

        buttonCikart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ekranVerisi=screen.getText().toString();
                number2Index=ekranVerisi.length()+1;
                num1=Double.parseDouble(ekranVerisi);
                screen.append("-");
                islem=true;
                islemSec='-';
            }
        });
        buttonCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ekranVerisi=screen.getText().toString();
                number2Index=ekranVerisi.length()+1;
                num1=Double.parseDouble(ekranVerisi);
                screen.append("*");
                islem=true;
                islemSec='*';
            }
        });
        buttonBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ekranVerisi=screen.getText().toString();
                number2Index=ekranVerisi.length()+1;
                num1=Double.parseDouble(ekranVerisi);
                screen.append("/");
                islem=true;
                islemSec='/';
            }
        });

        buttonNokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.append(".");
            }
        });

        buttonEsittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(islem){
                   if(islemSec=='+'){
                       String ekranVerisi=screen.getText().toString();
                       String num2String=ekranVerisi.substring(number2Index,ekranVerisi.length());
                       double num2=Double.parseDouble(num2String);
                       num2+=num1;
                       screen.setText(String.valueOf(num2));
                   }
                   if(islemSec=='-'){
                       String ekranVerisi=screen.getText().toString();
                       double num2=Double.parseDouble(ekranVerisi.substring(number2Index,ekranVerisi.length()));
                       num1-=num2;
                       screen.setText(String.valueOf(num1));
                   }
                   if(islemSec=='*'){
                       String ekranVerisi=screen.getText().toString();
                       double num2=Double.parseDouble(ekranVerisi.substring(number2Index,ekranVerisi.length()));
                       num2*=num1;
                       screen.setText(String.valueOf(num2));
                   }
                   if(islemSec=='/'){
                       String ekranVerisi=screen.getText().toString();
                       double num2=Double.parseDouble(ekranVerisi.substring(number2Index,ekranVerisi.length()));
                       num1/=num2;
                       screen.setText(String.valueOf(num1));
                   }
               }
            }
        });

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("");
            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String elements=screen.getText().toString();
                int length=elements.length();
                if(length>0){
                    elements=elements.substring(0,length-1);
                    screen.setText(elements);
                }
            }
        });
    }
}