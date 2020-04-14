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

    private Button numero0, numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9,
            suma, resta, multiplicacion, division, btnAC, igual, btnPower, btnPunto, btnBorrar, btnRaiz, btnPotencia;
    private TextView display, display2;
    boolean estado = false;
    DecimalFormat formato = new DecimalFormat("#.####");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btnPotencia = (Button) findViewById(R.id.btnPot);
        btnPotencia.setOnClickListener(this);
        btnRaiz = (Button) findViewById(R.id.btnRaiz);
        btnRaiz.setOnClickListener(this);
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


    Double numeroAnterior = null;
    String resultado = "";
    char signo = ' ';
    double segundoNumero = ' ';
    String pantallaInvisible="";

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCero:
                if (pantallaInvisible.isEmpty() || pantallaInvisible == null){
                    pantallaInvisible =""+0;
                }else{
                    pantallaInvisible = pantallaInvisible+"0";
                }

                if ((display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")) && !(display.getText().toString().contains("√")) ){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (numeroAnterior == null){
                        resultado = resultado.toString();
                    }else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                    }
                    display2.setText("= "+resultado);
                }

                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (signo == '-'){
                        pantallaInvisible = "";
                        Toast.makeText(MainActivity.this, "ERROR: no se permiten numeros negativos", Toast.LENGTH_LONG).show();
                    } else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                        display2.setText("= "+resultado);
                    }

                }

                display.setText(display.getText().toString()+"0");

                break;
            case R.id.btnUno:
                if (pantallaInvisible.isEmpty() || pantallaInvisible == null){
                    pantallaInvisible =""+1;
                }else{
                    pantallaInvisible = pantallaInvisible+"1";
                }

                if ((display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")) && !(display.getText().toString().contains("√")) ){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (numeroAnterior == null){
                        resultado = resultado.toString();
                    }else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                    }
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (signo == '-'){
                        pantallaInvisible = "";
                        Toast.makeText(MainActivity.this, "ERROR: no se permiten numeros negativos", Toast.LENGTH_LONG).show();
                    } else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                        display2.setText("= "+resultado);
                    }
                }
                display.setText(display.getText().toString()+"1");
                break;
            case R.id.btnDos:
                if (pantallaInvisible.isEmpty() || pantallaInvisible == null){
                    pantallaInvisible =""+2;
                }else{
                    pantallaInvisible = pantallaInvisible+"2";
                }

                if ((display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")) && !(display.getText().toString().contains("√")) ){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (numeroAnterior == null){
                        resultado = resultado.toString();

                    }else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                    }
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (signo == '-'){
                        pantallaInvisible = "";
                        Toast.makeText(MainActivity.this, "ERROR: no se permiten numeros negativos", Toast.LENGTH_LONG).show();
                    } else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                        display2.setText("= "+resultado);
                    }
                }
                display.setText(display.getText().toString()+"2");
                break;
            case R.id.btnTres:
                if (pantallaInvisible.isEmpty() || pantallaInvisible == null){
                    pantallaInvisible =""+3;
                }else{
                    pantallaInvisible = pantallaInvisible+"3";
                }

                if ((display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")) && !(display.getText().toString().contains("√")) ){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (numeroAnterior == null){
                        resultado = resultado.toString();

                    }else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                    }
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (signo == '-'){
                        pantallaInvisible = "";
                        Toast.makeText(MainActivity.this, "ERROR: no se permiten numeros negativos", Toast.LENGTH_LONG).show();
                    } else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                        display2.setText("= "+resultado);
                    }
                }

                display.setText(display.getText().toString()+"3");
                break;
            case R.id.btnCuatro:
                if (pantallaInvisible.isEmpty() || pantallaInvisible == null){
                    pantallaInvisible =""+4;
                }else{
                    pantallaInvisible = pantallaInvisible+"4";
                }

                if ((display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")) && !(display.getText().toString().contains("√")) ){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (numeroAnterior == null){
                        resultado = resultado.toString();
                    }else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                    }
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (signo == '-'){
                        pantallaInvisible = "";
                        Toast.makeText(MainActivity.this, "ERROR: no se permiten numeros negativos", Toast.LENGTH_LONG).show();
                    } else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                        display2.setText("= "+resultado);
                    }
                }
                display.setText(display.getText().toString()+"4");
                break;
            case R.id.btnCinco:
                if (pantallaInvisible.isEmpty() || pantallaInvisible == null){
                    pantallaInvisible =""+5;
                }else{
                    pantallaInvisible = pantallaInvisible+"5";
                }

                if ((display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")) && !(display.getText().toString().contains("√")) ){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (numeroAnterior == null){
                        resultado = resultado.toString();
                    }else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                    }
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (signo == '-'){
                        pantallaInvisible = "";
                        Toast.makeText(MainActivity.this, "ERROR: no se permiten numeros negativos", Toast.LENGTH_LONG).show();
                    } else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                        display2.setText("= "+resultado);
                    }
                }

                display.setText(display.getText().toString()+"5");

                break;
            case R.id.btnSeis:
                if (pantallaInvisible.isEmpty() || pantallaInvisible == null){
                    pantallaInvisible =""+6;
                }else{
                    pantallaInvisible = pantallaInvisible+"6";
                }

                if ((display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")) && !(display.getText().toString().contains("√")) ){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (numeroAnterior == null){
                        resultado = resultado.toString();
                    }else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                    }
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (signo == '-'){
                        pantallaInvisible = "";
                        Toast.makeText(MainActivity.this, "ERROR: no se permiten numeros negativos", Toast.LENGTH_LONG).show();
                    } else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                        display2.setText("= "+resultado);
                    }
                }
                display.setText(display.getText().toString()+"6");
                break;
            case R.id.btnSiete:
                if (pantallaInvisible.isEmpty() || pantallaInvisible == null){
                    pantallaInvisible =""+7;
                }else{
                    pantallaInvisible = pantallaInvisible+"7";
                }
                if ((display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")) && !(display.getText().toString().contains("√")) ){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (numeroAnterior == null){
                        resultado = resultado.toString();
                    }else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                    }
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (signo == '-'){
                        pantallaInvisible = "";
                        Toast.makeText(MainActivity.this, "ERROR: no se permiten numeros negativos", Toast.LENGTH_LONG).show();
                    } else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                        display2.setText("= "+resultado);
                    }
                }
                display.setText(display.getText().toString()+"7");
                break;
            case R.id.btnOcho:
                if (pantallaInvisible.isEmpty() || pantallaInvisible == null){
                    pantallaInvisible =""+8;
                }else{
                    pantallaInvisible = pantallaInvisible+"8";
                }

                if ((display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")) && !(display.getText().toString().contains("√")) ){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (numeroAnterior == null){
                        resultado = resultado.toString();
                    }else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                    }
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (signo == '-'){
                        pantallaInvisible = "";
                        Toast.makeText(MainActivity.this, "ERROR: no se permiten numeros negativos", Toast.LENGTH_LONG).show();
                    } else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                        display2.setText("= "+resultado);
                    }
                }

                display.setText(display.getText().toString()+"8");
                break;
            case R.id.btnNueve:
                if (pantallaInvisible.isEmpty() || pantallaInvisible == null){
                    pantallaInvisible =""+9;
                }else{
                    pantallaInvisible = pantallaInvisible+"9";
                }

                if ((display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("/") || display.getText().toString().contains("*")) && !(display.getText().toString().contains("√")) ){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (numeroAnterior == null){
                        resultado = resultado.toString();
                    }else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                    }
                    display2.setText("= "+resultado);
                }
                if (display.getText().toString().contains("√")){
                    segundoNumero = Double.parseDouble(pantallaInvisible);
                    if (signo == '-'){
                        pantallaInvisible = "";
                        Toast.makeText(MainActivity.this, "ERROR: no se permiten numeros negativos", Toast.LENGTH_LONG).show();
                    } else{
                        resultado = operar(numeroAnterior,signo,segundoNumero);
                        display2.setText("= "+resultado);
                    }
                }
                display.setText(display.getText().toString()+"9");
                break;
            case R.id.btnMas:
                if (!pantallaInvisible.isEmpty()){
                    pantallaInvisible = pantallaInvisible.replace(',','.');
                    numeroAnterior = Double.parseDouble(pantallaInvisible);
                }
                pantallaInvisible ="";
                if(resultado != null && !resultado.isEmpty() && !resultado.equals("ERROR")){
                    resultado = resultado.replace(',','.');
                    display.setText(resultado);
                    numeroAnterior = Double.parseDouble(resultado);
                }
                signo = '+';
                if (resultado != null  && resultado.equals("ERROR")){
                    display.setText("+");
                }else{
                    display.setText(display.getText().toString()+"+");
                }
                break;
            case R.id.btnMenos:
                if (!pantallaInvisible.isEmpty()){
                    pantallaInvisible = pantallaInvisible.replace(',','.');
                    numeroAnterior = Double.parseDouble(pantallaInvisible);
                }
                pantallaInvisible ="";
                if(resultado != null && !resultado.isEmpty() && !resultado.equals("ERROR")){
                    resultado = resultado.replace(',','.');
                    display.setText(resultado);
                    numeroAnterior = Double.parseDouble(resultado);
                }
                signo = '-';
                if (resultado != null  && resultado.equals("ERROR")){
                    display.setText("-");
                }else{
                    display.setText(display.getText().toString()+"-");
                }
                break;
            case R.id.btnEntre:
                if (!pantallaInvisible.isEmpty()){
                    pantallaInvisible = pantallaInvisible.replace(',','.');
                    numeroAnterior = Double.parseDouble(pantallaInvisible);
                }
                pantallaInvisible ="";
                if(resultado != null && !resultado.isEmpty() && !resultado.equals("ERROR")){
                    resultado = resultado.replace(',','.');
                    display.setText(resultado);
                    numeroAnterior = Double.parseDouble(resultado);
                }

                signo = '/';
                display.setText(display.getText().toString()+"/");
                break;
            case R.id.btnPor:
                if (!pantallaInvisible.isEmpty()){
                    pantallaInvisible = pantallaInvisible.replace(',','.');
                    numeroAnterior = Double.parseDouble(pantallaInvisible);
                }
                pantallaInvisible ="";
                if(resultado != null && !resultado.isEmpty() && !resultado.equals("ERROR")){
                    resultado = resultado.replace(',','.');
                    display.setText(resultado);
                    numeroAnterior = Double.parseDouble(resultado);
                }
                signo = '*';
                display.setText(display.getText().toString()+"*");
                break;
            case R.id.btnIgual:
                display.setText(display.getText().toString());
                display2.setTextSize(60);
                display2.setText("= "+resultado);
                break;
            case R.id.btnAC:
                reiniciar();
                break;
            case R.id.btnPunto:
                pantallaInvisible = pantallaInvisible+".";
                display.setText(display.getText().toString()+".");
                break;
            case R.id.btnPower:
                reiniciar();
                activarDesactivarComponentes();
                break;

            case R.id.btnBorrar:
                String pantalla = display.getText().toString();
                if (pantalla.contains("^")){
                    reiniciar();
                    pantalla ="";

                }
                if (pantalla.length()>0){
                    pantalla = pantalla.substring(0,pantalla.length()-1);
                    display.setText(pantalla);
                }
                if (contieneSigno()){
                    String[] partes;
                    if(pantalla.contains("-")){
                        partes   = pantalla.split("-");
                        signo = '-';
                        numeroAnterior=Double.parseDouble(partes[0]);
                        if (partes.length == 2){
                            System.out.println(partes[1]);
                            pantallaInvisible = partes[1];
                            display2.setText("= "+operar(numeroAnterior,signo,Double.parseDouble(pantallaInvisible)));
                        }else{
                            pantallaInvisible = "";
                        }
                    }
                    if(pantalla.contains("+")){
                        partes   = pantalla.split("\\+");
                        signo = '+';
                        numeroAnterior=Double.parseDouble(partes[0]);
                        if (partes.length == 2){
                            System.out.println(partes[1]);
                            pantallaInvisible = partes[1];
                            display2.setText("= "+operar(numeroAnterior,signo,Double.parseDouble(pantallaInvisible)));
                        }else{
                            pantallaInvisible = "";
                        }
                    }
                    if(pantalla.contains("*")){
                        partes   = pantalla.split("\\*");
                        signo = '-';
                        numeroAnterior=Double.parseDouble(partes[0]);
                        if (partes.length == 2){
                            pantallaInvisible = partes[1];
                            display2.setText("= "+operar(numeroAnterior,signo,Double.parseDouble(pantallaInvisible)));
                        }else{
                            pantallaInvisible = "";
                        }
                    }
                    if(pantalla.contains("/")){
                        partes   = pantalla.split("/");
                        signo = '-';
                        numeroAnterior=Double.parseDouble(partes[0]);
                        if (partes.length == 2){
                            pantallaInvisible = partes[1];
                            display2.setText("= "+operar(numeroAnterior,signo,Double.parseDouble(pantallaInvisible)));
                        }else{
                            pantallaInvisible = "";
                        }
                    }
                   }else{
                    if (pantalla.contains("^")){
                        pantalla ="";
                        reiniciar();
                    }
                    if (pantalla.length()>=1){
                        if (pantalla.contains("√")){
                         pantalla = pantalla.substring(1);
                         if (pantalla.length()>0){
                             numeroAnterior = Double.parseDouble(pantalla);
                         }
                        }else{
                            numeroAnterior = Double.parseDouble(pantalla);
                        }
                    }
                        pantallaInvisible = "";
                   }



                    break;

            case R.id.btnRaiz:
               numeroAnterior = 1.0;
                pantallaInvisible ="";
                signo = '√';
                display.setText("√");

               break;
            case R.id.btnPot:
                if (!pantallaInvisible.isEmpty()){
                    pantallaInvisible = pantallaInvisible.replace(',','.');
                    numeroAnterior = Double.parseDouble(pantallaInvisible);
                }
                pantallaInvisible ="";
                if(resultado != null && !resultado.isEmpty() && !resultado.equals("ERROR")){
                    resultado = resultado.replace(',','.');
                    display.setText(resultado);
                    numeroAnterior = Double.parseDouble(resultado);
                }
                signo = '^';
                if (numeroAnterior != null){
                    resultado = operar(numeroAnterior,signo,2.0 );
                    resultado = resultado.replace(',', '.');
                    display2.setText(resultado);
                    display.setText("("+display.getText().toString()+")"+"^2");
                }else{
                    Toast.makeText(MainActivity.this, "Primero el numero", Toast.LENGTH_LONG).show();
                }
                break;
        }
    }

    public boolean contieneSigno(){
        if (display.getText().toString().contains("+") || display.getText().toString().contains("-") || display.getText().toString().contains("*") || display.getText().toString().contains("/") ){
            return true;
        }else{
            return false;
        }
    }
    public void reiniciar(){
        numeroAnterior = null;
        resultado = "";
        signo = ' ';
        segundoNumero = ' ';
        pantallaInvisible="";
        display.setText("");
        display2.setText("");
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
        btnRaiz.setEnabled(estado);
        btnPotencia.setEnabled(estado);
        estado = !estado;

        if ((estado == true)) {
            btnPower.setText("ON");
        } else {
            btnPower.setText("OFF");
        }
    }

    public String operar(Double resultado, char signo, Double segundoNumero){
        display2.setTextSize(40);
        double resp = resultado;
        switch (signo){
            case '+':
                resp = resultado+segundoNumero;
                break;
            case '-':
                resp = resultado-segundoNumero;
                break;
            case '/':
                if (segundoNumero != 0){
                    resp= resultado/segundoNumero;
                }else {
                    Toast.makeText(MainActivity.this, "ERROR: no se puede dividir entre cero", Toast.LENGTH_LONG).show();

                    return "ERROR";
                }

                break;

            case'*':
                resp = resultado*segundoNumero;

                break;

            case '√':
                resp = Math.sqrt(segundoNumero);
                break;
            case '^':
                resp = Math.pow(numeroAnterior,segundoNumero);
                break;
        }

         return formato.format(resp);
    }
}
