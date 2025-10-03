 package mx.edu.tesoem.isc.tdsmh252_rpadp1a1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1, txtnum2;

    Button btnsumar;

    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.TextView), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        btnsumar = findViewById(R.id.btnsumar);
        lblresultado = findViewById(R.id.lblresultado);

    }
    public void onclicksumar(View view){
        int num1,num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        String cadenaS = "El resultado de la Suma es: "+String.valueOf(num1+num2);
        lblresultado.setText(cadenaS);
    }

    public void onclickrestar(View view){
        int num1,num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        String cadenaR = "El resultado de la Resta es: "+String.valueOf(num1-num2);
        lblresultado.setText(cadenaR);
    }

    public void onclickdividir(View view){
        int num1,num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        String cadenaDiv = "El resultado de la Dividicion es: "+String.valueOf(num1/num2);
        lblresultado.setText(cadenaDiv);
    }

    public void onclickmultiplicar(View view){
        int num1,num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        String cadenaMul = "El resultado de la Multiplicacion es: "+String.valueOf(num1*num2);
        lblresultado.setText(cadenaMul);
    }

    public void onclickPotencia2(View view){
        int num1,num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        String cadenaPot2 = "El resultado de la Potencia cuadrada es: "+String.valueOf(num1*num1);
        lblresultado.setText(cadenaPot2);

    }

    public void onclickPotenciaN(View view){
        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());

        // Math.pow devuelve un double, así que lo convertimos a int si quieres solo enteros
        int resultado = (int) Math.pow(num1, num2);

        String cadenaPotN = "El resultado de " + num1 + " elevado a la " + num2 + " es: " + resultado;
        lblresultado.setText(cadenaPotN);
    }

    public void onclickRaiz(View view){
        int num1;
        num1 = Integer.parseInt(txtnum1.getText().toString());

        // Math.sqrt devuelve un double
        double resultado = Math.sqrt(num1);

        String cadenaRaiz = "La raíz cuadrada de " + num1 + " es: " + resultado;
        lblresultado.setText(cadenaRaiz);
    }


}