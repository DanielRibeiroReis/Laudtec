package com.example.laudtec;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class mostraPDF extends AppCompatActivity {

    File arquivo ;
    PDFView pdfView;
    Button compartilha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_pdf);


        compartilha = findViewById(R.id.compartilhaPDF);
        pdfView = findViewById(R.id.pdfView);
        arquivo = new File("/storage/emulated/0/oioi.pdf");


        pdfView.fromFile(arquivo).load();

        compartilha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                Intent compartilha = new Intent(Intent.ACTION_SEND);
                compartilha.setType("application/pdf");
                compartilha.putExtra(Intent.EXTRA_STREAM, arquivo);
                compartilha.putExtra(Intent.EXTRA_SUBJECT,
                        "Sharing File...");
                compartilha.putExtra(Intent.EXTRA_TEXT, "Sharing File...");
                startActivity(Intent.createChooser(compartilha, "Share File"));
                */
                /*
                File outputFile = new File(Environment.getExternalStoragePublicDirectory
                        (Environment.DIRECTORY_DOWNLOADS), "/storage/emulated/0/oioi.pdf");


                 */
                //Uri uri = Uri.fromFile(arquivo);

                Uri uri = FileProvider.getUriForFile(
                        mostraPDF.this,
                        "com.example.homefolder.example.provider", //(use your app signature + ".provider" )
                        arquivo);



                Intent share = new Intent();
                share.setAction(Intent.ACTION_SEND);
                share.setType("application/pdf");
                share.putExtra(Intent.EXTRA_STREAM, uri);


                startActivity(Intent.createChooser(share, "Share File"));

            }
        });




    }
}