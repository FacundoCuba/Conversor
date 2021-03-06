package com.example.facu.conversor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import static android.widget.TextView.BufferType.EDITABLE;
import static java.lang.Double.parseDouble;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner unidadesIniciales = findViewById(R.id.spUnidadInicial);
        unidadesIniciales.setOnItemSelectedListener(this);
        Spinner unidadesFinales = findViewById(R.id.spUnidadFinal);
        unidadesFinales.setOnItemSelectedListener(this);
        EditText valor = findViewById(R.id.txtValorInicial);
        valor.setText("0.0", EDITABLE);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Spinner unidadesIniciales = findViewById(R.id.spUnidadInicial);
        EditText valor = findViewById(R.id.txtValorInicial);
        Spinner unidadesFinales = findViewById(R.id.spUnidadFinal);
        TextView resultado = findViewById(R.id.txtResultado);
        NumberFormat formato = new DecimalFormat("##0.###E0");
        Double n = parseDouble(valor.getText().toString());
        switch (parent.getId()) {
            case R.id.spUnidadInicial:
                switch (position) {
                    case 0:
                        if (unidadesFinales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format(n * 1000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format(n * 100000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format(n * 1.6)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format(n * 1.6 * 1760)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format(n * 1.6 * 5280)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format(n * 1.6 * 63360)));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (unidadesFinales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 1000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format(n * 100)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format((n / 1000) * 1.6)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format((n / 1000) * 1.6 * 1760)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format((n / 1000) * 1.6 * 5280)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format((n / 1000) * 1.6 * 63360)));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (unidadesFinales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 100000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format(n / 100)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                            n = parseDouble(valor.getText().toString());
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format((n / 100000) * 1.6)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format((n / 100000) * 1.6 * 1760)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format((n / 100000) * 1.6 * 5280)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format((n / 100000) * 1.6 * 63360)));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (unidadesFinales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 1.6)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format((n / 1.6) * 1000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format((n / 1.6) * 100000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format(n * 1760)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format(n * 5280)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format(n * 63360)));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (unidadesFinales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 1760 / 1.6)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format((n / 1760 / 1.6) * 1000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format((n / 1760 / 1.6) * 100000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format(n / 1760)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format(n * 3)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format(n * 36)));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (unidadesFinales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 5280 / 1.6)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format((n / 5280 / 1.6) * 1000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format((n / 5280 / 1.6) * 100000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format(n / 5280)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format(n / 3)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format(n * 12)));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (unidadesFinales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 63360 / 1.6)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format((n / 63360 / 1.6) * 1000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format((n / 63360 / 1.6) * 100000)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format(n / 63360)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format(n / 5280)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format(n / 12)));
                            break;
                        } else if (unidadesFinales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else {
                            break;
                        }
                }
            case R.id.spUnidadFinal:
                switch (position) {
                    case 0:
                        if (unidadesIniciales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format(n * 1000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format(n * 100000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format(n * 1.6)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format(n * 1.6 * 1760)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format(n * 1.6 * 5280)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format(n * 1.6 * 63360)));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (unidadesIniciales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 1000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format(n * 100)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format((n / 1000) * 1.6)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format((n / 1000) * 1.6 * 1760)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format((n / 1000) * 1.6 * 5280)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format((n / 1000) * 1.6 * 63360)));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (unidadesIniciales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 100000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format(n / 100)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 2) {
                            n = parseDouble(valor.getText().toString());
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format((n / 100000) * 1.6)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format((n / 100000) * 1.6 * 1760)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format((n / 100000) * 1.6 * 5280)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format((n / 100000) * 1.6 * 63360)));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (unidadesIniciales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 1.6)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format((n / 1.6) * 1000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format((n / 1.6) * 100000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format(n * 1760)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format(n * 5280)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format(n * 63360)));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (unidadesIniciales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 1760 / 1.6)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format((n / 1760 / 1.6) * 1000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format((n / 1760 / 1.6) * 100000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format(n / 1760)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format(n * 3)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format(n * 36)));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (unidadesIniciales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 5280 / 1.6)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format((n / 5280 / 1.6) * 1000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format((n / 5280 / 1.6) * 100000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format(n / 5280)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format(n / 3)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format(n * 12)));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (unidadesIniciales.getSelectedItemPosition() == 0) {
                            resultado.setText(String.valueOf(formato.format(n / 63360 / 1.6)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 1) {
                            resultado.setText(String.valueOf(formato.format((n / 63360 / 1.6) * 1000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 2) {
                            resultado.setText(String.valueOf(formato.format((n / 63360 / 1.6) * 100000)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 3) {
                            resultado.setText(String.valueOf(formato.format(n / 63360)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 4) {
                            resultado.setText(String.valueOf(formato.format(n / 5280)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 5) {
                            resultado.setText(String.valueOf(formato.format(n / 12)));
                            break;
                        } else if (unidadesIniciales.getSelectedItemPosition() == 6) {
                            resultado.setText(String.valueOf(formato.format(n * 1)));
                            break;
                        } else {
                            break;
                        }
                }
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this, "No ha seleccionado ninguna opcion", Toast.LENGTH_LONG).show();
    }
}