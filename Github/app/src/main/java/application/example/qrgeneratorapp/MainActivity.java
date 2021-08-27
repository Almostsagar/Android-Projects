package application.example.qrgeneratorapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.WriterException;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class MainActivity extends AppCompatActivity {
    EditText qrInput;
    Button generateBtn, scanBtn;
    ImageView qrPlaceHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qrInput = findViewById(R.id.qrInput);
        generateBtn = findViewById(R.id.generateBtn);
        scanBtn = findViewById(R.id.scanBtn);
        qrPlaceHolder = findViewById(R.id.qrPlaceHolder);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = qrInput.getText().toString();
                if (data.isEmpty()){
                    qrInput.setError("Value Required");
                }else{
                    QRGEncoder qrgEncoder = new QRGEncoder(data, null, QRGContents.Type.TEXT, 500);
                    try {
                        Bitmap qrBits = qrgEncoder.getBitmap();
                        qrPlaceHolder.setImageBitmap(qrBits);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Scanner.class));
            }
        });
    }
}