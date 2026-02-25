import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class TesteVisual extends JFrame {

    public TesteVisual() {
        // --- 1. CONFIGURAÇÕES DA JANELA ---
        setTitle("Sistema de Verificação Dark");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza na tela

        // --- 2. PAINEL PRINCIPAL (DARK MODE) ---
        JPanel painel = new JPanel();
        painel.setBackground(new Color(30, 30, 30)); // Cinza quase preto
        painel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;

        // --- 3. COMPONENTES ---
        JLabel label = new JLabel("Digite seu nome:");
        label.setForeground(new Color(200, 200, 200));
        label.setFont(new Font("Segoe UI", Font.BOLD, 16));
        gbc.gridy = 0;
        painel.add(label, gbc);

        JTextField campoNome = new JTextField(15);
        campoNome.setBackground(new Color(50, 50, 50));
        campoNome.setForeground(Color.WHITE);
        campoNome.setCaretColor(Color.WHITE); // Cursor branco
        campoNome.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 80)));
        campoNome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        gbc.gridy = 1;
        painel.add(campoNome, gbc);

        JButton botao = new JButton("VERIFICAR ✔");
        Color corPadrao = new Color(138, 43, 226); // Roxo
        Color corHover = new Color(160, 80, 255);  // Roxo claro
        
        botao.setBackground(corPadrao);
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setBorderPainted(false);
        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botao.setFont(new Font("Segoe UI", Font.BOLD, 14));
        gbc.gridy = 2;
        painel.add(botao, gbc);

        // --- 4. LÓGICA E EVENTOS ---
        
        // Efeito Hover no botão
        botao.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) { botao.setBackground(corHover); }
            public void mouseExited(MouseEvent e) { botao.setBackground(corPadrao); }
        });

        // Ação de clique do botão
        botao.addActionListener(e -> {
            String name = campoNome.getText();
            new Compare().verify(name);
            
            // Limpa o campo e foca novamente após a verificação
            campoNome.setText("");
            campoNome.requestFocus();
        });

        // ATALHO ENTER: Faz o Enter do teclado acionar o botão
        this.getRootPane().setDefaultButton(botao);

        add(painel);
    }

    // --- 5. O MÉTODO MAIN ---
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(() -> {
            new TesteVisual().setVisible(true);
        });
    }
}



/*import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TesteVisual extends JFrame {

    public TesteVisual() {
        setTitle("Meu Primeiro Programa Visual");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Digite seu nome:");
        JTextField campoNome = new JTextField(20);
        JButton botao = new JButton("Verificar");

        add(label);
        add(campoNome);
        add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = campoNome.getText();
                Compare comparador = new Compare();
                comparador.verify(name);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TesteVisual().setVisible(true);
        });
    }
}
*/

/*
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            msg("Digite seu nome: ");
            String name = read.nextLine();
            Compare comparador = new Compare();
            comparador.verify(name);
        }
    }
    
    public static void name(String sentence) {
        System.out.println(sentence);
    }

    public static void msg(String sentence) {
        System.out.print(sentence);
    }
}
*/