package resolucao;

import java.awt.Toolkit;
import java.awt.Dimension;

public class PegarResolucao {
    public static void main(String[] args){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        System.out.println("A resolução do seu monitor é:");
        System.out.println(screenSize);
    }
}
