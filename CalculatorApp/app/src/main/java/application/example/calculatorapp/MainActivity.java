package application.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnplus ,btnminus,btndiv,btninto,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnc,btnres,btndot;
    EditText ed1;
    float res1,res2;
    boolean add,sub,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);   // define the variables inside oncreate fn
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btn0 = (Button)findViewById(R.id.btn0);
        btnplus = (Button)findViewById(R.id.btnplus);
        btnminus = (Button)findViewById(R.id.btnminus);
        btninto = (Button)findViewById(R.id.btninto);
        btndiv = (Button)findViewById(R.id.btndiv);
        btnc = (Button)findViewById(R.id.btnc);
        btnres = (Button)findViewById(R.id.btnres);
        btndot = (Button)findViewById(R.id.btndot);
        ed1 = (EditText)findViewById(R.id.ed1);
        btn1.setOnClickListener(new View.OnClickListener() {     // on click what happens
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }
                else {
                    res1 = Float.parseFloat(ed1.getText()+ "");
                    add = true;
                    ed1.setText(null);
                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }
                else {
                    res1 = Float.parseFloat(ed1.getText()+ "");
                    sub = true;
                    ed1.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }
                else {
                    res1 = Float.parseFloat(ed1.getText()+ "");
                    div = true;
                    ed1.setText(null);
                }
            }
        });
        btninto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }
                else {
                    res1 = Float.parseFloat(ed1.getText()+ "");
                    mul = true;
                    ed1.setText(null);
                }
            }
        });
        btnres.setOnClickListener(new View.OnClickListener() {    // finally on clicking result what happens
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"");
                if (ed1 == null){
                    ed1.setText("");
                }
                else {
                    res2 = Float.parseFloat(ed1.getText()+ "");
                    if (add==true){
                        ed1.setText(res1 + res2 + "");
                        add = false;
                    }
                    if (sub==true){
                        ed1.setText(res1 - res2 + "");
                        add = false;
                    }
                    if (mul==true){
                        ed1.setText(res1 * res2 + "");
                        add = false;
                    } if (div==true){
                        ed1.setText(res1 / res2 + "");
                        add = false;
                    }


                }
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });

    }
}