package ues.edu.sv.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button numero0, numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9;
    private Button suma, resta, multiplicacion, division;
    private Button btnAC;
    private Button igual;
    private TextView display;
    private TextView display2;
    private Button btnPower;
    boolean estado = false;
    private Button btnPunto;
    private Button btnBorrar;
    private Button btnPorcentaje;
    private Button btnParentesis;
    private Button btnRaiz;
    private Button btnMasMenos;
    private Button btnPotencia;

    DecimalFormat formato = new DecimalFormat("#.####");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getSupportActionBar().hide();

        btnPotencia = (Button) findViewById(R.id.btnPot);
        btnPotencia.setOnClickListener(this);
        btnRaiz = (Button) findViewById(R.id.btnRaiz);
        btnRaiz.setOnClickListener(this);
        btnMasMenos = (Button) findViewById(R.id.btnMasMenos);
        btnMasMenos.setOnClickListener(this);
        btnPorcentaje = (Button) findViewById(R.id.btnPorcentaje);
        btnPorcentaje.setOnClickListener(this);
        btnParentesis = (Button) findViewById(R.id.btnParentesis);
        btnParentesis.setOnClickListener(this);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);
        btnBorrar.setOnClickListener(this);
        btnPunto = (Button) findViewById(R.id.btnPunto);
        btnPunto.setOnClickListener(this);
        btnPower = (Button) findViewById(R.id.btnPower);
        btnPower.setOnClickListener(this);
        numero0 = (Button) findViewById(R.id.btnCero);
        numero0.setOnClickListener(this);
        numero1 = (Button) findViewById(R.id.btnUno);
        numero1.setOnClickListener(this);
        numero2 = (Button) findViewById(R.id.btnDos);
        numero2.setOnClickListener(this);
        numero3 = (Button) findViewById(R.id.btnTres);
        numero3.setOnClickListener(this);
        numero4 = (Button) findViewById(R.id.btnCuatro);
        numero4.setOnClickListener(this);
        numero5 = (Button) findViewById(R.id.btnCinco);
        numero5.setOnClickListener(this);
        numero6 = (Button) findViewById(R.id.btnSeis);
        numero6.setOnClickListener(this);
        numero7 = (Button) findViewById(R.id.btnSiete);
        numero7.setOnClickListener(this);
        numero8 = (Button) findViewById(R.id.btnOcho);
        numero8.setOnClickListener(this);
        numero9 = (Button) findViewById(R.id.btnNueve);
        numero9.setOnClickListener(this);
        btnAC =(Button) findViewById(R.id.btnAC);
        btnAC.setOnClickListener(this);
        suma = (Button)findViewById(R.id.btnMas);
        suma.setOnClickListener(this);
        resta = (Button)findViewById(R.id.btnMenos);
        resta.setOnClickListener(this);
        multiplicacion = (Button)findViewById(R.id.btnPor);
        multiplicacion.setOnClickListener(this);
        division = (Button)findViewById(R.id.btnEntre);
        division.setOnClickListener(this);
        igual = (Button) findViewById(R.id.btnIgual);
        igual.setOnClickListener(this);
        display = (TextView)findViewById(R.id.tvDisplay);
        display2 = (TextView) findViewById(R.id.diplay2);
        activarDesactivarComponentes();


    }


    double numeroAnterior;
    String resultado;
    char signo = ' ';
    double segundoNumero;
    String pantallaInvisible="";
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCero:

                pantallaInvisible = pantallaInvisible+"0";

                if (display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }

                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    numeroAnterior = 1;
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }

                display.setText(display.getText().toString()+"0");

                break;
            case R.id.btnUno:

                pantallaInvisible = pantallaInvisible+"1";

                if (display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    numeroAnterior = 1;
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                display.setText(display.getText().toString()+"1");

                break;
            case R.id.btnDos:
                pantallaInvisible = pantallaInvisible+"2";

                if (display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    numeroAnterior = 1;
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                display.setText(display.getText().toString()+"2");
                break;
            case R.id.btnTres:
                pantallaInvisible = pantallaInvisible+"3";

                if (display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    numeroAnterior = 1;
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                display.setText(display.getText().toString()+"3");

                break;
            case R.id.btnCuatro:
                pantallaInvisible = pantallaInvisible+"4";

                if (display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    numeroAnterior = 1;
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                display.setText(display.getText().toString()+"4");
                break;
            case R.id.btnCinco:
                pantallaInvisible = pantallaInvisible+"5";

                if (display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    numeroAnterior = 1;
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }

                display.setText(display.getText().toString()+"5");

                break;
            case R.id.btnSeis:
                segundoNumero = 6;
                pantallaInvisible = pantallaInvisible+"6";

                if (display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    numeroAnterior = 1;
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                display.setText(display.getText().toString()+"6");
                break;
            case R.id.btnSiete:
                pantallaInvisible = pantallaInvisible+"7";

                if (display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    numeroAnterior = 1;
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                display.setText(display.getText().toString()+"7");
                break;
            case R.id.btnOcho:
                pantallaInvisible = pantallaInvisible+"8";

                if (display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    numeroAnterior = 1;
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }

                display.setText(display.getText().toString()+"8");
                break;
            case R.id.btnNueve:
                pantallaInvisible = pantallaInvisible+"9";

                if (display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    numeroAnterior = 1;
                    resultado = operar(numeroAnterior,signo,segundoNumero);
                    display2.setText("= "+resultado);
                }
                display.setText(display.getText().toString()+"9");
                break;
            case R.id.btnMas:
                numeroAnterior = Double.parseDouble(pantallaInvisible);
                pantallaInvisible ="";
                if(resultado != null){
                    display.setText(resultado);
                    numeroAnterior = Double.parseDouble(resultado);
                }

                signo = '+';
                display.setText(display.getText().toString()+"+");
                break;
            case R.id.btnMenos:
                numeroAnterior = Double.parseDouble(pantallaInvisible);
                pantallaInvisible ="";
                if(resultado != null){
                    display.setText(resultado);
                    numeroAnterior = Double.parseDouble(resultado);
                }

                signo = '-';
                display.setText(display.getText().toString()+"-");
                break;
            case R.id.btnEntre:
                numeroAnterior = Double.parseDouble(pantallaInvisible);
                pantallaInvisible ="";
                if(resultado != null){
                    display.setText(resultado);
                    numeroAnterior = Double.parseDouble(resultado);
                }

                signo = '/';
                display.setText(display.getText().toString()+"/");
                break;
            case R.id.btnPor:
                numeroAnterior = Double.parseDouble(pantallaInvisible);
                pantallaInvisible ="";
                if(resultado != null){
                    display.setText(resultado);
                    numeroAnterior = Double.parseDouble(resultado);
                }
                signo = '*';
                display.setText(display.getText().toString()+"*");
                break;
            case R.id.btnIgual:
                display.setText(display.getText().toString());
                display2.setTextSize(40);
                display2.setText(""+resultado);
                break;
            case R.id.btnAC:
                numeroAnterior = 0;
                display.setText("");
                display2.setText("");
                pantallaInvisible = "";

                break;
            case R.id.btnPunto:
                pantallaInvisible = pantallaInvisible+".";
                display.setText(display.getText().toString()+".");
                break;
            case R.id.btnPower:
                activarDesactivarComponentes();
                break;

            case R.id.btnBorrar:
                if (pantallaInvisible.length()>0){
                    pantallaInvisible = pantallaInvisible.substring(0,pantallaInvisible.length()-1);
                    display.setText(pantallaInvisible);
                }
                break;

            case R.id.btnRaiz:
                numeroAnterior = ' ';
                pantallaInvisible ="";
//                if(resultado != null){
//                    display.setText(resultado);
//                    numeroAnterior = Double.parseDouble(resultado);
//                }
                signo = '√';
                display.setText("√");

               break;
        }
    }

    public void activarDesactivarComponentes(){
        display.setText("");
        display2.setText("");
        numero1.setEnabled(estado);
        numero2.setEnabled(estado);
        numero3.setEnabled(estado);
        numero4.setEnabled(estado);
        numero5.setEnabled(estado);
        numero6.setEnabled(estado);
        numero7.setEnabled(estado);
        numero8.setEnabled(estado);
        numero9.setEnabled(estado);
        numero0.setEnabled(estado);
        btnAC.setEnabled(estado);
        suma.setEnabled(estado);
        resta.setEnabled(estado);
        multiplicacion.setEnabled(estado);
        division.setEnabled(estado);
        igual.setEnabled(estado);
        btnPunto.setEnabled(estado);
        btnPunto.setEnabled(estado); ;
        btnBorrar.setEnabled(estado);
        btnPorcentaje.setEnabled(estado);
        btnParentesis.setEnabled(estado);
        btnRaiz.setEnabled(estado);
        btnMasMenos.setEnabled(estado);
        btnPotencia.setEnabled(estado);
        estado = !estado;

        if ((estado == true)) {
            btnPower.setText("ON");
        } else {
            btnPower.setText("OFF");
        }
    }



    public String operar(double resultado, char signo, double segundoNumero){
        double resp = resultado;
        switch (signo){
            case '+':
                resp = resultado+segundoNumero;
                break;
            case '-':
                resp = resultado-segundoNumero;
                break;
            case '/':
                resp= resultado/segundoNumero;
                break;

            case'*':
                resp = resultado*segundoNumero;

                break;

            case '√':
                resp = Math.sqrt(segundoNumero);
                break;
        }

         return formato.format(resp);
    }
}
