package quest;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Environment;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.laudtec.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PDF extends AppCompatActivity {

    int larguraPagina = 1200; //criado para ser referenciado ao invés de escrever o numero
    int alturaPagina = 2010;
    int margemh = larguraPagina/14;
    int margemv = alturaPagina/14;
    int espaçoTexto24 = 32,espaçoTexto32=43;

    Bitmap logoLaudtec;

    public void criarPdf(){ // ajustar para o método receber os dados que precisa para fazer o pdf

        logoLaudtec = BitmapFactory.decodeResource(getResources(), R.drawable.logo3); // importa o logo para logoLaudtec


        PdfDocument myPdfDocument = new PdfDocument(); //setups para criar o pdf
        Paint paint = new Paint();

        //Cria pagina 1
        PdfDocument.PageInfo myPageInfo1 = new PdfDocument.PageInfo.Builder(larguraPagina,alturaPagina,1).create(); //
        PdfDocument.Page Pagina1 = myPdfDocument.startPage(myPageInfo1);
        Canvas canvas1 = Pagina1.getCanvas();

        //Logo centralzada

        canvas1.drawBitmap(logoLaudtec,(larguraPagina/2)-267,0,paint); //A largura da logo é 267, meio da tela - metade do tamanho da logo

        //Textos

        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(96);
        canvas1.drawText("tipo de laudo", larguraPagina/2,540,paint);
        canvas1.drawText("nome do edifício", larguraPagina/2,alturaPagina-540,paint);

        myPdfDocument.finishPage(Pagina1);
        //finaliza pagina 1

        PdfDocument.PageInfo myPageInfo2 = new PdfDocument.PageInfo.Builder(larguraPagina,alturaPagina,2).create(); //
        PdfDocument.Page Pagina2 = myPdfDocument.startPage(myPageInfo2);
        Canvas canvas2 = Pagina2.getCanvas();

        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTextSize(32);

        paint.setFakeBoldText(true);
        canvas2.drawText("INFORMAÇÕES GERAIS", margemh, espaçoTexto32 *3,paint);
        canvas2.drawText("1. Dados da edificações", margemh+32, espaçoTexto32 *6,paint);
        paint.setFakeBoldText(false);
        canvas2.drawText("Edificação:", margemh, espaçoTexto32 *7,paint);
        canvas2.drawText("Endereço da instalação:", margemh, espaçoTexto32 *8,paint);
        canvas2.drawText("Contratante:", margemh, espaçoTexto32 *9,paint);
        canvas2.drawText("CNPJ:", margemh, espaçoTexto32 *10,paint);
        canvas2.drawText("Contato:", margemh, espaçoTexto32 *11,paint);
        canvas2.drawText("Proprietário da obra:", margemh, espaçoTexto32 *12,paint);
        canvas2.drawText("Anotação de Responsabilidade Técnica (CREA):", margemh, espaçoTexto32 *13,paint);

        paint.setFakeBoldText(true);
        canvas2.drawText("2. Dados técnicos", margemh+32, espaçoTexto32 *16,paint);
        paint.setFakeBoldText(false);
        canvas2.drawText("Responsável técnico:", margemh, espaçoTexto32 *17,paint);
        canvas2.drawText("CREA:", margemh, espaçoTexto32 *18,paint);
        canvas2.drawText("Telefone:", margemh, espaçoTexto32 *19,paint);
        canvas2.drawText("E-mail:", margemh, espaçoTexto32 *20,paint);

        canvas2.drawText("Data da realização:", margemh, espaçoTexto32 *23,paint);
        canvas2.drawText("Condição climática:", margemh, espaçoTexto32 *24,paint);

        paint.setFakeBoldText(true);
        canvas2.drawText("3. Objetivos", margemh+32, espaçoTexto32 *27,paint);
        paint.setFakeBoldText(false);

        canvas2.drawText((String) getText(R.string.NBR54192000),0,50, margemh, espaçoTexto32 *28,paint);

        TextPaint mTextPaint=new TextPaint();
        StaticLayout mTextLayout = new StaticLayout(getText(R.string.NBR54192000),mTextPaint, margemh, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);

        mTextLayout.draw(canvas2);





        myPdfDocument.finishPage(Pagina2);







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
