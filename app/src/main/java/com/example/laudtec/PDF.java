package com.example.laudtec;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Environment;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PDF extends AppCompatActivity {

    int larguraPagina = 1200; //criado para ser referenciado ao invés de escrever o numero
    int alturaPagina = 2010;

    Bitmap logoLaudtec;





    public void criarPdf(){ // ajustar para o método receber os dados que precisa para fazer o pdf

        logoLaudtec = BitmapFactory.decodeResource(getResources(),R.drawable.logo3); // importa o logo para logoLaudtec

        PdfDocument myPdfDocument = new PdfDocument(); //setups para criar o pdf
        Paint paint = new Paint();

        PdfDocument.PageInfo myPageInfo1 = new PdfDocument.PageInfo.Builder(larguraPagina,alturaPagina,1).create(); //
        PdfDocument.Page Pagina1 = myPdfDocument.startPage(myPageInfo1);

        Canvas canvas = Pagina1.getCanvas();

        //Logo centralzada

        canvas.drawBitmap(logoLaudtec,(larguraPagina/2)-267,0,paint); //A largura da logo é 267, meio da tela - metade do tamanho da logo

        //Textos

        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(70);
        //canvas.drawText(campo1.getText().toString(), larguraPagina/2,540,myPaint);
        //canvas.drawText(campo2.getText().toString(), larguraPagina/2,680,myPaint);

        myPdfDocument.finishPage(Pagina1);


        //diretório pra onde será salvo o pdf
        //alterar para salvar com a data e nome do cliente
        //adicionar para pdf ser enviado para o app que escolher depois que salvo
        File file = new File(Environment.getExternalStorageDirectory(), "oioi.pdf");
        try {
            myPdfDocument.writeTo(new FileOutputStream(file));
            Toast.makeText(PDF.this, "gerado", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        myPdfDocument.close();

    }


}
