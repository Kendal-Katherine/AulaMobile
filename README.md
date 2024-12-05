
# Projeto de App Mobile - Calculadora Simples

Este é um projeto de app Android simples que implementa uma calculadora para somar dois números. O projeto foi desenvolvido para fins de aprendizado e demonstra o uso básico de `EditText`, `Button` e manipulação de eventos no Android.

## Funcionalidades

- **Tela Principal**: O app permite que o usuário insira dois números e, ao pressionar o botão, exibe a soma dos dois.
- **Tela Secundária**: A segunda activity está configurada, mas ainda não está implementada.

## Tecnologias Usadas

- **Android Studio**: Ambiente de desenvolvimento integrado (IDE) para Android.
- **Java**: Linguagem de programação utilizada para a lógica do app.
- **Gradle**: Sistema de automação para construção e gerenciamento de dependências.

## Estrutura do Projeto

- **MainActivity**: Activity principal onde ocorre a interação do usuário. O usuário insere dois números e clica em um botão para calcular a soma.
- **MainActivity2**: Uma segunda activity configurada, que será utilizada em versões futuras do app.
- **Manifesto**: Arquivo de configuração do Android com informações sobre o app e suas activities.

### Principais Arquivos

1. **MainActivity.java**
   - Localização: `com.example.projeto.MainActivity`
   - Responsável por realizar a soma de dois números inseridos pelo usuário.

```java
package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText EditTextText;
    private EditText EditTextText2;
    private EditText EditTextText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditTextText = findViewById(R.id.editTextText);
        EditTextText2 = findViewById(R.id.editTextText2);
        EditTextText3 = findViewById(R.id.editTextText3);
    }

    public void click(View view) {
        int x, y, soma;
        x = Integer.parseInt(EditTextText.getText().toString());
        y = Integer.parseInt(EditTextText2.getText().toString());
        soma = x + y;
        EditTextText3.setText(Integer.toString(soma));
    }
}
```

2. **MainActivity2.java**
   - Localização: `com.example.projeto.MainActivity2`
   - Configuração para uma segunda tela (ainda sem funcionalidades implementadas).

```java
package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
```

3. **AndroidManifest.xml**
   - Configuração do app, incluindo as activities e a configuração da activity principal.

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Projeto"
        tools:targetApi="31">
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>
</manifest>
```

## Como Rodar o Projeto

1. **Clonar o Repositório**
   - Clone este repositório para o seu computador:
     ```bash
     git clone https://github.com/seu-usuario/nome-do-repositorio.git
     ```

2. **Abrir no Android Studio**
   - Abra o Android Studio e selecione a opção **Open**. Em seguida, escolha o diretório do projeto.

3. **Executar o Projeto**
   - Após a abertura do projeto, clique em **Run** para compilar e executar o aplicativo em um dispositivo Android ou emulador.

## Licença

Este projeto está sob a licença [MIT](LICENSE).
