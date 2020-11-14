package com.example.calculadorapdm20202;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Constante para salvamento/restauração de variáveis de instância
    private final String VALOR_VISOR_TV = "valor_visor_tv";
    private TextView visorTv;
    private Math math = new Math();

    //Constantes para solicitação de permissões
    private final int CONFIGURACOES_REQUEST_CODE = 1;

    // Constante para o envio de parâmetros para a ConfiguracoesActivity
    public static final String EXTRA_CONFIGURACOES = "EXTRA_CONFIGURACOES";

    //referência para os objetos Button definidos no layout
    private Configuracoes configuracoes = new Configuracoes(false);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(getString(R.string.app_name), "onCreate executado - iniciado ciclo completo");
        setContentView(R.layout.activity_main);

        visorTv = findViewById(R.id.visorTv);

        if (savedInstanceState != null)
            visorTv.setText(savedInstanceState.getString(VALOR_VISOR_TV, ""));

        getSupportActionBar().setSubtitle("Tela Principal");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(getString(R.string.app_name), "onStart executado - iniciado ciclo visível");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(getString(R.string.app_name), "onResume executado - iniciado ciclo em primeiro plano");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(getString(R.string.app_name), "onPause executado - finalizado ciclo em primeiro plano");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(getString(R.string.app_name), "onStop executado - finalizado ciclo visível");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(getString(R.string.app_name), "onRestart executado - Inicia o ciclo visível");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(getString(R.string.app_name), "onDestroy executado - finalizado ciclo completo");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v(getString(R.string.app_name), "onSaveInstanceState executado - salvando dados de instância");
        outState.putString(VALOR_VISOR_TV, visorTv.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.v(getString(R.string.app_name), "onRestoreInstanceState executado - Recuperando dados de instância");
        visorTv.setText(savedInstanceState.getString(VALOR_VISOR_TV, ""));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.configuracoesMi:
                Intent configuracoesIntent = new Intent(this, ConfiguracoesActivity.class);
                configuracoesIntent.putExtra(EXTRA_CONFIGURACOES, configuracoes);
                startActivityForResult(configuracoesIntent, CONFIGURACOES_REQUEST_CODE);
                return true;

            case R.id.sairMi:
                finish();
                return true;

            default:
                return false;
        }
    }

    public void onClick(View view){
        String str = "";
        switch (view.getId()){
            case R.id.zeroBt:
                visorTv.setText(
                        visorTv.getText().equals("0") || visorTv.getText().equals("Error!") ? getString(R.string.zero) : visorTv.getText() + getString(R.string.zero)
                );
                Log.v(getString(R.string.app_name), getString(R.string.zero));
                break;

            case R.id.umBt:
                visorTv.setText(
                        visorTv.getText().equals("0") || visorTv.getText().equals("Error!") ? getString(R.string.um) : visorTv.getText() + getString(R.string.um)
                );
                Log.v(getString(R.string.app_name), getString(R.string.um));
                break;

            case R.id.doisBt:
                visorTv.setText(
                        visorTv.getText().equals("0") || visorTv.getText().equals("Error!") ? getString(R.string.dois) : visorTv.getText() + getString(R.string.dois));
                Log.v(getString(R.string.app_name), getString(R.string.dois));
                break;

            case R.id.tresBt:
                visorTv.setText(
                        visorTv.getText().equals("0") || visorTv.getText().equals("Error!") ? getString(R.string.tres) : visorTv.getText() + getString(R.string.tres));
                Log.v(getString(R.string.app_name), getString(R.string.tres));
                break;

            case R.id.quatroBt:
                visorTv.setText(
                        visorTv.getText().equals("0") || visorTv.getText().equals("Error!") ? getString(R.string.quatro) : visorTv.getText() + getString(R.string.quatro));
                Log.v(getString(R.string.app_name), getString(R.string.quatro));
                break;

            case R.id.cincoBt:
                visorTv.setText(
                        visorTv.getText().equals("0") || visorTv.getText().equals("Error!") ? getString(R.string.cinco) : visorTv.getText() + getString(R.string.cinco));
                Log.v(getString(R.string.app_name), getString(R.string.cinco));
                break;

            case R.id.seisBt:
                visorTv.setText(
                        visorTv.getText().equals("0") || visorTv.getText().equals("Error!") ? getString(R.string.seis) : visorTv.getText() + getString(R.string.seis));
                Log.v(getString(R.string.app_name), getString(R.string.seis));
                break;

            case R.id.seteBt:
                visorTv.setText(
                        visorTv.getText().equals("0") || visorTv.getText().equals("Error!") ? getString(R.string.sete) : visorTv.getText() + getString(R.string.sete));
                Log.v(getString(R.string.app_name), getString(R.string.sete));
                break;

            case R.id.oitoBt:
                visorTv.setText(
                        visorTv.getText().equals("0") || visorTv.getText().equals("Error!") ? getString(R.string.oito) : visorTv.getText() + getString(R.string.oito));
                Log.v(getString(R.string.app_name), getString(R.string.oito));
                break;

            case R.id.noveBt:
                visorTv.setText(
                        (visorTv.getText().equals("0") && !math.hasCalc(visorTv.getText().toString())) || visorTv.getText().equals("Error!") ? getString(R.string.nove) : visorTv.getText() + getString(R.string.nove));
                Log.v(getString(R.string.app_name), getString(R.string.nove));
                break;

            case R.id.pontoBt:
                visorTv.setText(
                        (visorTv.getText().toString().contains(".") || visorTv.getText().equals("Error!")) && !math.hasCalc(visorTv.getText().toString()) ? visorTv.getText() : visorTv.getText() + getString(R.string.ponto));
                Log.v(getString(R.string.app_name), getString(R.string.ponto));
                break;

            case R.id.raizQuadradaBt:
                if (visorTv.getText().length() == 0) {
                    break;
                }
                if (math.hasCalc(visorTv.getText().toString()) || Double.parseDouble(visorTv.getText().toString()) == 0) {
                    break;
                }
                else {
                    str = math.calc(visorTv.getText().toString() + "raiz");
                    visorTv.setText(str);
                }
                Log.v(getString(R.string.app_name), getString(R.string.raiz_quadrada));
                break;

            case R.id.ExponeciacaoBT:
                if (visorTv.getText().length() == 0) {
                    break;
                }
                if (visorTv.getText().subSequence(visorTv.getText().length() - 1, visorTv.getText().length()).toString().equals(getString(R.string.Sinal_exponeciacao)) || math.hasCalc(visorTv.getText().toString()))
                    visorTv.setText(visorTv.getText());
                else {
                    str = math.calc(visorTv.getText().toString());
                    visorTv.setText( str.equals("Erro!") ? str : str + getString(R.string.Sinal_exponeciacao));
                }
                Log.v(getString(R.string.app_name), getString(R.string.Sinal_exponeciacao));
                break;

            case R.id.maisBt:
                Log.v(getString(R.string.app_name), visorTv.getText().length() + "");
                if (visorTv.getText().length() == 0) {
                    visorTv.setText("+");
                    break;
                }
                if (visorTv.getText().subSequence(visorTv.getText().length() - 1, visorTv.getText().length()).toString().equals(getString(R.string.mais)) || math.hasCalc(visorTv.getText().toString()))
                    visorTv.setText(visorTv.getText());
                else {
                    str = math.calc(visorTv.getText().toString());
                    visorTv.setText( str.equals("Erro!") ? str : str + "+");
                }
                Log.v(getString(R.string.app_name), getString(R.string.mais));
                break;

            case R.id.menosBt:
                if (visorTv.getText().length() == 0) {
                    visorTv.setText("-");
                    break;
                }
                if (visorTv.getText().subSequence(visorTv.getText().length() - 1, visorTv.getText().length()).toString().equals(getString(R.string.menos)) || math.hasCalc(visorTv.getText().toString()))
                    visorTv.setText(visorTv.getText());
                else {
                    str = math.calc(visorTv.getText().toString());
                    visorTv.setText( str.equals("Erro!") ? str : str + "-");
                }
                Log.v(getString(R.string.app_name), getString(R.string.menos));
                break;

            case R.id.vezesBt:
                if (visorTv.getText().length() == 0) {
                    break;
                }
                if (visorTv.getText().subSequence(visorTv.getText().length() - 1, visorTv.getText().length()).toString().equals(getString(R.string.vezes)) || math.hasCalc(visorTv.getText().toString()))
                    visorTv.setText(visorTv.getText());
                else{
                    str = math.calc(visorTv.getText().toString());
                    visorTv.setText( str.equals("Erro!") ? str : str + "*");
                }
                Log.v(getString(R.string.app_name), getString(R.string.vezes));
                break;

            case R.id.dividirBt:
                if (visorTv.getText().length() == 0) {
                    break;
                }
                if (visorTv.getText().subSequence(visorTv.getText().length() - 1, visorTv.getText().length()).toString().equals(getString(R.string.dividir)) || math.hasCalc(visorTv.getText().toString()))
                    visorTv.setText(visorTv.getText());
                else {
                    str = math.calc(visorTv.getText().toString());
                    visorTv.setText( str.equals("Erro!") ? str : str + "/");
                }
                Log.v(getString(R.string.app_name), getString(R.string.dividir));
                break;

            case R.id.igualBt:
                if (!visorTv.getText().equals(getString(R.string.zero)) && visorTv.getText().length() > 0 ) {
                    visorTv.setText(math.calc(visorTv.getText().toString()));
                } else
                    visorTv.setText(R.string.zero);
                Log.v(getString(R.string.app_name), getString(R.string.igual));
                break;

            case R.id.backspace:
                if (visorTv.getText().length() > 0) {
                    if (visorTv.getText().toString().equals("Infinito") || visorTv.getText().toString().equals("Erro!"))
                        visorTv.setText("0");
                    else
                        visorTv.setText(visorTv.getText().subSequence(0, visorTv.getText().length() - 1));
                    Log.v(getString(R.string.app_name), getString(R.string.backspace));
                }
                break;
            case R.id.limparBt:
                visorTv.setText("0");
                Log.v(getString(R.string.app_name),"Tela limpa.");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CONFIGURACOES_REQUEST_CODE && resultCode == RESULT_OK && data != null) {
            configuracoes = data.getParcelableExtra(EXTRA_CONFIGURACOES);
            if (configuracoes != null && configuracoes.getAvancada()) {
                findViewById(R.id.raizQuadradaBt).setVisibility(View.VISIBLE);
                findViewById(R.id.ExponeciacaoBT).setVisibility(View.VISIBLE);
            }
            else {
                findViewById(R.id.raizQuadradaBt).setVisibility(View.GONE);
                findViewById(R.id.ExponeciacaoBT).setVisibility(View.GONE);
            }
        }
    }
}