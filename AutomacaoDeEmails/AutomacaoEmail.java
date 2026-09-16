package AutomacaoDeEmails;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.InputEvent;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class AutomacaoEmail {

    public static void main(String[] args) throws AWTException {
        Robot robo = new Robot();

        System.out.println("Selecione o navegador. Você tem 3 segundos");
        robo.delay(3000);


        //Abre uma nova ava: Crtl + T
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_T);
        robo.keyRelease(KeyEvent.VK_T);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        System.out.println("Nova aba aberta!");


        // Pequena espera entre uma ação e outra
        robo.delay(500);


        // Seleciona a barra de endereços: Ctrl + L
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_L);
        robo.keyPress(KeyEvent.VK_L);
        robo.keyPress(KeyEvent.VK_CONTROL);

        System.out.println("Barra de endereços selecionada!");

        // Copia o endereço
        String endereco = "https://outlook.live.com/mail/";

        StringSelection textoCopiado = new StringSelection(endereco);

        Toolkit.getDefaultToolkit()
                .getSystemClipboard()
                .setContents(textoCopiado, null);

        System.out.println("Endereço copiado!");

        // Cola o endereço
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
        robo.keyPress(KeyEvent.VK_V);
        robo.keyPress(KeyEvent.VK_CONTROL);

        robo.delay(500);

        robo.keyPress(KeyEvent.VK_ENTER);
        robo.keyPress(KeyEvent.VK_ENTER);

        System.out.println("Coloque o mouse sobre o botão Novo email");
        System.out.println("Você tem 5 segundos");

        robo.delay(5000);

        Point posicao = MouseInfo.getPointerInfo().getLocation();

        System.out.println("Posição X: " + posicao.x);
        System.out.println("Posição Y: " + posicao.y);

        int botaoNovoEmailX = 1576;
        int botaoNovoEmailY = 574;

        robo.mouseMove(botaoNovoEmailX, botaoNovoEmailY);
        robo.delay(500);

        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robo.delay(2000);

        //Cria a classe destinatario

        String destinatario = "rafael.silvaj85@@gmail.com";

        StringSelection destinatarioCopiado =
                new StringSelection(destinatario);

        Toolkit.getDefaultToolkit()
                .getSystemClipboard()
                .setContents(destinatarioCopiado, null);

        // cola o destinatario
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_CONTROL);

        robo.delay(500);

        // Pressiona Tab para avançar

        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);

        robo.delay(500);

        String assunto = "Relatório de vendas";

        StringSelection assuntoCopiado =
                new StringSelection(assunto);

        Toolkit.getDefaultToolkit()
                .getSystemClipboard()
                .setContents(assuntoCopiado, null);

// Cola o assunto
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_CONTROL);

        robo.delay(500);

// Avança para o corpo do email
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);



    }

}