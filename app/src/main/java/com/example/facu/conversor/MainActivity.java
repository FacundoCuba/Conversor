package com.example.facu.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Spinner unidadesIniciales = findViewById(R.id.spUnidadInicial);
        //unidadesIniciales.setOnItemSelectedListener(this);
        Spinner unidadesFinales = findViewById(R.id.spUnidadFinal);
        unidadesFinales.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        EditText valor = findViewById(R.id.txtValorInicial);
        //Spinner unidadesIniciales = findViewById(R.id.spUnidadInicial);
        Spinner unidadesFinales = findViewById(R.id.spUnidadFinal);
        TextView resultado = findViewById(R.id.txtResultado);
        NumberFormat formato = new DecimalFormat("##0.##E#0");
        Double n;
        Double calc;
        switch (position) {
            case 0:
                if (unidadesFinales.getSelectedItemPosition() == 0) {
                    n = parseDouble(valor.getText().toString());
                    resultado.setText(String.valueOf(formato.format(n)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 1000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 100000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 1.6;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 1.6 * 1760;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 1.6 * 5280;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 1.6 * 63360;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                }
            case 1:
                if (unidadesFinales.getSelectedItemPosition() == 0) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 1000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                    n = parseDouble(valor.getText().toString());
                    resultado.setText(String.valueOf(formato.format(n)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 100;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 1000) * 1.6;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 1000) * 1.6 * 1760;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 1000) * 1.6 * 5280;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 1000) * 1.6 * 63360;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                }
            case 2:
                if (unidadesFinales.getSelectedItemPosition() == 0) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 100000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 100;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                    n = parseDouble(valor.getText().toString());
                    resultado.setText(String.valueOf(formato.format(n)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 100000) * 1.6;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 100000) * 1.6 * 1760;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 100000) * 1.6 * 5280;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 100000) * 1.6 * 63360;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                }
            case 3:
                if (unidadesFinales.getSelectedItemPosition() == 0) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 1.6;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 1.6) * 1000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 1.6) * 100000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                    n = parseDouble(valor.getText().toString());
                    resultado.setText(String.valueOf(formato.format(n)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 1760;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 5280;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 63360;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                }
            case 4:
                if (unidadesFinales.getSelectedItemPosition() == 0) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 1760 / 1.6;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 1760 / 1.6) * 1000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 1760 / 1.6) * 100000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 1760;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                    n = parseDouble(valor.getText().toString());
                    resultado.setText(String.valueOf(formato.format(n)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 3;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 36;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                }
            case 5:
                if (unidadesFinales.getSelectedItemPosition() == 0) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 5280 / 1.6;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 5280 / 1.6) * 1000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 5280 / 1.6) * 100000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 5280;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 3;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                    n = parseDouble(valor.getText().toString());
                    resultado.setText(String.valueOf(formato.format(n)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                    n = parseDouble(valor.getText().toString());
                    calc = n * 12;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                }
            case 6:
                if (unidadesFinales.getSelectedItemPosition() == 0) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 63360 / 1.6;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 63360 / 1.6) * 1000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                    n = parseDouble(valor.getText().toString());
                    calc = (n / 63360 / 1.6) * 100000;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 63360;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 5280;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                    n = parseDouble(valor.getText().toString());
                    calc = n / 12;
                    resultado.setText(String.valueOf(formato.format(calc)));
                    break;
                } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                    n = parseDouble(valor.getText().toString());
                    resultado.setText(String.valueOf(formato.format(n)));
                    break;
                }
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    }
}